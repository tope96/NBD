db.people.mapReduce(
    function emits(){
        if (this.nationality == "Poland" && this.sex == "Female") {
            for(var i=0;i<this.credit.length;i++){
                emit(this.credit[i].currency, {balance:this.credit[i].balance, count:1});
            }
        }
    },
    function reduce(key, value){
        var result = {balance: 0, count: 0}

            for(var i = 0; i<value.length; i++){
                result.count += value[i].count;
                result.balance += value[i].balance;                
            }
        return result;
    },{
        out: "balance",
        finalize: function maths(key, value){
            var balance = {avgBalance: 0, total: 0}

            balance.avgBalance = value.balance/value.count,
            balance.total = value.balance

            return balance
        }
    }
)

printjson(db.balance.find().toArray())
db.people.mapReduce(
    function emits(){
        this.credit.forEach(function(e) {
            emit(e.currency, e.balance);
        });
    },
    function sums(key, value){
        return Array.sum(value)
    },{
        out: "sums"
    }
);

printjson(db.sums.find().toArray())
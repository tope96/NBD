db.people.mapReduce(
    function emits() {
        emit(this.sex, {totalHeight: this.height, totalWeight: this.weight, count: 1})
    },
    function sums(key, values) {
        sum = {totalWeight: 0, totalHeight: 0, count: 0}
        values.forEach(function (val) {
            sum.totalWeight += val.totalWeight;
            sum.totalHeight += val.totalHeight;
            sum.count += val.count;
        });
        return sum
    }, {
        out: "averages",
        finalize: function average(key, val) {
            averages = {avgWeight: 0, avgHeight: 0}
             
            averages.avgWeight = val.totalWeight / val.count,
            averages.avgHeight = val.totalHeight / val.count
            return averages;
        }
    }
);

printjson(db.averages.find().toArray())
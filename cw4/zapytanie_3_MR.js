db.people.mapReduce(
    function emits(){
        emit(this.job, null)
    },
    function reduce(){},{
        out: "jobs"
    }
);

printjson(db.jobs.find({}, {value: null}).toArray())
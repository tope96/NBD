db.people.mapReduce( 
   function emits(){
    emit(this.nationality, {BMI: [(this.weight / ((this.height / 100) * (this.height / 100)))], count: 1});
   }, 
   function reduce(key, value){
    bmis = { BMI:[], count:0};
    for (var i = 0; i < value.length; i++){
          bmis.BMI = bmis.BMI.concat(value[i].BMI)
          bmis.count += value[i].count;
    };
    return bmis;
   },
   { 
		out: "bmi",
		finalize: function maths(key, value){
            let sum = 0
            let min = value.BMI[0]
            let max = min;
            let bmis = {avgBMI: 0, minBMI:0, maxBMI: 0}

            for(var i = 0; i <value.BMI.length; i++){
                sum += value.BMI[i];

                if (value.BMI[i] < min){
                    min = value.BMI[i];
                }else if (value.BMI[i] > max){
                    max = value.BMI[i];
                }
            }

            bmis.avgBMI = sum / value.count
            bmis.minBMI = min
            bmis.maxBMI = max

            return bmis
        }
   }
);

printjson(db.bmi.find().toArray())
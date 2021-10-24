var mapFunction1 = function() {
	var bmi = parseFloat(this.weight)/(parseFloat(this.height)*parseFloat(this.height));
   emit(this.nationality, bmi);
};



var reduceFunction1= function(keyCustId, valuesWeights) {
   return Array.avg(valuesWeights);
};


db.people.mapReduce(
   mapFunction1,
   reduceFunction1,
   { out: "AVG_BMI" }
)

printjson(db.AVG_BMI.find().sort( { _id: 1 } ).toArray())



var mapFunction1 = function() {
	var bmi = parseFloat(this.weight)/(parseFloat(this.height)*parseFloat(this.height));
   emit(this.nationality, bmi);
};


var reduce_min = function(key, values) {
    var min = values[0];
    values.forEach(function(val) {
        if (val < min) min = val;
    })
    return min;
};

db.people.mapReduce(
   mapFunction1,
   reduce_min,
   { out: "MIN_BMI" }
)

printjson(db.MIN_BMI.find().sort( { _id: 1 } ).toArray())




var mapFunction1 = function() {
	var bmi = parseFloat(this.weight)/(parseFloat(this.height)*parseFloat(this.height));
   emit(this.nationality, bmi);
};

var reduce_max = function(key, values) {
    var max = values[0];
    values.forEach(function(val){
        if (val > max) max = val;
    })
    return max;
}


db.people.mapReduce(
   mapFunction1,
   reduce_max,
   { out: "MAX_BMI" }
)

printjson(db.MAX_BMI.find().sort( { _id: 1 } ).toArray())




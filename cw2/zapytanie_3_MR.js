var mapFunction1 = function() {
   emit(this.job, 1);
};



var reduceFunction1= function(keyCustId, valuesWeights) {
   return Array.avg(valuesWeights);
};


db.people.mapReduce(
   mapFunction1,
   reduceFunction1,
   { out: "map_reduce_example" }
)

printjson(db.map_reduce_example.find().sort( { "job": 1 } ).toArray())



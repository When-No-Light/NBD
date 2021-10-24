
var mapFunction1 = function() {
   emit(this.sex, parseFloat(this.weight));
};



var reduceFunction1= function(keyCustId, valuesWeights) {
   return Array.avg(valuesWeights);
};


db.people.mapReduce(
   mapFunction1,
   reduceFunction1,
   { out: "map_reduce_example" }
)

printjson(db.map_reduce_example.find().sort( { _id: 1 } ).toArray())

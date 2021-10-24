
var mapFunction1 = function() {
   this.credit.forEach(function(item){ emit(item.currency, parseFloat(item.balance)); });
};


var reduceFunction1= function(keyCustId, valuesWeights) {
   return Array.sum(valuesWeights);
};


db.people.mapReduce(
   mapFunction1,
   reduceFunction1,
   { out: "map_reduce_example" }
)

printjson(db.map_reduce_example.find().sort( { _id: 1 } ).toArray())


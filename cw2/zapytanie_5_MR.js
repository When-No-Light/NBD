var mapFunction1 = function() {
if (this.sex == "Female" && this.nationality =="Poland") this.credit.forEach(function(item){ emit(item.currency, parseFloat(item.balance)); });
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


print("Zadanie 5 srednia ilosc kosztow na kartach kredytowych")

var mapFunction1 = function() {
if (this.sex == "Female" && this.nationality =="Poland") this.credit.forEach(function(item){ emit(item.currency, parseFloat(item.balance)); });
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


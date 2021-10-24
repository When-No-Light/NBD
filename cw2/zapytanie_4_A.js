
printjson(db.people.aggregate(
   [
     { $project: { nationality: "$nationality", total: 
     { $divide: [ {"$toDouble": "$weight" }, { $multiply: [ {"$toDouble": "$height" }, {"$toDouble": "$height" } ] } ] 
     } } }, { $group: { _id: "$nationality", avarage_BMI: { $avg:  "$total" }, min_BMI: { $min:  "$total" }, max_BMI: { $max:  "$total" }  } }
   ]
).toArray())



printjson(db.people.aggregate( [ { $match: {nationality: "Poland", sex:"Female"}}, { $unwind : "$credit" }, { $group: { _id: "$credit.currency", credit_sum: { $sum: {"$toDouble":"$credit.balance"}}, credit_avg: { $avg: {"$toDouble":"$credit.balance"}   }} } ] ).toArray())


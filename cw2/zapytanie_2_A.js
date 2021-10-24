printjson(db.people.aggregate( [ { $unwind : "$credit" }, { $group: { _id: "$credit.currency", credit_sum: { $sum: {"$toDouble":"$credit.balance"}  }} } ] ).toArray())

printjson(db.people.find({ $and: [ { weight: { $lt: "71.5" } }, { weight: { $gt: "68" } } ] }).toArray())

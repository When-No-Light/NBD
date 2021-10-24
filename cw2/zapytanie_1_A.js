printjson(db.people.aggregate([{ $match: {}}, { $group: { _id: "$sex", avarage_weight: { $avg: {"$toDouble": "$weight" }} } }]).toArray())

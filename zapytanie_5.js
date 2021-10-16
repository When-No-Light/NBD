printjson(db.people.find( {"birth_date" : {"$gt": "2000"}},{first_name:1, last_name:1, "location.city":1}).toArray())

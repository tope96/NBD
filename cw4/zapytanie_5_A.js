printjson(db.people.aggregate({
    $unwind: "$credit"
}, {
    $match: {
        "nationality": "Poland",
        "sex": "Female"
    }
}, {
    $group: {
        _id: "$credit.currency",
        avgBalance: {
            $avg: {
                $toDouble: "$credit.balance"
            }
        },
        sumBalance: {
            $sum: {
                $toDouble: "$credit.balance"
            }
        }
    }
}).toArray())
printjson(db.people.insertOne({
    sex: "Male",
    first_name: "Tomasz",
    last_name: "Pietrzak",
    job: "Programmer",
    email: "s13696@pjwstk.edu.pl",
    location: {
        city: "Bydgoszcz",
        address: {
            streetname: "Bydgoszczowa",
            streetnumber: "1"
        }
    },
    description: "Excercise 6",
    height: "170",
    weight: "60",
    birth_date: "1996-06-21T00:00:00Z",
    nationality: "Poland",
    credit: [{
        type: "jcb",
        number: "666666666666",
        currency: "EUR",
        balance: "200000"
    }]
}))
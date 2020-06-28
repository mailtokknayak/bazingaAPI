# bazingaAPI

Technical Information

springboot
mongoDB


use this post request  url to add all products 
http://localhost:8080/api/v1/addProducts

payload = 
[
    {
        "id": 1,
        "title": "The Streets  T-Shirt",
        "description": "Born On The Streets",
        "availableSizes": [
            "XL"
        ],
        "price": 25,
        "isFreeShipping": "false",
        "imageId": "p1"
    },
    {
        "id": 2,
        "title": "Short Sleeve T-Shirt",
        "description": "Tso 3D Short Sleeve",
        "availableSizes": [
            "X",
            "L",
            "XL"
        ],
        "price": 10,
        "isFreeShipping": "false",
        "imageId": "p2"
    },
    {
        "id": 3,
        "title": "Cinza Grey T-Shirt",
        "description": "Man Tie Dye Cinza Grey",
        "availableSizes": [
            "XL",
            "XXL"
        ],
        "price": 49,
        "isFreeShipping": "false",
        "imageId": "p3"
    },
    {
        "id": 4,
        "title": "Crazy Monkey Black T-Shirt",
        "description": "1977 Infantil",
        "availableSizes": [
            "S"
        ],
        "price": 22,
        "isFreeShipping": "true",
        "imageId": "p4"
    }
]

''' Tested on Python 3.8.2 '''
import riak

client = riak.RiakClient()
bucket = client.bucket('cars')

def main():
    print("CREATED:")
    createNewCar("mitsubishi", "red")
    car1 = bucket.get('cars')
    print(car1.data)
    print()

    print("MODIFIED:")
    car1.data['brand'] = 'Opel'
    car1.store()
    modifiedCar = bucket.get('cars')
    print(modifiedCar.data)
    print()

    print("DELETED:")
    modifiedCar.delete()
    print(modifiedCar.data)

def createNewCar(brand, color):
    car = bucket.new('cars', data={
        'brand': brand,
        'color': color
    })

    car.store()

if __name__ == "__main__":
    main()
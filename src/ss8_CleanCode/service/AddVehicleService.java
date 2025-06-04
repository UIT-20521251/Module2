package ss8_CleanCode.service;

import ss8_CleanCode.entity.Car;
import ss8_CleanCode.entity.Motorbike;
import ss8_CleanCode.entity.Truck;
import ss8_CleanCode.repository.CarRepository;
import ss8_CleanCode.repository.MotorbikeRepository;
import ss8_CleanCode.repository.TruckRepository;

public class AddVehicleService implements AddVehicleInterface {
    CarRepository cars = new CarRepository();
    MotorbikeRepository motorbikes = new MotorbikeRepository();
    TruckRepository trucks = new TruckRepository();
    VehicleValidator vehicleValidator = new VehicleValidator();

    @Override
    public void addCar(String licensePlate, String brandName, int productionYear, String owner,
                       int numberOfSeats, String carType) {
//        vehicleValidator.isValidPlate(licensePlate);
//        vehicleValidator.isValidYear(productionYear);
//        vehicleValidator.isValidSeat(numberOfSeats);
//        vehicleValidator.isValidVehicleType(carType);
        Car car =new Car(licensePlate,brandName,productionYear,owner,numberOfSeats,carType);
        cars.add(car);
    }

    @Override
    public void addTruck(String licensePlate, String brandName, int productionYear, String owner,
                         int loadCapacity) {
        Truck truck = new Truck(licensePlate,brandName,productionYear,owner,loadCapacity);
        trucks.add(truck);
    }

    @Override
    public void addMotorbike(String licensePlate, String brandName, int productionYear, String owner,
                            int horsepower) {
        Motorbike motorbike= new Motorbike(licensePlate,brandName,productionYear,owner,horsepower);
        motorbikes.add(motorbike);
    }
}

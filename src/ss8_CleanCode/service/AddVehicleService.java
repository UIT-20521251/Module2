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
    public void addCar(Car car) {
//        vehicleValidator.isValidPlate(licensePlate);
//        vehicleValidator.isValidYear(productionYear);
//        vehicleValidator.isValidSeat(numberOfSeats);
//        vehicleValidator.isValidVehicleType(carType);
        cars.add(car);
    }

    @Override
    public void addTruck(Truck truck) {
        trucks.add(truck);
    }

    @Override
    public void addMotorbike(Motorbike motorbike) {
        motorbikes.add(motorbike);
    }
}

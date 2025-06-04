package ss8_CleanCode.service;

import java.time.Year;

public class VehicleValidator {
    public boolean isValidPlate(String plate) {
        return plate.matches("\\d{2}[A-Z]-\\d{3}\\.\\d{2}");
    }

    public boolean isValidYear(int year) {
        int currentYear = Year.now().getValue();
        return year >= 1900 && year <= currentYear;
    }

    public boolean isValidSeat(int seats) {
        return seats > 0;
    }
    public boolean isValidLoadCapacity(int loadCapacity) {
        return loadCapacity > 0;
    }
    public boolean isValidHorsepower(int horsepower) {
        return horsepower > 0;
    }

    public boolean isValidVehicleType(String type) {
        String normalized = type.trim().toLowerCase();
        return normalized.equals("du lịch") || normalized.equals("xe khách") || normalized.equals("dịch vụ");
    }
}

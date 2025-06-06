package ss8_CleanCode.view;

import ss8_CleanCode.entity.Brand;
import ss8_CleanCode.entity.Car;
import ss8_CleanCode.entity.Motorbike;
import ss8_CleanCode.entity.Truck;
import ss8_CleanCode.service.BrandInterface;
import ss8_CleanCode.service.BrandService;

import java.util.List;
import java.util.Scanner;

public class AddVehicleView {
    private static BrandInterface brandService = new BrandService();

    public static int addVehicleMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Thêm mới phương tiện: ");
        System.out.println("1. Thêm xe tải,");
        System.out.println("2. Thêm ôtô, ");
        System.out.println("3. Thêm  xe máy.");
        System.out.print("Mời bạn nhập lựa chọn: ");
        return Integer.parseInt(scanner.nextLine());
    }
    public static Car addCarMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Thêm mới ôtô: ");
        System.out.print("Biển kiểm soát (vd: 43A-123.45): ");
        String licensePlate = scanner.nextLine();
        System.out.print("Hãng sản xuất: ");
        String brandCode = scanner.nextLine();
        Brand brand = brandService.findBrandByCode(brandCode);
        System.out.print("Năm sản xuất: ");
        int productionYear = Integer.parseInt(scanner.nextLine());
        System.out.print("Chủ sở hữu: ");
        String owner = scanner.nextLine();
        System.out.print("Số chổ ngồi: ");
        int numberOfSeats = Integer.parseInt(scanner.nextLine());
        System.out.print("Kiểu xe: ");
        String carType = scanner.nextLine();
        return new Car(licensePlate, brand, productionYear, owner,numberOfSeats, carType);
    }
    public static Motorbike addMotorbikeMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Thêm mới xe máy: ");
        System.out.print("Biển kiểm soát (vd: 43A-123.45): ");
        String licensePlate = scanner.nextLine();
        System.out.print("Hãng sản xuất: ");
        String brandCode = scanner.nextLine();
        Brand brand = brandService.findBrandByCode(brandCode);
        System.out.print("Năm sản xuất: ");
        int productionYear = Integer.parseInt(scanner.nextLine());
        System.out.print("Chủ sở hữu: ");
        String owner = scanner.nextLine();
        System.out.print("Công suất: ");
        int horsepower = Integer.parseInt(scanner.nextLine());
        return new Motorbike(licensePlate, brand, productionYear, owner,horsepower);
    }
    public static Truck addTruckMenu(List<Brand> brandList) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Thêm mới ôtô: ");
        System.out.print("Biển kiểm soát (vd: 43A-123.45): ");
        String licensePlate = scanner.nextLine();
        String brandCode = inputBrand(brandList);
        Brand brand = brandService.findBrandByCode(brandCode);
        System.out.print("Năm sản xuất: ");
        int productionYear = Integer.parseInt(scanner.nextLine());
        System.out.print("Chủ sở hữu: ");
        String owner = scanner.nextLine();
        System.out.print("Tải trọng: ");
        int loadCapacity = Integer.parseInt(scanner.nextLine());
        return new Truck(licensePlate, brand, productionYear, owner, loadCapacity);
    }

    public static String inputBrand(List<Brand> brands) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hãng sản xuất: ");
        for (Brand brand : brands) {
            System.out.println(brand.toString());
        }
        System.out.print("Hãng xe của bạn (Nhập mã hãng sản xuất): ");
        return scanner.nextLine();
    }
}

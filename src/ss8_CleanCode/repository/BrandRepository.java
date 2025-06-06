package ss8_CleanCode.repository;

import ss8_CleanCode.entity.Brand;

import java.util.ArrayList;
import java.util.List;

public class BrandRepository {
    private static List<Brand> brands= new ArrayList<>();
    static {
        brands.add(new Brand("HSX-001", "Yamaha", "Nhật Bản"));
        brands.add(new Brand("HSX-002", "Honda", "Nhật Bản"));
        brands.add(new Brand("HSX-003", "Dongfeng", "Trung Quốc"));
        brands.add(new Brand("HSX-004", "Huyndai", "Hàn Quốc"));
        brands.add(new Brand("HSX-005", "Ford", "Mỹ"));
        brands.add(new Brand("HSX-006", "Toyota", "Nhật Bản"));
        brands.add(new Brand("HSX-007", "Hino", "Nhật Bản"));
    }

    public List<Brand> getBrands() {
        return brands;
    }
}

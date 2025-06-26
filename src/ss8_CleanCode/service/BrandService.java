package ss8_CleanCode.service;

import ss8_CleanCode.entity.Brand;
import ss8_CleanCode.repository.BrandRepository;

import java.util.List;

public class BrandService implements BrandServiceInterface {
    private BrandRepository brandRepository = new BrandRepository();
    @Override
    public Brand findBrandByCode(String brandCode) {
        for (Brand brand : brandRepository.getBrands()) {
            if (brand.getBrandCode().equals(brandCode)) {
                return brand;
            }
        }
        return null;
    }

    @Override
    public List<Brand> getBrandList() {
        return brandRepository.getBrands();
    }
    @Override
    public Brand findBrandByName(String brandName) {
        for (Brand brand : brandRepository.getBrands()) {
            if (brand.getBrandName().equals(brandName)) {
                return brand;
            }
        }
        return null;
    }
}

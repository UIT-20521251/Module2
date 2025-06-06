package ss8_CleanCode.service;

import ss8_CleanCode.entity.Brand;
import ss8_CleanCode.repository.BrandRepository;

import java.util.List;

public class BrandService implements BrandInterface{
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
}

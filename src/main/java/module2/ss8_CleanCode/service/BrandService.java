package module2.ss8_CleanCode.service;

import module2.ss8_CleanCode.entity.Brand;
import module2.ss8_CleanCode.repository.BrandRepoInterface;
import module2.ss8_CleanCode.repository.BrandRepository;

import java.util.List;

public class BrandService implements BrandServiceInterface {
    private BrandRepoInterface brandRepository = new BrandRepository();
    @Override
    public Brand findBrandById(int id) {
        for (Brand brand : brandRepository.getBrands()) {
            if (brand.getId()==id) {
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

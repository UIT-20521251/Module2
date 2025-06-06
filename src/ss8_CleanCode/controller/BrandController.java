package ss8_CleanCode.controller;

import ss8_CleanCode.entity.Brand;
import ss8_CleanCode.repository.BrandRepository;
import ss8_CleanCode.service.BrandInterface;
import ss8_CleanCode.service.BrandService;

import java.util.List;

public class BrandController {
    private BrandInterface brandService = new BrandService();

    public List<Brand> showAllBrands(){
        return brandService.getBrandList();
    }
    public Brand findBrandByCode(String brandCode){
        return brandService.findBrandByCode(brandCode);
    }
}

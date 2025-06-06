package ss8_CleanCode.service;

import ss8_CleanCode.entity.Brand;

import java.util.List;

public interface BrandInterface {
    public List<Brand> getBrandList();
    public Brand findBrandByCode(String brandCode);
}

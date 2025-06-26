package ss8_CleanCode.service;

import ss8_CleanCode.entity.Brand;

import java.util.List;

public interface BrandServiceInterface {
     List<Brand> getBrandList();
     Brand findBrandById(int id);
     Brand findBrandByName(String brandName);
}

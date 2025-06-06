package ss8_CleanCode.entity;

public class Brand {
    private String BrandCode;
    private String BrandName;
    private String Country;

    public Brand(String brandCode, String brandName, String country) {
        this.BrandCode = brandCode;
        this.BrandName = brandName;
        this.Country = country;
    }

    public String getBrandName() {
        return BrandName;
    }

    public String getBrandCode() {
        return BrandCode;
    }

    public String getCountry() {
        return Country;
    }

    public void setBrandCode(String brandCode) {
        BrandCode = brandCode;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public void setBrandName(String brandName) {
        this.BrandName = brandName;
    }
    @Override
    public String toString() {
        return BrandCode + ", " + BrandName + ", " + Country;
    }
}

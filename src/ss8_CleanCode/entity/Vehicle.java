package ss8_CleanCode.entity;

public abstract class Vehicle {
    protected String licensePlate;
    protected String brandName;
    protected int productionYear;
    protected String owner;

    public Vehicle(String licensePlate, String manufacturerName, int productionYear, String owner) {
        this.licensePlate = licensePlate;
        this.brandName = manufacturerName;
        this.productionYear = productionYear;
        this.owner = owner;
    }
    public String getLicensePlate() {
        return licensePlate;
    }

    public String getOwner() {
        return owner;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }
}

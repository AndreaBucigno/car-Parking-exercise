public class vehicles {
    private String plate;
    private int productionYear;
    private String model;
    private String  brand;
    int spaceOccupied;

    public vehicles(String plate, String brand, String model, int productionYear,int spaceOccupied) {
        this.plate = plate;
        this.brand = brand;
        this.model = model;
        this.productionYear = productionYear;
        this.spaceOccupied=spaceOccupied;
    }

    public int getSpaceOccupied() {
        return spaceOccupied;
    }

    public void setSpaceOccupied(int spaceOccupied) {
        this.spaceOccupied = spaceOccupied;
    }

    public String getPlate(){
        return plate;
    }

    public void setPlate(String plate){
        this.plate=plate;
    }

    public String getModel(){
        return model;
    }

    public int getProductionYear(){
        return productionYear;
    }

    public void setProductionYear(int productionYear){
        this.productionYear=productionYear;
    }

    public String getBrand(){
        return brand;
    }

    public void setBrand(String brand){
        this.brand=brand;
    }

    public void setModel(String brand){
        this.brand=brand;
    }

    public void printVehicle() {
        System.out.println("Brand: " + getBrand() +
                ", Model: " + getModel() +
                ", Plate: " + getPlate() +
                ", Production Year: " + getProductionYear());
    }


}
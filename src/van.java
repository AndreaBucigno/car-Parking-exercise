//
public class van extends vehicles{

    private float capacity;

    public van(String plate, String brand, String model, int productionYear, float capacity){
        super(plate, brand, model, productionYear,2);
        this.capacity=capacity;
    }

    public void setCapacity(float capacity1){
        capacity = capacity1;
    }

    public float getCapacity(){
        return capacity;

    }

    @Override
    public void printVehicle() {
        super.printVehicle();
        System.out.println("Capacity of the van: " + capacity + " tons");
    }
}

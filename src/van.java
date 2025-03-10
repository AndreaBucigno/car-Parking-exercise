public class van extends vehicles{

    private float capacity;

    public van(String plate, String brand, String model, int productionYear, float capacity){
        super(plate, brand, model, productionYear);
        this.capacity=capacity;
    }

    public void setCapacity(float capacity1){
        capacity = capacity1;
    }

    public float getCapacity(){
        return capacity;

    }

    @Override
    public void printVehicle(){
        super.printVehicle();
        System.out.print("\tCapacity of the van"+capacity+"\n");
    }
}

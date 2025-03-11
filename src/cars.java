//
public class cars extends vehicles{

    private int numberOfDoors;

    public cars(String plate, String brand, String model, int productionYear, int numberOfDoors){
        super(plate, brand, model, productionYear,1);
        this.numberOfDoors=numberOfDoors;
    }

    public void setNumberOfDoors(int number){
        numberOfDoors=number;
    }

    public int getNumberOfDoors(){
        return numberOfDoors;
    }

    @Override
    public void printVehicle() {
        super.printVehicle();
        System.out.println("Number of doors: " + numberOfDoors);
    }
}

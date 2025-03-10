public class cars extends vehicles{

    private int numberOfDoors;

    public cars(String plate, String brand, String model, int productionYear, int numberOfDoors){
        super(plate, brand, model, productionYear);
        this.numberOfDoors=numberOfDoors;
    }

    public void setNumberOfDoors(int number){
        numberOfDoors=number;
    }

    public int getNumberOfDoors(){
        return numberOfDoors;
    }

    @Override
    public void printVehicle(){
        super.printVehicle();
        System.out.print("\tnumber of doors: "+numberOfDoors+"\n");
    }
}

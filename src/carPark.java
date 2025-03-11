import java.util.ArrayList;
import java.util.Scanner;
//
public class carPark {

    private ArrayList<vehicles> vehiclesarrayList;
    private Scanner scanner = new Scanner(System.in);
    private int maxCapacity;
    private int currentCapacity;
    public carPark(int slot){
        vehiclesarrayList=new ArrayList<>();
        maxCapacity=slot;
    }

    public void addVehicle(vehicles vehicles){
        if(currentCapacity+vehicles.getSpaceOccupied()<= maxCapacity) {
            vehiclesarrayList.add(vehicles);
            currentCapacity += vehicles.getSpaceOccupied();
        }else{
            System.out.println("Error park is full.");
        }

    }

    public void removeVehicles(int position){
        if(vehiclesarrayList.isEmpty()){
            System.out.println("Car park is empty.");
        }else {
            currentCapacity -= vehiclesarrayList.get(position-1).getSpaceOccupied();
            vehiclesarrayList.remove(position - 1);

        }
    }



    public void printList() {
        if (vehiclesarrayList.isEmpty()) {
            System.out.println("Car park is empty.");
        } else {
            System.out.println("Vehicles in the car park:");
            System.out.println("==============================");
            for (vehicles vehicle : vehiclesarrayList) {
                vehicle.printVehicle();
                System.out.println("------------------------------");
            }
            System.out.println("==============================");
        }
    }


    public void vehiclesModification(int position,int option){
        switch (option){
            case 1:
                System.out.println("Enter the license plate number:");
                String newPlate = scanner.nextLine();
                vehiclesarrayList.get(position-1).setPlate(newPlate);
                break;
            case 2:
                System.out.println("Enter the brand:");
                String newBrand = scanner.nextLine();
                vehiclesarrayList.get(position-1).setBrand(newBrand);
                break;
            case 3:
                System.out.println("Enter the model:");
                String newModel = scanner.nextLine();
                vehiclesarrayList.get(position-1).setModel(newModel);
                break;
            case 4:
                System.out.println("Enter the production year:");
                int newYear = scanner.nextInt();
                scanner.nextLine();
                vehiclesarrayList.get(position-1).setProductionYear(newYear);
                break;
        }

        System.out.println("Changes saved successfully");
    }
}
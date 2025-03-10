import java.util.ArrayList;
import java.util.Scanner;

public class carPark {

    private ArrayList<vehicles> vehiclesarrayList;
    private Scanner scanner = new Scanner(System.in);

    public carPark(){
        vehiclesarrayList=new ArrayList<>();

    }

    public void addVehicle(vehicles vehicles){
        vehiclesarrayList.add(vehicles);

    }

    public void removeVehicles(int position){
        if(vehiclesarrayList.isEmpty()){
            System.out.println("Car park is empty.");
        }else {
            vehiclesarrayList.remove(position - 1);
        }
    }



    public void printList() {
        if (vehiclesarrayList.isEmpty()) {
            System.out.println("Car park is empty.");
        } else {
            for (vehicles vehicles : vehiclesarrayList) {
                vehicles.printVehicle();
            }
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
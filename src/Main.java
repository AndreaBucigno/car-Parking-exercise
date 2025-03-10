import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        vehicles vehicles;
        carPark carPark = new carPark();
        int option;
        while(true){
            System.out.println("------------------------------------");
            System.out.println("Enter the option: \n1.add Vehicle\n2.remove Vehicle\n3.Modify a Vehicle\n4.Print car Park\n5.Exit");
            option=scanner.nextInt();
            scanner.nextLine();
            switch (option){
                case 1:

                    System.out.println("Enter the license plate number:");
                    String newPlate = scanner.nextLine();
                    System.out.println("Enter the brand:");
                    String newBrand = scanner.nextLine();
                    System.out.println("Enter the model:");
                    String newModel = scanner.nextLine();
                    System.out.println("Enter the production year:");
                    int newYear = scanner.nextInt();

                    //instanza della classe di tipo veicoli

                    vehicles = new vehicles(newPlate,newBrand,newModel,newYear);
                    carPark.addVehicle(vehicles);
                    break;

                case 2:
                    carPark.printList();
                    System.out.println("Enter the position that you want remove:");
                    int position=scanner.nextInt();
                    scanner.nextLine();
                    carPark.removeVehicles(position);
                    break;

                case 3:
                    carPark.printList();
                    System.out.println("Enter the position that you want change:");
                    int changePosition=scanner.nextInt();
                    System.out.println("Enter the option that you want change:\n1.plate Number\n2.brand\t3.model\t4.production Year");
                    int chageoption=scanner.nextInt();
                    scanner.nextLine();
                    carPark.vehiclesModification(changePosition,chageoption);
                    break;

                case 4:
                    carPark.printList();
                    break;

                case 5:
                    System.out.println("Exit.....");
                    return;

                default:
                    System.out.println("Invalid option, Try again!");
                    break;
            }
        }
    }
}
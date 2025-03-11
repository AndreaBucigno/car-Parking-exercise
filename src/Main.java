import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        vehicles vehicles;
        int spaceOfDeposit;
        boolean condition;

        do {
            System.out.println("Enter how many slot there are in the deposit:");
            spaceOfDeposit = scanner.nextInt();
            scanner.nextLine();
            condition=spaceOfDeposit<3;

            if (condition) {
                System.out.println("Error! minimum 3 slots.");
            }
        }while(condition);

        carPark carPark = new carPark(spaceOfDeposit);
        int option,selection;

        while(true){
            System.out.println("---------------------------------------------------------");
            System.out.println("Enter the option: \n1.add Vehicle\n2.remove Vehicle\n3.Modify a Vehicle\n4.Print car Park\n5.Exit");
            option=scanner.nextInt();
            scanner.nextLine();
            switch (option){
                case 1:
                    System.out.println("Enter the type of Vehicle:\n1.Vehicle\n2.Car\n3.Van\n4.Bus");
                    selection=scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Enter the license plate number:");
                    String newPlate = scanner.nextLine();
                    System.out.println("Enter the brand:");
                    String newBrand = scanner.nextLine();
                    System.out.println("Enter the model:");
                    String newModel = scanner.nextLine();
                    System.out.println("Enter the production year:");
                    int newYear = scanner.nextInt();

                    switch (selection) {

                        //Vehicle
                        case 1:
                            System.out.println("Enter how many slot it occupied:");
                            int space = scanner.nextInt();
                            scanner.nextLine();
                            vehicles = new vehicles(newPlate, newBrand, newModel, newYear,space);
                            carPark.addVehicle(vehicles);
                            break;

                            //Car
                        case 2:
                            System.out.println("Enter the number of door of the car:");
                            int numberofdoors= scanner.nextInt();
                            cars cars = new cars(newPlate, newBrand, newModel, newYear,numberofdoors); //polimorfismo della classe vehicle
                            carPark.addVehicle(cars);
                            break;

                            //Van
                        case 3:
                            System.out.println("Enter the capacity of the van:");
                            int capacity= scanner.nextInt();
                            scanner.nextLine();
                            van van = new van(newPlate, newBrand, newModel, newYear,capacity); //polimorfismo della classe vehicle
                            carPark.addVehicle(van);
                            break;

                            //Bus
                        case 4 :
                            System.out.println("Enter the place to seat:");
                            int placeToSeat= scanner.nextInt();
                            scanner.nextLine();
                            bus bus = new bus(newPlate, newBrand, newModel, newYear,placeToSeat); //polimorfismo della classe vehicle
                            carPark.addVehicle(bus);
                            break;
                    }
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
                    System.out.println("---------------------------------------------------------");
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
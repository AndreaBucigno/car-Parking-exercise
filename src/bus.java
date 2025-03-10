import java.lang.foreign.PaddingLayout;

public class bus extends vehicles{
    private int placesToSeat;

    public bus(String plate, String brand, String model, int productionYear, int placesToSeat){
        super(plate, brand, model, productionYear);
        this.placesToSeat=placesToSeat;
    }

    public void setPlacesToSeat(int placesToSeat){
        this.placesToSeat=placesToSeat;


    }

    public int getPlacesToSeat(){
        return placesToSeat;

    }

    @Override
    public void printVehicle() {
        super.printVehicle();
        System.out.print("\tplace to seat:"+placesToSeat+"\n");
    }
}

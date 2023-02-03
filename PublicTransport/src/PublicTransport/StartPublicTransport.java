package PublicTransport;

public class StartPublicTransport {
    public static void main(String[] args) {
        Bus bus1 = new Bus();
        Bus bus2 = new Bus();

        bus1.passengersOn(2);
        bus1.fuelChange(-50);
        bus1.statusChange("차고지행");
        bus1.fuelChange(10);
        bus1.passengersOn(45);
        bus1.passengersOn(5);
        bus1.fuelChange(-55);

    }
}

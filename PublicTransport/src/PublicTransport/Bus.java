package PublicTransport;

public class Bus extends PublicTransport {

    // 최대 승객 수
    static final int bus_p_max = 30;

    // 버스요금
    static int bus_money = 1000;

    public Bus(){
        super();
        System.out.println(/* pt_num + */ " 번 버스객체 만들어짐");
        this.status = "운행";

    }

    public void passengersOn(int passengers){
        this.passengers += passengers;
        if(this.passengers > bus_p_max){
            this.passengers -= this.passengers;
            System.out.println("최대 승객 수를 초과했습니다.");
        }else{
            System.out.println("탑승 승객 수 = " + this.passengers);
            System.out.println("잔여 승객 수 = " + (bus_p_max - this.passengers));
            System.out.println("요금 = " + (this.passengers * bus_money));
        }

    }

    public void fuelChange(int fuelChange){
        this.fuel += fuelChange;
        System.out.println("주유량 : " + this.fuel);
        if(this.fuel<10){
            this.status = "차고지행";
            System.out.println("주유가 필요합니다");
        }
    }

    public void statusChange(String status){
        this.status = status;
        System.out.println("상태 : " + this.status);
    }
}
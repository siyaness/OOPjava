package PublicTransport;

public class PublicTransport {
    // 번호
    public int pt_num;

    // 최대 승객 수
    static final int maxpassengers = 0;

    // 승객 수
    public int passengers = 0;

    // 연료
    public int fuel = 100;

    // 속도
    public int speed = 0;

    // 속도변경?


    // 상태
    public String status = "";

    public PublicTransport(){
        ++pt_num;
    }

}
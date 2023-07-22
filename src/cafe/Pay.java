package cafe;

public class Pay {
    
    private int charge;//충전금액

    public Pay(int charge) {
        this.charge = charge;
    }

    public int getCharge() {
        return charge;
    }

    public void pay(int price, int charge) {
        int balance = charge -  price;
        if(balance < 3000){
            System.out.println("충전 금액이 3000원 이하로 충전이 필요합니다.");
        }
        System.out.println("결제가 완료되었습니다.");
    }
}

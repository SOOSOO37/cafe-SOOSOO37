package cafe;

public class Barista {

    public Coffee makeCoffee( Option option,Customer customer) {
        Coffee coffee = new Coffee();
        System.out.println(customer.getNickname() + "고객님 주문하신 " + option.getName() + " 한 잔 나왔습니다.");
        return coffee;
    }


}

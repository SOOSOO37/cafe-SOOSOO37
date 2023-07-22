package cafe;

import java.util.List;

public class Customer {

    private String nickname;
    private int pay;

    public Customer(String nickname, int pay) {
        this.nickname = nickname;
        this.pay = pay;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }



    public Coffee orderCoffee(Option option){

         Coffee coffee = new Coffee();
         option.choiceOption(option.getName(),option.getSize(),option.isHot());

        System.out.println(option.getSize() + option.getName()+ " 한 잔 " + option.isHot() + "로 주세요.");

        return coffee;

    }

    public String sayThanks(){
        return "감사합니다.";
    }

}

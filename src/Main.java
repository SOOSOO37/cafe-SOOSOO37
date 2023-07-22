import cafe.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Coffee> coffees = new ArrayList<>();
        coffees.add(new Coffee("아메리카노","tall", 4500));
        coffees.add(new Coffee("아메리카노","Grande", 5000));
        coffees.add(new Coffee("아메리카노","Venti", 5500));
        coffees.add(new Coffee("카페라떼","tall", 5000));
        coffees.add(new Coffee("카페라떼","Grande", 5500));
        coffees.add(new Coffee("카페라떼","Venti", 6000));


                Customer customer = new Customer("david",5000);
               Option option = Option.choiceOption("아메리카노","tall","hot");
               customer.orderCoffee(option);
               Barista barista = new Barista();
               barista.makeCoffee(option,customer);
               PickUpTable pickUpTable = new PickUpTable(barista,option,customer);
               pickUpTable.getCoffee();


    }
}
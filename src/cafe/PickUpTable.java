package cafe;

public class PickUpTable {

    private Coffee coffee;

    public PickUpTable(Coffee coffee){
        this.coffee = coffee;
    }

    public PickUpTable(Barista barista, Option option, Customer customer) {
    }

    public Coffee getCoffee(){
        return coffee;
    }

    public void pickUpCoffee(Barista barista,Option option,Customer customer){
        PickUpTable pickUpTable = new PickUpTable(coffee);
        barista.makeCoffee(option,customer);
        customer.sayThanks();
        getCoffee();

    }
}

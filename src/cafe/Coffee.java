package cafe;

public class Coffee {

    private String name;
    private String size;
    private int price;
    private boolean isHot;

    public Coffee(String name, String size , int price) {
        this.name = name;
        this.size = size;
        this.price = price;
    }

    public Coffee(Option option) {
    }

    public Coffee(String name, String size, boolean isHot) {
        this.name = name;
        this.size = size;
        this.isHot = isHot;
    }

    public Coffee() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isHot() {
        return isHot;
    }

    public void setHot(boolean hot) {
        isHot = hot;
    }
}

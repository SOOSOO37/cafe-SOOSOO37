package cafe;

public class Option {

    private String name;

    private String size;

    private String isHot;

    public Option(String name, String size, String  hotOrIce) {
        this.name = name;
        this.size = size;
        this.isHot = isHot;
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }


    public String isHot() {
        return isHot;
    }

    public static Option choiceOption(String name, String size, String isHot){

        return new Option(name, size, isHot);
    }
}

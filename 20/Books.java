public class Books implements Nameable {
    private String name;

    public Books(){
        name = "";
    }
    public Books(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
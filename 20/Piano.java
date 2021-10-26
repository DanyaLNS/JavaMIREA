public class Piano implements Nameable{
    private String name;

    public Piano(){
        name = "";
    }
    public Piano(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }
}

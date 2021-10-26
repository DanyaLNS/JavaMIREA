public class Electric extends Guitar {
    private String pickups;
    private String color;

    public Electric(int numberOfStrings, String type, String model, String brand, boolean inStock, String pickups, String color){
        this.numberOfStrings = numberOfStrings;
        this.type = type;
        this.model = model;
        this.brand = brand;
        this.inStock = inStock;
        this.pickups = pickups;
        this.color = color;
    }

    public String toString() {
        return (brand + " " + model + '\n' + "Body type: " + type  + '\n' + "Number of strings: " + numberOfStrings  + '\n' + "Color: "  + color + '\n' + "Pickups configuration: " + pickups +'\n' );
    }
    public String aviability() {
        if (inStock){
            return (model + " is in stock in the electric guitar department");
        }
        else {
            return (model + " is not in stock");
        }
    }
}

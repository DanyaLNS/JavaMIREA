public class Bass extends Guitar {
    private String typeOfPickups;

    public Bass(int numberOfStrings, String type, String model, String brand, boolean inStock, String typeOfPickups){
        this.numberOfStrings = numberOfStrings;
        this.type = type;
        this.model = model;
        this.brand = brand;
        this.inStock = inStock;
        this.typeOfPickups = typeOfPickups;
    }

    public String toString() {
        return (brand + " " + model + '\n' + "Body type: " + type  + '\n' + "Number of strings: " + numberOfStrings  + '\n' + "Type of pickups" + typeOfPickups + '\n');
    }
    public String aviability() {
        if (inStock){
            return (model + " is in stock in the Bass guitar department");
        }
        else {
            return (model + " is not in stock");
        }
    }
}

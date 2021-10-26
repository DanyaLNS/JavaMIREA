public class Acoustic extends Guitar {

    public Acoustic(int numberOfStrings, String type, String model, String brand, boolean inStock){
        super(numberOfStrings, type, model, brand, inStock);
    }

    public String toString() {
        return (brand + " " + model + '\n' + "Body type: " + type  + '\n' + "Number of strings: " + numberOfStrings  + '\n');
    }
    public String aviability() {
        if (inStock){
            return (model + " is in stock in the acoustic guitar department");
        }
        else {
            return (model + " is not in stock");
        }
    }
}
 
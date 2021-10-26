public class Classic extends Guitar{
    private String size;

    public Classic (int numberOfStrings, String type, String model, String brand, boolean inStock, String size){
        this.numberOfStrings = numberOfStrings;
        this.type = type;
        this.model = model;
        this.brand = brand;
        this.inStock = inStock;
        this.size = size;
    }

    public String toString() {
        return (brand + " " + model + '\n' + "Body type: " + type  + '\n' + "Number of strings: " + numberOfStrings  + '\n' + "Size: " + size + '\n');
    }
    public String aviability() {
        if (inStock){
            return (model + " is in stock in the classic guitar department");
        }
        else {
            return (model + " is not in stock");
        }
    }
}

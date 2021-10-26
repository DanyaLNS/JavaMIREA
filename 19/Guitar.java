// Базовый класс
public abstract class Guitar {
    protected int numberOfStrings;
    protected String type;
    protected String brand;
    protected String model;
    protected boolean inStock;
    // конструкторы
    public Guitar(){
        numberOfStrings = 0;
        type = "";
        brand = "";
        model = "";
        inStock = false;
    }
    public Guitar(int numberOfStrings, String type, String model, String brand, boolean inStock){
        this.numberOfStrings = numberOfStrings;
        this.type = type;
        this.model = model;
        this.brand = brand;
        this.inStock = inStock;
    }
    // геттеры
    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public int getNumberOfStrings() {
        return numberOfStrings;
    }
    public String getType() {
        return type;
    }
    // сэттеры
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setNumberOfStrings(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }
    public void setType(String type) {
        this.type = type;
    }
    // абстрактные методы
    abstract public String toString();
    abstract public String aviability();
    
}

public class Book {
    private int yearOfPublishing;
    private int price;
    private String title;
    private String author;
    private boolean availability;
    // конструкторы
    public Book(){
        yearOfPublishing = 0;
        price = 0;
        title = "";
        author = "";
        availability = false;
    }
    public Book(int yearOfPublishing, int price, String title, String author, boolean availability){
        this.yearOfPublishing = yearOfPublishing;
        this.price = price;
        this.title = title;
        this.author = author;
        this.availability = availability;
    }
    // сэттеры
    public void setYear(int year) {
        yearOfPublishing = year;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setAvailability(boolean availability) {
        this.availability = availability;
    }
    // геттеры
    public int getYear (){
        return yearOfPublishing;
    }
    public int getPrice (){
        return price;
    }
    public String getTitle (){
        return title;
    }
    public String getAuthor (){
        return author;
    }
    public boolean getAvailability (){
        return availability;
    }
    // переопределение toString
    public String toString(){
        return ("Year of publishing is " + yearOfPublishing + '\n' +  "Title: " + title + '\n' + "Author: " + author + '\n' + "Availability: " + availability + '\n' +  "Price: " + price);
    }
}

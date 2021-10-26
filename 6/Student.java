public class Student{
    public int idNumber;
    private String name;
    private double rating;
    Student(int idNumber, String name, double rating){
        this.idNumber = idNumber;
        this.name = name;
        this.rating = rating;
    }
    public String toString() {
        return (name + " his id: " + idNumber);
    }
    public double getRating() {
        return rating;
    }
}
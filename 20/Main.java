public class Main {
    public static void main(String args[]){
        Books first = new Books("The Man Who Laughs");
        System.out.println(first.getName());

        Piano second = new Piano("Steinway and Sons");
        System.out.println(second.getName());

        Subject third = new Subject("Java");
        System.out.println(third.getName());
    }
}

public class Seventh {
    public static void main(String[] args) {
        MyArrayList seventh = new MyArrayList();
        int[] ar = {5, 4, 3, 2 ,1};
        seventh.addAll(0, ar);
        System.out.print("Тестирование addAll: ");
        seventh.print();
        System.out.print("Тестирование add: ");
        seventh.add(3, 10);
        seventh.print();
        System.out.println("Тестирование get: " + seventh.get(2));
        seventh.add(1, 10);
        System.out.print("Тестирование lastIndexOf: ");
        seventh.print();
        System.out.println(seventh.lastIndexOf(9));
        System.out.println(seventh.lastIndexOf(10));
        System.out.print("Тестирование remove: ");
        seventh.remove(4);
        seventh.print();
        System.out.print("Тестирование set: ");
        seventh.set(0, 6);
        seventh.print();
        System.out.print("Тестирование sort: ");
        seventh.sort();
        seventh.print();
    }
}

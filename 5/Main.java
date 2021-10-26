public class Main {
    public static void main(String[] args) {
        // вывод чисел
        First first = new First(15,10);
        first.recursion();
        // сумма чисел 
        Second second = new Second(2, 5);
        second.recursion();
        System.out.println(second.getKol());
        // сумма цифр
        Third third = new Third(1342);
        System.out.println(third.recursion());
        // проверка на простоту
        Fourth fourth = new Fourth(190);
        System.out.println(fourth.toString());
    }
}

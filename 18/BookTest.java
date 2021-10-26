public  class BookTest {
    public static void main(String[] args) {
        Book nameless = new Book();
        System.out.println(nameless.toString());
        nameless.setYear(2021);
        nameless.setAuthor("Джон Стейнбек");
        nameless.setTitle("Гроздья гнева");
        nameless.setAvailability(true);
        nameless.setPrice(500);
        System.out.println(nameless.toString());
    }
}
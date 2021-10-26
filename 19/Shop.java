public class Shop {
    public static void main(String[] args) {
        Acoustic martin = new Acoustic(6, "Grand Auditorium", "000-15M", "Martin", false);
        System.out.println(martin.toString());
        System.out.println(martin.aviability() + '\n');

        Electric ibanez = new Electric(6, "superstrat", "RG 350 DXZ", "Ibanez", true, "HSH", "white");
        System.out.println(ibanez.toString());
        System.out.println(ibanez.aviability() + '\n');

        Classic yamaha = new Classic(6, "classical", "C40", "Yamaha", true, "3/4");
        System.out.println(yamaha.toString());
        System.out.println(yamaha.aviability() + '\n');

        Bass fender = new Bass(4, "bass", "Precision", "Fender", false, "passive");
        System.out.println(fender.toString());
        System.out.println(fender.aviability() + '\n');
    }

}

public class Main{
    public static void main(String[] args) {

        System.out.println("Вторая практика упражнение 1: ");
        Author faulkner = new Author("William Faulkner", "faulkner@gmail.com", 'm');
        System.out.println(faulkner.getName());
        System.out.println(faulkner.getMail());
        System.out.println(faulkner.getGender());
        faulkner.setMail("William_faulkner@gmail.com");
        System.out.println(faulkner.getMail());
        System.out.println(faulkner.toString());

        System.out.println("Вторая практика упражнение 2: ");
        Ball firstBall = new Ball();
        Ball secondBall = new Ball(3.1, 76.89);
        System.out.println(firstBall.toString());
        System.out.println(secondBall.toString());
        firstBall.move(2.5, -67.1);
        System.out.println(firstBall.toString());
    }
}
public class TestIde{
    public static void main(String[] args) {

        Ide pascalABC = new Ide();
        Ide vsCode = new Ide(true,35, 10 );
        Ide intellij = new Ide(true, 1, 2);

        pascalABC.showInf();
        vsCode.showInf();
        intellij.showInf();

    }
}
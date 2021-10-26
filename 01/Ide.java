public class Ide {
    private boolean git;
    private  int otherLanguages;
    private int frameworks;

    public Ide() {
        git = false;
        otherLanguages = 0;
        frameworks = 0;
    }

    public Ide(boolean g, int o, int f) {
        git = g;
        otherLanguages = o;
        frameworks = f;
    }

    public boolean getGit(){
        return git;
    }
    public int getOtherLanguages(){
        return otherLanguages;
    }
    public int getFrameworks(){
        return frameworks;
    }

    public void showInf(){
        System.out.println("Linking to git: " + git);
        System.out.println("Numbers of languages: " + otherLanguages);
        System.out.println("Numbers of frameworks: " + frameworks);
    }
}
public class Author {
    private String name;
    private String email;
    private char gender;

    public Author (String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }
    public String getMail(){
        return email;
    }
    public char getGender(){
        return gender;
    }

    public void setMail(String mail) {
        email = mail;
    }

    public String toString(){
        return(name + "(" + gender + ")" + " at " + email);
    }
}
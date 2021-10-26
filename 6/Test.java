public class Test {
    public static void main(String[] args) {
        Student students[];
        students = new Student[3];
        students[0] = new Student(3, "Anikin Danila", 4.5);
        students[1] = new Student(1, "Richard Feynman", 5.0);
        students[2] = new Student(5, "Douglas Hofstadter", 4.62);

        for(int left = 0; left < students.length; left++){
            Student value = students[left];
            int i = left - 1;
            for(; i >= 0; i--){
                if (value.idNumber < students[i].idNumber){
                    students[i+1] = students[i];
                }
                else {
                    break;
                }
            }
            students[i+1] = value;
        }
        for(int i = 0; i < students.length; i++){
               System.out.println(students[i].toString());
        }
    }
}

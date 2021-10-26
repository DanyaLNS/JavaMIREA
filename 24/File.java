import java.io.*;
import java.util.Scanner;

public class File {
    public File(){
        try(FileWriter writer = new FileWriter("notes.txt", false)){
            Scanner scanner = new Scanner(System.in);
            String text = scanner.nextLine();
            scanner.close();
            writer.write(text);
            writer.flush();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}

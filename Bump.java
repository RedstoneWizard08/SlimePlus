import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Bump {
    public static void main(String[] args) throws FileNotFoundException {
        String path = ".version";
        String content = "";
        File file = new File(path);
        Scanner reader = new Scanner(file);
        while(reader.hasNextLine()) {
            content += reader.nextLine();
        }
        reader.close();
        String[] version = content.split("\\.");
        version[2] = Integer.toString(Integer.parseInt(version[2]) + 1);
        System.out.println(String.join(".", version));
    }
}

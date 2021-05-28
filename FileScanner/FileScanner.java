import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileScanner {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("brand_values.txt");

        Scanner input = new Scanner(file);
        while (input.hasNext()) {
            System.out.println(input.nextLine());
        }
        input.close();
    }
}
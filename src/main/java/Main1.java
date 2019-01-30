import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main1 {

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("/Users/magda/Homework01/src/main/java/earnings.txt");
        Scanner scanner = new Scanner(file);
        Pattern pattern = Pattern.compile("Kowalsk.*");
        Matcher matcher = pattern.matcher(scanner.nextLine());
        while (scanner.hasNextLine()) {
        }
    }
}

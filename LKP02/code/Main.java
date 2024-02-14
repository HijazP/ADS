import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("./src/input.txt");
        Scanner scanner = new Scanner(file);
        Container container = new Container();

        while (scanner.hasNextLine())
        {
            String dt = scanner.nextLine();
            String[] data = dt.split(" ");
            int weight = Integer.parseInt(data[0]);
            String color = data[1];
            container.addStrawberry(weight, color);
        }

        scanner.close();

        container.stopAddStrawberry();
    }
}
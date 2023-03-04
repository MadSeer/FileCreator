import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        FileFunctionality fileFunctionality = new FileFunctionality();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean exit = false;
        while (true) {
            System.out.println("What do you want?" +
                    "\n1.Create file" +
                    "\n2.Write data to file" +
                    "\n3.Read file" +
                    "\n4.Delete file" +
                    "\n5.Exit" +
                    "\n6.Clear screen");
            int menu = Integer.parseInt(reader.readLine());
            switch (menu) {
                case 1:
                    fileFunctionality.createFile();
                    break;
                case 2:
                    fileFunctionality.writeFile();
                    break;
                case 3:
                    fileFunctionality.readFile();
                    break;
                case 4:
                    fileFunctionality.deleteFile();
                    break;
                case 5:
                    exit = true;
                    break;
                case 6:
                    System.out.print("\033[H\033[J");
                    break;

            }
            if (exit == true) break;
        }
    }
}
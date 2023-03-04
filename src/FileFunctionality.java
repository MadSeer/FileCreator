import java.io.*;

public class FileFunctionality {

    public static void createFile() throws IOException {
        //Write data to var
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input file name");
        String filename = reader.readLine();
        File file = new File("C:\\Users\\Madme\\OneDrive\\Рабочий стол\\" + filename + ".txt");
        if (file.exists()) {
            System.out.println("A file with this name already exist");
        } else {

            try (FileOutputStream write = new FileOutputStream("C:\\Users\\Madme\\OneDrive\\Рабочий стол\\" + filename + ".txt")) {
                //byte[] buffer = filename.getBytes();

            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    public void writeFile() throws IOException {
        // File exist checking
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input file name");
        String filename = reader.readLine();
        File file = new File("C:\\Users\\Madme\\OneDrive\\Рабочий стол\\" + filename + ".txt");
        //Write to file
        if (file.exists()) {
            System.out.println("Input data written to file");
            String filedata = reader.readLine();
            try {
                FileOutputStream write = new FileOutputStream("C:\\Users\\Madme\\OneDrive\\Рабочий стол\\" + filename + ".txt");
                // String to bytes
                byte[] buffer = filedata.getBytes();
                write.write(buffer, 0, buffer.length);
                System.out.println("\nFile has been written");
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        } else {
            System.out.println("File is not exist. Create file?(y/n)");
            String confirm = reader.readLine();
            if (confirm.equals("y")) {
                createFile();
                writeFile();
            }
        }

    }

    public void deleteFile() throws IOException {
        // File exist checking
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input file name");
        String filename = reader.readLine();
        File file = new File("C:\\Users\\Madme\\OneDrive\\Рабочий стол\\" + filename + ".txt");
        if (file.exists()) {
            file.delete();
            System.out.println("The file has been deleted");
        }
    }

    public void readFile() throws IOException {
        // File exist checking
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input file name");
        String filename = reader.readLine();
        File file = new File("C:\\Users\\Madme\\OneDrive\\Рабочий стол\\" + filename + ".txt");
        if (file.exists()) {
            try {
                FileReader fileReader = new FileReader("C:\\Users\\Madme\\OneDrive\\Рабочий стол\\" + filename + ".txt");
                int c;
                while ((c = fileReader.read()) != -1) {
                    System.out.print((char) c);
                }
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
            System.out.println("\n\n\nThe file has been readed");
        } else {
            System.out.println("File is not exist. Create file?(y/n)");
            String confirm = reader.readLine();
            if (confirm.equals("y")) {
                createFile();
                writeFile();
            }
        }
    }

}

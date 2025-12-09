import java.io.FileWriter;
import java.io.IOException;
class Assignment_ten {
    public static void main(String[] args) {
        String text = "This is a test.";
        try (FileWriter writer = new FileWriter("assignment_output.txt")) {
            writer.write(text); 
            System.out.println("Text written to assignment_output.txt successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing the file.");
            e.printStackTrace();
        }
    }
}

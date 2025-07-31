package chapter15.streams;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

public class PrintStreamImpl {
    public static void main(String[] args) {
        String fileLocation = "C:\\Users\\Raheem Olamide\\IdeaProjects\\javaClasses\\src\\chapter15\\streams\\data.txt";
        try(OutputStream outputStream = new FileOutputStream(fileLocation, true);
                PrintStream printStream = new PrintStream(outputStream)){
            printStream.printf("Go placidly amid the noise and haste ... %s", "Amidat");
        }catch (IOException exception){
            System.err.println("ERROR: " + exception.getMessage());
        }
    }
}

package chapter15;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.math.BigDecimal;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class FileOperationsTest {
    private String folder =  "C:\\Users\\Raheem Olamide\\IdeaProjects\\javaClasses\\test\\files\\";

    @Test
    void testCanReadFromFile(){
        //1. get file location
        String fileLocation = folder.concat("data.txt");
        String data = FileOperations.readFrom(fileLocation);
        assertNotNull(data);
        assertFalse(data.isEmpty());
    }

    @Test
    void testCanWriteToFile() throws IOException {
        String fileLocation =folder.concat("Output.java");
        String data = """
                package files;
                import java.util.Arrays;
                public class Output{
                    public static void main(String args[]) {
                        System.out.println(Arrays.toString(args));
                    }
                }
                """;
        FileOperations.writeDataTo2(data, fileLocation);
        String fileData = FileOperations.readFrom(fileLocation);
        assertNotNull(fileData);
        assertFalse(fileData.isEmpty());

    }

    @Test
    void testCanReadFromTheWeb() throws MalformedURLException {
        String url = "https://jsonplaceholder.typicode.com/posts/2";
        String fileLocation = folder.concat("data.json");
        FileOperations.readFromWeb(url, fileLocation);
        String data = FileOperations.readFrom(fileLocation);
        assertNotNull(data);
        assertFalse(data.isEmpty());

    }


}

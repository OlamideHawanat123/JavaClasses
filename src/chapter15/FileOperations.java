package chapter15;

import chapter15.exception.InvalidPathException;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class FileOperations {
    public static String readFrom(String fileLocation) {
        Path path = Path.of(fileLocation);
        StringBuilder data = new StringBuilder();
        try(BufferedReader reader = Files.newBufferedReader(path)) {
            List<String> text = reader.lines().toList();
            for (String word : text) {

                data.append(word);
            }
        }catch (IOException ex){
            ex.printStackTrace();
        }
        System.out.println(data);
        return data.toString();
    }


    public static void writeDataTo(String data, String location) throws IOException {
        Path path = Path.of(location);
        if(!Files.exists(path))
            Files.createFile(path);
        try(BufferedWriter writer = Files.newBufferedWriter(path);){
            writer.write(data);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void writeDataTo2(String data, String location) throws IOException {
        try(FileOutputStream outputStream = new FileOutputStream(location)){
            outputStream.write(data.getBytes());
        }
    }

    public static void readFromWeb(String url, String fileLocation) throws MalformedURLException {
        URL uri = URI.create(url).toURL();
        try(InputStream inputStream = uri.openStream();
        FileOutputStream outputStream = new FileOutputStream(fileLocation)) {
            byte[] data = inputStream.readAllBytes();
            outputStream.write(data);
        } catch (IOException ex) {
            System.err.println("ERROR: " + ex.getMessage());
            throw new RuntimeException(ex);
        }

    }


    }


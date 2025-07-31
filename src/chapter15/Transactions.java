package chapter15;

import chapter15.exception.InvalidPathException;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Transactions {
    private BigDecimal amount;
    private String sender;
    private String receiver;
    private LocalDateTime date;

    public Transactions(BigDecimal amount, String sender, String receiver) {
        this.amount = amount;
        this.sender = sender;
        this.receiver = receiver;
        this.date = LocalDateTime.now();
    }

    public  void writeArrayListContentToAFile(List<Transactions> transactions, String fileLocation)throws IOException, InvalidPathException {
        Transactions transaction = new Transactions(amount,sender,receiver);
        List<Transactions> theTransaction = new ArrayList<>();
        theTransaction.add(transaction);

        Path path = Path.of(fileLocation);
        if(!Files.exists(path))
            Files.createFile(path);
        try(BufferedWriter writer = Files.newBufferedWriter(path);){
            for(Transactions count : theTransaction){
                writer.write(transaction.toString());
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

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



}



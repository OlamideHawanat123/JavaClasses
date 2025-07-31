package chapter15;

import chapter15.streams.TransactionJsonSerializer;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


import static java.time.LocalDate.now;
import static org.junit.jupiter.api.Assertions.*;

class TransactionsTest {
    private String folder =  "C:\\Users\\Raheem Olamide\\IdeaProjects\\javaClasses\\test\\files\\";

    @Test
    public void testThatYouCanAddAnArrayListContentIntoAFile() throws IOException {
        Transactions transaction = new Transactions(BigDecimal.valueOf(3000), "suliha", "BimBim");
        List<Transactions> transactions = new ArrayList<>();
        String fileLocation = folder.concat("listData.txt");
        transaction.writeArrayListContentToAFile(transactions, fileLocation);
        String listData = FileOperations.readFrom(fileLocation);
        assertNotNull(listData);
        assertFalse(listData.isEmpty());
    }

    //Test using jackson to save files//

    @Test
    public void testShouldSerializeTransaction() {
        Transaction transaction = new Transaction();
        transaction.setSender("John Doe");
        transaction.setAmount(BigDecimal.valueOf(30_000));
        transaction.setRecipient("E Sulii");
        transaction.setDate(now());
        String expected = "{\"sender\":\"John Doe\",\"recipient\":\"E Sulii\",\"amount\":30000,\"date\":\"2025-7-14\"}";
        String json = TransactionJsonSerializer.serialize(transaction);
        assertNotNull(json);
        assertEquals(expected, json);

    }

}
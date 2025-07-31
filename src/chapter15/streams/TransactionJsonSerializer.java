package chapter15.streams;

import chapter15.Transaction;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class TransactionJsonSerializer {
    public static String serialize(Transaction transaction) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            String json = objectMapper.writeValueAsString(transaction);
            System.out.println("json = " + json);
            return json;
        }catch(JsonProcessingException exception){
            exception.printStackTrace();
            return "";
        }
    }
}

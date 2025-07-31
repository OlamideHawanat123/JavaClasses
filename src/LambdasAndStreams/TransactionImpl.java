package LambdasAndStreams;

import chapter15.Transaction;
import chapter15.Transactions;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class TransactionImpl {
    public static void main(String[] args) {


        Consumer<Transactions> consumer = (Transaction x) -> {
            System.out.println("{sender:}" + x.getSender()+ "amount:" + x.getAmount());

        };
        List<Transactions> transactions = List.of(
                new Transactions(new BigDecimal("200"), "Alice", "Bolanle"),
                new Transactions(new BigDecimal("200"), "Alice", "Bolanle"),
                new Transactions(new BigDecimal("200"), "Alice", "Bolanle")
        );
        transactions.forEach(consumer);
    }

}
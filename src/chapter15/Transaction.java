package chapter15;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

public class Transaction {
    private String sender;
    private String recipient;
    private BigDecimal amount;
    @JsonSerialize(using = LocalDateSerializer.class)
    private LocalDate date;

    public void setSender(String sender) {
        this.sender = sender;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public void setRecipient(String recipient) {
        this .recipient = recipient;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }


    public String  getRecipient() {
        return recipient;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getSender() {
        return sender;
    }

    public BigDecimal getAmount() {
        return amount;
    }

}

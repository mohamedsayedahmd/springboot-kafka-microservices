package net.javaguides.basedomins.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
// This is the class that we are going to use to transfer
// the data between producer and consumer using apache kafka
public class OrderEvent {
    private String message;
    private String status; // status of the order
    private Order order;
}

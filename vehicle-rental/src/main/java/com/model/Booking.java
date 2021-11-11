package com.model;

import com.model.enumeration.BookingStatus;
import com.model.enumeration.PaymentStatus;
import com.model.notification.Notification;
import com.model.user.Customer;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@AllArgsConstructor
@Data
public class Booking {
    private String bookingId;
    private LocalDateTime time;
    private Integer amount;
    private Customer payee;
    private Bike bike;
    private BookingStatus status;
    private PaymentStatus paymentStatus;
    private List<Notification> notificationList;


}

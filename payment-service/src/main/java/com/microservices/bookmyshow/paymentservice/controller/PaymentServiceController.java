package com.microservices.bookmyshow.paymentservice.controller;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.bookmyshow.paymentservice.config.BookingServiceProxy;
import com.microservices.bookmyshow.paymentservice.config.WalletServiceProxy;
import com.microservices.bookmyshow.paymentservice.dto.BookingDetailsDTO;
import com.microservices.bookmyshow.paymentservice.dto.WalletDTO;
import com.microservices.bookmyshow.paymentservice.entity.PaymentHistory;
import com.microservices.bookmyshow.paymentservice.repo.PaymentServiceRepo;

@RestController
public class PaymentServiceController
{
    @Autowired
    private BookingServiceProxy bookingProxy;

    @Autowired
    private WalletServiceProxy walletProxy;

    @Autowired
    private PaymentServiceRepo repo;

    @GetMapping("pay/bookingId/{bookingId}/walletId/{walletId}")
    public Object completePayment(@PathVariable Integer bookingId, @PathVariable Integer walletId)
    {
        BookingDetailsDTO bookingHistory = bookingProxy.getHistory(bookingId);
        WalletDTO wallet = walletProxy.getWalletDetails(walletId);

        // code to check if username in booking history, wallet and logged in user are the same;
        
        
        // Invocation of external payment service return SUCCESS status(true)
        boolean status = true;
        
        PaymentHistory paymentHistory = new PaymentHistory(walletId, false, LocalDateTime.now(), bookingHistory.getUserName(), bookingHistory.getTotalCost());

        if (status) {

            return "Booked";
        }
        return "Failed";

    }
}

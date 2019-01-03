package com.microservices.bookmyshow.bookingservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.bookmyshow.bookingservice.config.WalletServiceProxy;
import com.microservices.bookmyshow.bookingservice.dto.WalletDTO;
import com.microservices.bookmyshow.bookingservice.entity.BookingHistory;
import com.microservices.bookmyshow.bookingservice.repo.BookingServiceRepository;

@RestController
public class SeatReservationController
{
    @Autowired
    private WalletServiceProxy proxy;

    @Autowired
    private BookingServiceRepository repo;

    @PostMapping("/confirm/bookingId/{bookingId}")
    public Object reserveSeats(@PathVariable Integer bookingId)
    {
        BookingHistory bookingHistory = repo.findByBookingId(bookingId);
        String userName = bookingHistory != null ? bookingHistory.getUserName() : null;

        // code to check logged in username and booking history login name

        List<WalletDTO> wallets = proxy.getWallets(userName);
        if (wallets != null) {
            return wallets;
        }
        return "You do not have any saved wallets";
    }

}

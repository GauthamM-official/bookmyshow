package com.microservices.bookmyshow.bookingservice.entity;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BookingHistory
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer bookingId;

    private int showId;
    private String userName;
    private double totalCost;

    private java.time.LocalDateTime bookingTime;

    private List<String> selectedSeats;

    public BookingHistory()
    {

    }

    public BookingHistory(int showId, String userName, double totalCost, LocalDateTime bookingTime, List<String> selectedSeats)
    {
        super();
        this.showId = showId;
        this.userName = userName;
        this.totalCost = totalCost;
        this.bookingTime = bookingTime;
        this.setSelectedSeats(selectedSeats);
    }

    public Integer getBookingId()
    {
        return bookingId;
    }

    public void setBookingId(Integer bookingId)
    {
        this.bookingId = bookingId;
    }

    public int getShowId()
    {
        return showId;
    }

    public void setShowId(int showId)
    {
        this.showId = showId;
    }

    public String getUserName()
    {
        return userName;
    }

    public void setUserName(String userName)
    {
        this.userName = userName;
    }

    public double getTotalCost()
    {
        return totalCost;
    }

    public void setTotalCost(double totalCost)
    {
        this.totalCost = totalCost;
    }

    public java.time.LocalDateTime getBookingTime()
    {
        return bookingTime;
    }

    public void setBookingTime(java.time.LocalDateTime bookingTime)
    {
        this.bookingTime = bookingTime;
    }

    public List<String> getSelectedSeats()
    {
        return selectedSeats;
    }

    public void setSelectedSeats(List<String> selectedSeats)
    {
        this.selectedSeats = selectedSeats;
    }

}

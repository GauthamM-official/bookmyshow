package com.microservices.bookmyshow.paymentservice.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PaymentHistory
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer paymentTransactionId;
    private int paymentMethod; // walletId
    private boolean status;
    private LocalDateTime completedTime;
    private String userName;
    private double amount;

    public PaymentHistory()
    {

    }

    public PaymentHistory(int paymentMethod, boolean status, LocalDateTime completedTime, String userName, double amount)
    {
        super();
        this.paymentMethod = paymentMethod;
        this.status = status;
        this.completedTime = completedTime;
        this.userName = userName;
        this.amount = amount;
    }

    public Integer getPaymentTransactionId()
    {
        return paymentTransactionId;
    }

    public void setPaymentTransactionId(Integer paymentTransactionId)
    {
        this.paymentTransactionId = paymentTransactionId;
    }

    public int getPaymentMethod()
    {
        return paymentMethod;
    }

    public void setPaymentMethod(int paymentMethod)
    {
        this.paymentMethod = paymentMethod;
    }

    public boolean getStatus()
    {
        return status;
    }

    public void setStatus(boolean status)
    {
        this.status = status;
    }

    public LocalDateTime getCompletedTime()
    {
        return completedTime;
    }

    public void setCompletedTime(LocalDateTime completedTime)
    {
        this.completedTime = completedTime;
    }

    public String getUserName()
    {
        return userName;
    }

    public void setUserName(String userName)
    {
        this.userName = userName;
    }

    public double getAmount()
    {
        return amount;
    }

    public void setAmount(double amount)
    {
        this.amount = amount;
    }

}

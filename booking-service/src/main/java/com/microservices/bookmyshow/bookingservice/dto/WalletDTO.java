package com.microservices.bookmyshow.bookingservice.dto;

public class WalletDTO
{

    private int walletId;
    private String walletName;
    private String userName;

    public WalletDTO()
    {
    }

    public WalletDTO(int walletId, String walletName, String userName)
    {
        super();
        this.walletId = walletId;
        this.walletName = walletName;
        this.setUserName(userName);
    }

    public int getWalletId()
    {
        return walletId;
    }

    public void setWalletId(int walletId)
    {
        this.walletId = walletId;
    }

    public String getWalletName()
    {
        return walletName;
    }

    public void setWalletName(String walletName)
    {
        this.walletName = walletName;
    }

    public String getUserName()
    {
        return userName;
    }

    public void setUserName(String userName)
    {
        this.userName = userName;
    }
}

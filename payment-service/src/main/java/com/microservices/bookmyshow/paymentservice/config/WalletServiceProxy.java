package com.microservices.bookmyshow.paymentservice.config;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.microservices.bookmyshow.paymentservice.dto.WalletDTO;

@FeignClient(name = "zuul-api-gateway-server")
@RibbonClient(name = "wallet-service")
public interface WalletServiceProxy
{
    @PostMapping("/wallet-service/walletdetails/walletId/{walletId}")
    public WalletDTO getWalletDetails(@PathVariable Integer walletId);
}


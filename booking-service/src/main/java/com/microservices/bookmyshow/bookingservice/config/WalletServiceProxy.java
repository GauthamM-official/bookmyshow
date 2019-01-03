package com.microservices.bookmyshow.bookingservice.config;

import java.util.List;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

import com.microservices.bookmyshow.bookingservice.dto.WalletDTO;

@FeignClient(name = "zuul-api-gateway-server")
@RibbonClient(name = "wallet-service")
public interface WalletServiceProxy
{
    @PostMapping("/wallet-service/getwallets")
    public List<WalletDTO> getWallets(String userName);
}

package com.microservices.bookmyshow.paymentservice.config;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.microservices.bookmyshow.paymentservice.dto.BookingDetailsDTO;

@FeignClient(name = "zuul-api-gateway-server")
@RibbonClient(name = "theatre-catalogue-service")
public interface BookingServiceProxy
{
    @PostMapping("/booking-service/bookingdetails/bookingId/{bookingId}")
    public BookingDetailsDTO getHistory(@PathVariable Integer bookingId);
}

package com.in28minutes.microservices.currency_conversion_service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.in28minutes.microservices.currency_conversion_service.bean.CurrencyConversion;

//@FeignClient(name= "currency-exchange", url="localhost:8001") this is for openfeign
@FeignClient(name="currency-exchange")
public interface CurrencyExchangeProxy 
{
	@GetMapping("currency-exchange/from/{from}/to/{to}")
	public CurrencyConversion retrieveExchangeValue(@PathVariable("from") String from,
			@PathVariable("to") String to);
	

}

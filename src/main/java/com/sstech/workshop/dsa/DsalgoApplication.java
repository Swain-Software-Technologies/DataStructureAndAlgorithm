package com.sstech.workshop.dsa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.sstech.workshop.dsa.iitkanpur.MinimumPositiveInteger;
import com.sstech.workshop.dsa.iitkanpur.SecondLargest;


@SpringBootApplication
public class DsalgoApplication {
	

	public static void main(String[] args) {
		SpringApplication.run(DsalgoApplication.class, args);
		System.out.println(MinimumPositiveInteger.calculateDivisor(12));
	}

}

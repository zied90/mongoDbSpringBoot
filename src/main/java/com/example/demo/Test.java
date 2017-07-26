package com.example.demo;



import java.util.Arrays;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.dao.HotelRepository;
import com.example.demo.entitie.Address;
import com.example.demo.entitie.Hotel;
import com.example.demo.entitie.Review;
@Component
public class Test implements CommandLineRunner {
	
	HotelRepository hotelRepository;
	

	public Test(HotelRepository hotelRepository) {
		super();
		this.hotelRepository = hotelRepository;
	}


	@Override
	public void run(String... arg0) throws Exception {
		Hotel mario=new Hotel("mario", 30, new Address("mednine", "tunisie"),Arrays.asList(new Review("sami", 8, true),new Review("karim", 18, false)) );
		Hotel ibis=new Hotel("ibis", 30, new Address("tunis", "tunisie"),Arrays.asList(new Review("walid", 8, false),new Review("karim", 18, false)) );
		
		this.hotelRepository.deleteAll();
		List<Hotel> hotels=Arrays.asList(mario,ibis);
		this.hotelRepository.save(hotels);
	}

}

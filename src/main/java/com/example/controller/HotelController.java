package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.HotelRepository;
import com.example.demo.entitie.Hotel;

@RestController
@RequestMapping("/hotels")
public class HotelController {

private HotelRepository hotelRepository;

	public HotelController(HotelRepository hotelRepository) {
		super();
		this.hotelRepository = hotelRepository;
	}
	@GetMapping("all")
	public List<Hotel> getAll(){
		List<Hotel> hotels=this.hotelRepository.findAll();
		return hotels;
	}
}

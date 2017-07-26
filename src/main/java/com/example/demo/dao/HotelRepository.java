package com.example.demo.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entitie.Hotel;

@Repository
public interface HotelRepository  extends MongoRepository<Hotel, String>{

}

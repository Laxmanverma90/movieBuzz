package com.grand.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.grand.entity.Seat;

public interface SeatRepository extends JpaRepository<Seat, Integer> {


//	Seat findByTheatreId(Integer theatreId);


//	public Seat findByTheatreId(int id);

}

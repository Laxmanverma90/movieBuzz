package com.grand.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.grand.entity.MyMovie;

public interface MyMovieRepository extends JpaRepository<MyMovie, Integer> {

}

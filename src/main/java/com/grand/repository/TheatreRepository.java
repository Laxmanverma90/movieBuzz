/**
 * 
 */
package com.grand.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.grand.entity.Theatre;

/**
 * @author Sushil
 *
 */
@Repository
public interface TheatreRepository extends JpaRepository<Theatre, Integer> {
	
	public Theatre findByTheatreName(String theatreName);

}

package com.grand.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author Laxman
 *
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Theatre implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer theatreId;
	private String theatreName;
	private double price;

	@OneToMany(mappedBy = "theatre", cascade = CascadeType.ALL)
	private List<Seat> seats;

//	@OneToOne
//	private MovieTheatre movieTheatre;

	@OneToMany(mappedBy = "theatre", cascade = CascadeType.ALL)
	private List<MyMovie> myMovies;
}
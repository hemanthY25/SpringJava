package com.example1.hy.demo;

import org.springframework.stereotype.Component;

@Component
public class Company {
		private String name;
		private int rank;
	public Company( String name ) {
		this.name = name;
	}
	public void setRank( int rank ) {
		this.rank = rank;
	}
	public int getRank() {
		return this.rank;
	}

	public String getName(){
		return this.name;
	}
}

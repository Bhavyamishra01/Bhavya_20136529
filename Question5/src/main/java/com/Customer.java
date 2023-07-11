package com;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer {



	

	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "cid")
	    private int cid;

	    @Column(name = "cname")
	    private String cname;

	    @Column(name = "place")
	    private String place;

	    @Column(name = "pan")
	    private String pan;

	    // Default constructor, getters, and setters

	    public Customer() {}

	    public int getCid() {
	        return cid;
	    }

	    public void setCid(int string) {
	        this.cid = string;
	    }

	    public String getCname() {
	        return cname;
	    }

	    public void setCname(String cname) {
	        this.cname = cname;
	    }

	    public String getPlace() {
	        return place;
	    }

	    public void setPlace(String place) {
	        this.place = place;
	    }

	    public String getPan() {
	        return pan;
	    }

	    public void setPan(String pan) {
	        this.pan = pan;
	    }
	}










}

package com.capgemini.spring.organization.model;
import org.springframework.stereotype.*;
import org.springframework.beans.factory.annotation.*;

@Component
public class Address{

	
	@Value("Mumbai")
	private String city;

	@Value("Maharashtra")
	private String state;

	
	@Value("421301")
	private int pincode;

	public Address() {
		super();
	}

	public Address(String city, String state, int pincode) {
		super();
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city){
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state){
		this.state = state;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode){
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "City: " + city +"\n" 
			+"State:" +state+ "\n"
			+"Pincode:" +pincode;
	}

}
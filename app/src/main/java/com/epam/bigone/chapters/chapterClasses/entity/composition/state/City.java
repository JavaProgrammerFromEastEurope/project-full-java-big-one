package com.epam.bigone.chapters.chapterClasses.entity.composition.state;

import java.util.List;

public class City {

	String city;
	String capital;
	List<District> districts;

	public City(List<District> districts, String city) {
		this.districts = districts;
		this.city = city;
	}

	public void setDistricts(List<District> districts) {
		this.districts = districts;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	public List<District> getDistricts() {
		return districts;
	}

	public String getCity() {
		return city;
	}

	@Override
	public String toString() {
		return String.format(
			"city='%s', districts=%s}", city, districts);
	}
}
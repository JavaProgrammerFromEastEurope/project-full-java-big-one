package com.epam.bigone.chapters.chapterClasses.entity.composition.state;

import java.util.List;

public class Region {

	String region;
	String mainCity;
	List<City> cities;

	public Region(String region, List<City> cities) {
		this.region = region;
		this.cities = cities;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public void setCities(List<City> cities) {
		this.cities = cities;
	}

	public void setMainCity(String mainCity) {
		this.mainCity = mainCity;
	}

	public String getMainCity() {
		return mainCity;
	}

	public String getRegion() {
		return region;
	}

	public List<City> getCities() {
		return cities;
	}

	@Override
	public String toString() {
		return String.format(
				"region='%s', cities=%s}", region, cities);
	}
}
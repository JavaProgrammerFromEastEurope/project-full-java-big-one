package com.epam.bigone.chapters.chapterClasses.entity.composition.state;

import static java.lang.String.format;

import java.util.List;

public class State {

	String state;
	String area;
	List<Region> regions;

	public State(String state, List<Region> regions) {
		this.state = state;
		this.regions = regions;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void setRegions(List<Region> regions) {
		this.regions = regions;
	}

	public String getArea() {
		return area;
	}

	public String getState() {
		return state;
	}

	public List<Region> getRegions() {
		return regions;
	}

	@Override
	public String toString() {
		return format(
				"state='%s', regions=%s}", state, regions);
	}
}
package com.epam.bigone.chapters.chapterClasses.entity.common.train;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Objects;

import static java.text.MessageFormat.format;

public class Travel implements Comparable<Travel> {

	private String destinationPoint;
	private Calendar destinationDate;
	private String estimatedTime;

	public Travel() {
		this.estimatedTime 		= "00:00";
		this.destinationPoint = "not indicated!";
		this.destinationDate 	= new GregorianCalendar();
	}

	public Travel(String destinationPoint,
			String estimatedTime, Calendar destinationDate) {
		this.destinationPoint = destinationPoint;
		this.estimatedTime 		= estimatedTime;
		this.destinationDate 	= destinationDate;
	}

	public void setDestinationPoint(String destinationPoint) {
		this.destinationPoint = destinationPoint;
	}

	public void setDestinationDate(Calendar destinationDate) {
		this.destinationDate = destinationDate;
	}

	public void setEstimatedTime(String estimatedTime) {
		this.estimatedTime = estimatedTime;
	}

	public String getDestinationPoint() {
		return destinationPoint;
	}

	public Calendar getDestinationDate() {
		return destinationDate;
	}

	public String getEstimatedTime() {
		return estimatedTime;
	}

	@Override
	public int compareTo(Travel o) {
		int destNotEqual = destinationPoint.compareTo(o.destinationPoint);
		return (destNotEqual != 0
						? destNotEqual
						: destinationDate.compareTo(o.destinationDate));
	}

	@Override
	public int hashCode() {
		return Objects.hash(super.hashCode(),
			destinationPoint, destinationDate, estimatedTime);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		if (!super.equals(o))
			return false;
		Travel that = (Travel) o;
		return Objects.equals(estimatedTime, that.estimatedTime)
				&& Objects.equals(destinationPoint, that.destinationPoint)
				&& Objects.equals(destinationDate, that.destinationDate);
	}

	@Override
	public String toString() {
		return format("{0} {1} {2}",
			destinationPoint, estimatedTime, destinationDate.getTime());
	}
}
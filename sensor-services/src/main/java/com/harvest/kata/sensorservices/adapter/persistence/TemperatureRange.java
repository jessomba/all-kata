package com.harvest.kata.sensorservices.adapter.persistence;

public class TemperatureRange {

	public static boolean isUpperOrEqualsTo(int temperature, int upperBound) {
		return (temperature >= upperBound);
	}

	public static boolean isStrictlyLowerTo(int temperature, int lowerBound) {
		return (temperature < lowerBound);
	}

	public static boolean isBetweenLowerAndUpper(int temperature, int lowerBound, int upperBound) {
		return ((temperature >= lowerBound) && (temperature < upperBound));
	}
}

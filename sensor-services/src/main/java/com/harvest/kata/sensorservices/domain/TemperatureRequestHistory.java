package com.harvest.kata.sensorservices.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class TemperatureRequestHistory {
	@Getter
	private final String requestDate;
	@Getter
	private final String sensorState;
	@Getter
	private final int temperature;
}

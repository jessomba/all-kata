package com.harvest.kata.sensorservices.application.service;

import com.harvest.kata.sensorservices.application.port.in.SensorStateUseCase;
import com.harvest.kata.sensorservices.application.port.out.SensorStatePort;
import com.harvest.kata.sensorservices.common.UseCase;

import lombok.AllArgsConstructor;

@UseCase
@AllArgsConstructor
public class SensorState implements SensorStateUseCase {

	private final SensorStatePort sensorStatePort;
	
	@Override
	public String stateOfSensor(int temperature) {
		return sensorStatePort.stateOfSensor(temperature);
	}
}

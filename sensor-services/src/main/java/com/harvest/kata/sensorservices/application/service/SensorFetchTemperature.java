package com.harvest.kata.sensorservices.application.service;

import com.harvest.kata.sensorservices.application.port.in.SensorFetchTemperatureUseCase;
import com.harvest.kata.sensorservices.application.port.out.SensorFetchTemperaturePort;
import com.harvest.kata.sensorservices.common.UseCase;

import lombok.AllArgsConstructor;

@UseCase
@AllArgsConstructor
public class SensorFetchTemperature implements SensorFetchTemperatureUseCase {

	private final SensorFetchTemperaturePort sensorFetchTemperaturePort;
	
	@Override
	public int fetchTemperature() {
		return sensorFetchTemperaturePort.fetchTemperature();
	}
}

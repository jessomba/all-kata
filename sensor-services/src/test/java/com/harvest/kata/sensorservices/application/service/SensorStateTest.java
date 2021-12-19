package com.harvest.kata.sensorservices.application.service;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.mockito.Mockito;

import com.harvest.kata.sensorservices.application.port.in.SensorStateUseCase;
import com.harvest.kata.sensorservices.application.port.out.SensorStatePort;

public class SensorStateTest {

	private final SensorStateUseCase sensorStateUseCase = Mockito
			.mock(SensorStateUseCase.class);

	private final SensorStatePort sensorStatePort = Mockito
			.mock(SensorStatePort.class);

	private final SensorState sensorState = new SensorState(
			sensorStatePort);

	@Test
	public void fetchTemperature() {
		// Arrange
		Mockito.when(sensorStatePort.stateOfSensor(45)).thenReturn("HOT");
		Mockito.when(sensorStatePort.stateOfSensor(20)).thenReturn("COLD");
		Mockito.when(sensorStatePort.stateOfSensor(28)).thenReturn("WARM");
		
		Mockito.when(sensorStateUseCase.stateOfSensor(45)).thenReturn("HOT");
		Mockito.when(sensorStateUseCase.stateOfSensor(20)).thenReturn("COLD");
		Mockito.when(sensorStateUseCase.stateOfSensor(28)).thenReturn("WARM");

		// Act
		String expectedHOT = sensorState.stateOfSensor(45);
		String expectedCOLD = sensorState.stateOfSensor(20);
		String expectedWARM = sensorState.stateOfSensor(28);

		// Assert
		assertThat(expectedHOT).isEqualTo("HOT");
		assertThat(expectedCOLD).isEqualTo("COLD");
		assertThat(expectedWARM).isEqualTo("WARM");
	}
}

package com.harvest.kata.sensorservices.application.service;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.mockito.Mockito;

import com.harvest.kata.sensorservices.application.port.in.SensorFetchTemperatureUseCase;
import com.harvest.kata.sensorservices.application.port.out.SensorFetchTemperaturePort;

public class SensorFetchTemperatureTest {

	private final SensorFetchTemperatureUseCase sensorFetchTemperatureUseCase = Mockito
			.mock(SensorFetchTemperatureUseCase.class);

	private final SensorFetchTemperaturePort sensorFetchTemperaturePort = Mockito
			.mock(SensorFetchTemperaturePort.class);

	private final SensorFetchTemperature sensorFetchTemperature = new SensorFetchTemperature(
			sensorFetchTemperaturePort);

	@Test
	public void fetchTemperature() {
		// Arrange
		Mockito.when(sensorFetchTemperaturePort.fetchTemperature()).thenReturn(10);
		Mockito.when(sensorFetchTemperatureUseCase.fetchTemperature()).thenReturn(10);

		// Act
		int expected = sensorFetchTemperature.fetchTemperature();

		// Assert
		assertThat(expected).isEqualTo(10);
	}
}

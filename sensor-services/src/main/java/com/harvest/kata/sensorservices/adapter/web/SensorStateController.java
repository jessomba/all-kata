package com.harvest.kata.sensorservices.adapter.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.harvest.kata.sensorservices.application.port.in.SensorFetchTemperatureUseCase;
import com.harvest.kata.sensorservices.application.port.in.SensorStateUseCase;
import com.harvest.kata.sensorservices.application.port.in.TemperatureRequestHistoryUseCase;
import com.harvest.kata.sensorservices.common.Utilities;
import com.harvest.kata.sensorservices.common.WebAdapter;
import com.harvest.kata.sensorservices.domain.TemperatureRequestHistory;

import lombok.RequiredArgsConstructor;

@WebAdapter
@RestController
@RequiredArgsConstructor
public class SensorStateController {

	private final SensorFetchTemperatureUseCase sensorFetchTemperatureUseCase;
	private final SensorStateUseCase sensorStateUseCase;
	private final TemperatureRequestHistoryUseCase temperatureRequestHistoryUseCase;
	private final Utilities utility;

	@GetMapping("/v1/state")
	String stateOfSensor() {
		int temperature = sensorFetchTemperatureUseCase.fetchTemperature();
		String state = sensorStateUseCase.stateOfSensor(temperature);
		temperatureRequestHistoryUseCase
				.saveTemperatureRequest(new TemperatureRequestHistory(utility.currentDate(), state, temperature));
		return state;
	}
}

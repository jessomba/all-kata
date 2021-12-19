package com.harvest.kata.sensorservices.adapter.web;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.harvest.kata.sensorservices.application.port.in.TemperatureRequestHistoryUseCase;
import com.harvest.kata.sensorservices.common.WebAdapter;
import com.harvest.kata.sensorservices.domain.TemperatureRequestHistory;

import lombok.RequiredArgsConstructor;

@WebAdapter
@RestController
@RequiredArgsConstructor
public class SensorRequestHistoryController {

	private final TemperatureRequestHistoryUseCase temperatureRequestHistoryUseCase;

	@GetMapping("/v1/history")
	ResponseEntity<List<TemperatureRequestHistory>> stateOfSensor() {
		List<TemperatureRequestHistory> histories = temperatureRequestHistoryUseCase.latest15History();
		return new ResponseEntity<>(histories, HttpStatus.OK);
	}
}

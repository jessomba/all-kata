package com.harvest.kata.sensorservices.application.service;

import java.util.List;

import com.harvest.kata.sensorservices.application.port.in.TemperatureRequestHistoryUseCase;
import com.harvest.kata.sensorservices.application.port.out.TemperatureRequestHistoryPort;
import com.harvest.kata.sensorservices.common.UseCase;
import com.harvest.kata.sensorservices.domain.TemperatureRequestHistory;

import lombok.AllArgsConstructor;

@UseCase
@AllArgsConstructor
public class RequestHistory implements TemperatureRequestHistoryUseCase {

	private final TemperatureRequestHistoryPort temperatureRequestHistoryPort;

	@Override
	public void saveTemperatureRequest(TemperatureRequestHistory domain) {
		temperatureRequestHistoryPort.saveOrUpdate(domain);

	}

	@Override
	public List<TemperatureRequestHistory> latest15History() {
		return temperatureRequestHistoryPort.last15TemperatureRequest();
	}

}

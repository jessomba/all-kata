package com.harvest.kata.sensorservices.application.port.in;

import java.util.List;

import com.harvest.kata.sensorservices.domain.TemperatureRequestHistory;

public interface TemperatureRequestHistoryUseCase {

	void saveTemperatureRequest(TemperatureRequestHistory domain);

	List<TemperatureRequestHistory> latest15History();

}
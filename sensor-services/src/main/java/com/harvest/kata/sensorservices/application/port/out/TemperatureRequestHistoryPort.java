package com.harvest.kata.sensorservices.application.port.out;

import java.util.List;

import com.harvest.kata.sensorservices.domain.TemperatureRequestHistory;

public interface TemperatureRequestHistoryPort {
	
	List<TemperatureRequestHistory> last15TemperatureRequest();

	void saveOrUpdate(TemperatureRequestHistory trh);
}

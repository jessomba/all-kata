package com.harvest.kata.sensorservices.adapter.persistence;

import java.util.ArrayList;
import java.util.List;

import com.harvest.kata.sensorservices.domain.TemperatureRequestHistory;

public class TemperatureRequestHistoryMapper {

	public static TemperatureRequestHistory mapEntityToDomain(TemperatureRequestHistoryEntity entity) {
		return new TemperatureRequestHistory(entity.getRequestDate(), entity.getSensorState(),
				entity.getTemperature());
	}

	public static TemperatureRequestHistoryEntity mapDomainToEntity(TemperatureRequestHistory domain) {
		return new TemperatureRequestHistoryEntity(domain.getRequestDate(), domain.getSensorState(),
				domain.getTemperature());
	}

	public static List<TemperatureRequestHistory> mapManyEntityToManyDomain(
			List<TemperatureRequestHistoryEntity> entities) {
		List<TemperatureRequestHistory> domains = new ArrayList<>();

		for (TemperatureRequestHistoryEntity entity : entities) {
			domains.add(new TemperatureRequestHistory(entity.getRequestDate(), entity.getSensorState(),
					entity.getTemperature()));
		}

		return domains;
	}
}

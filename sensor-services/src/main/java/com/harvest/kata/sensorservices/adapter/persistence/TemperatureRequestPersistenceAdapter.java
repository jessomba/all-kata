package com.harvest.kata.sensorservices.adapter.persistence;

import java.util.List;

import com.harvest.kata.sensorservices.application.port.out.TemperatureRequestHistoryPort;
import com.harvest.kata.sensorservices.common.PersistenceAdapter;
import com.harvest.kata.sensorservices.domain.TemperatureRequestHistory;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@PersistenceAdapter
public class TemperatureRequestPersistenceAdapter implements TemperatureRequestHistoryPort {

	private final TemperatureRequestHistoryRepository temperatureRepository;

	@Override
	public List<TemperatureRequestHistory> last15TemperatureRequest() {
		return TemperatureRequestHistoryMapper
				.mapManyEntityToManyDomain(temperatureRepository.last15TemperatureRequest());
	}

	@Override
	public void saveOrUpdate(TemperatureRequestHistory domain) {
		temperatureRepository.save(TemperatureRequestHistoryMapper.mapDomainToEntity(domain));
	}
}

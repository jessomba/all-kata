package com.harvest.kata.sensorservices.adapter.persistence;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface TemperatureRequestHistoryRepository extends CrudRepository<TemperatureRequestHistoryEntity, Integer> {

	@Query(nativeQuery = true, value = "SELECT request_date, sensor_state, temperature FROM temperature_request_history ORDER BY request_date DESC LIMIT 15")
	List<TemperatureRequestHistoryEntity> last15TemperatureRequest();
}

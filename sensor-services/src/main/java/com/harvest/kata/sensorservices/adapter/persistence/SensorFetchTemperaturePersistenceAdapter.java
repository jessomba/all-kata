package com.harvest.kata.sensorservices.adapter.persistence;

import org.springframework.web.client.RestTemplate;

import com.harvest.kata.sensorservices.application.port.out.SensorFetchTemperaturePort;
import com.harvest.kata.sensorservices.common.PersistenceAdapter;

@PersistenceAdapter
public class SensorFetchTemperaturePersistenceAdapter implements SensorFetchTemperaturePort{

	@Override
	public int fetchTemperature() {
		String uri = "http://localhost:8080/v1/temperature";
		RestTemplate restTemplate = new RestTemplate();
		int result = restTemplate.getForObject(uri, Integer.class);
		return result;
	}
}

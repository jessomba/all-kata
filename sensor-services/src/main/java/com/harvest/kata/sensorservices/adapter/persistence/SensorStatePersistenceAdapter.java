package com.harvest.kata.sensorservices.adapter.persistence;

import com.harvest.kata.sensorservices.application.port.out.SensorStatePort;
import com.harvest.kata.sensorservices.common.PersistenceAdapter;

@PersistenceAdapter
public class SensorStatePersistenceAdapter implements SensorStatePort {

	@Override
	public String stateOfSensor(int temperature) {
		if (TemperatureRange.isUpperOrEqualsTo(temperature, 40))
			return SensorState.STATEHOT.getState();
		else if (TemperatureRange.isStrictlyLowerTo(temperature, 22))
			return SensorState.STATECOLD.getState();
		else if (TemperatureRange.isBetweenLowerAndUpper(temperature, 22, 40))
			return SensorState.STATEWARM.getState();
		else
			return SensorState.STATENOTDEFINED.getState();
	}

}

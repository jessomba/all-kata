package com.harvest.kata.sensorservices.adapter.persistence;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum SensorState implements State {
	STATEHOT("HOT"), STATECOLD("COLD"), STATEWARM("WARM"), STATENOTDEFINED("NOT DEFINED");

	private final String state;

	@Override
	public String getState() {
		return state;
	}

}

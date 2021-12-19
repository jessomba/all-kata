package com.harvest.kata.sensorservices.adapter.persistence;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "temperature_request_history")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TemperatureRequestHistoryEntity {
	@Id
	private  String requestDate;
	private  String sensorState;
	private  int temperature;
}

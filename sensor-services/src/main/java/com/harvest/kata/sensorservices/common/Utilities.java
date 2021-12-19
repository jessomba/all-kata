package com.harvest.kata.sensorservices.common;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.stereotype.Component;
@Component
public class Utilities {

	public String currentDate() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("ddMMuuuuHHmmss");
		LocalDateTime now = LocalDateTime.now();
		return dtf.format(now);
	}
}

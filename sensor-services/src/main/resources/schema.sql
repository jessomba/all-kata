DROP TABLE IF EXISTS temperature_request_history;

CREATE TABLE temperature_request_history (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  request_date VARCHAR(250) NOT NULL,
  sensor_state VARCHAR(10) NOT NULL,
  temperature INT NOT NULL
);
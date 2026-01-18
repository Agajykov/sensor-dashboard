package com.backend.service;

import java.util.List;

import com.backend.dao.SensorDao;
import com.backend.model.Sensor;
import com.backend.util.CsvUtil;

public class SensorService {

	private final SensorDao dao = new SensorDao();

	public List<Sensor> loadFromCsvAndSave() {
    List<Sensor> sensors = CsvUtil.readSensorsFromCsv("sensors.csv");
    for (Sensor s : sensors) {
        dao.save(s);
    }
    return sensors;
}

	public List<Sensor> getAll() {
		return dao.findAll();
	}
	// public Sensor fetchFromAwsAndSave() {
	// 	// Fetch from AWS API
	// 	Client client = ClientBuilder.newClient();
	// 	Sensor sensor = client
	// 		.target("https://your-aws-api-endpoint.com/sensor")
	// 		.request(MediaType.APPLICATION_JSON)
	// 		.get(Sensor.class);
	
	// 	dao.save(sensor);
	// 	return sensor;
	// }
}

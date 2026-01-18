package com.backend.util;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.backend.model.Sensor;

public class CsvUtil {

	public static List<Sensor> readSensorsFromCsv(String fileName) {

    List<Sensor> sensors = new ArrayList<>();

    try (
        InputStream is = CsvUtil.class
            .getClassLoader()
            .getResourceAsStream(fileName);
        BufferedReader br = new BufferedReader(new InputStreamReader(is))
    ) {
        String line;
        br.readLine(); // skip header

        while ((line = br.readLine()) != null) {
            String[] values = line.split(",");

            Sensor sensor = new Sensor();
            sensor.setSensorId(Long.parseLong(values[0]));
            sensor.setTimestamp(LocalDateTime.parse(values[1]));
            sensor.setLeitfaehigkeit(Double.parseDouble(values[2]));
            sensor.setSystemdruck(Double.parseDouble(values[3]));
            sensor.setFrequenzInv2(Double.parseDouble(values[4]));
            sensor.setFrequenzInv3(Double.parseDouble(values[5]));
            sensor.setVoltageDrv2(Double.parseDouble(values[6]));
            sensor.setVoltageDrv3(Double.parseDouble(values[7]));
            sensor.setWaterTodayIn(Double.parseDouble(values[8]));
            sensor.setWaterTodayPro(Double.parseDouble(values[9]));
            sensor.setWaterTotalIn(Double.parseDouble(values[10]));
            sensor.setWaterTotalPro(Double.parseDouble(values[11]));
            sensor.setTempDrv2(Double.parseDouble(values[12]));
            sensor.setTempDrv3(Double.parseDouble(values[13]));
            sensor.setValvesFlush(Boolean.parseBoolean(values[14]));
            sensor.setValvesCIP(Boolean.parseBoolean(values[15]));
            sensor.setMachineId(Integer.parseInt(values[16]));

            sensors.add(sensor);
        }

    } catch (Exception e) {
        throw new RuntimeException("Failed to read CSV", e);
    }

    return sensors;
}

}

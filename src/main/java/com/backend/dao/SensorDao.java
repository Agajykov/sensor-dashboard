package com.backend.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import com.backend.model.Sensor;
import com.backend.util.DatabaseUtil;

public class SensorDao {

    // Save a Sensor to the database
    public void save(Sensor sensor) {
        String sql = "INSERT INTO sensor (" +
                "sensor_id, timestamp, leitfaehigkeit, systemdruck, frequenz_inv2, frequenz_inv3, " +
                "voltage_drv2, voltage_drv3, water_today_in, water_today_pro, water_total_in, water_total_pro, " +
                "temp_drv2, temp_drv3, valves_flush, valves_cip, machine_id) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection con = DatabaseUtil.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setLong(1, sensor.getSensorId());
            ps.setTimestamp(2, Timestamp.valueOf(sensor.getTimestamp()));
            ps.setDouble(3, sensor.getLeitfaehigkeit());
            ps.setDouble(4, sensor.getSystemdruck());
            ps.setDouble(5, sensor.getFrequenzInv2());
            ps.setDouble(6, sensor.getFrequenzInv3());
            ps.setDouble(7, sensor.getVoltageDrv2());
            ps.setDouble(8, sensor.getVoltageDrv3());
            ps.setDouble(9, sensor.getWaterTodayIn());
            ps.setDouble(10, sensor.getWaterTodayPro());
            ps.setDouble(11, sensor.getWaterTotalIn());
            ps.setDouble(12, sensor.getWaterTotalPro());
            ps.setDouble(13, sensor.getTempDrv2());
            ps.setDouble(14, sensor.getTempDrv3());
            ps.setBoolean(15, sensor.getValvesFlush());
            ps.setBoolean(16, sensor.getValvesCIP());
            ps.setInt(17, sensor.getMachineId());

            ps.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException("Error saving sensor: " + e.getMessage(), e);
        }
    }

    // Retrieve all sensors from the database
    public List<Sensor> findAll() {
        List<Sensor> sensors = new ArrayList<>();
        String sql = "SELECT * FROM sensor";

        try (Connection con = DatabaseUtil.getConnection();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {
                Sensor s = new Sensor();
                s.setSensorId(rs.getLong("sensor_id"));
                s.setTimestamp(rs.getTimestamp("timestamp").toLocalDateTime());
                s.setLeitfaehigkeit(rs.getDouble("leitfaehigkeit"));
                s.setSystemdruck(rs.getDouble("systemdruck"));
                s.setFrequenzInv2(rs.getDouble("frequenz_inv2"));
                s.setFrequenzInv3(rs.getDouble("frequenz_inv3"));
                s.setVoltageDrv2(rs.getDouble("voltage_drv2"));
                s.setVoltageDrv3(rs.getDouble("voltage_drv3"));
                s.setWaterTodayIn(rs.getDouble("water_today_in"));
                s.setWaterTodayPro(rs.getDouble("water_today_pro"));
                s.setWaterTotalIn(rs.getDouble("water_total_in"));
                s.setWaterTotalPro(rs.getDouble("water_total_pro"));
                s.setTempDrv2(rs.getDouble("temp_drv2"));
                s.setTempDrv3(rs.getDouble("temp_drv3"));
                s.setValvesFlush(rs.getBoolean("valves_flush"));
                s.setValvesCIP(rs.getBoolean("valves_cip"));
                s.setMachineId(rs.getInt("machine_id"));

                sensors.add(s);
            }

        } catch (SQLException e) {
            throw new RuntimeException("Error retrieving sensors: " + e.getMessage(), e);
        }

        return sensors;
    }
}

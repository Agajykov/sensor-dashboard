package com.backend.model;

import java.time.LocalDateTime;

public class Sensor {
    private Long sensorId;                  // sensor_id
    private LocalDateTime timestamp;        // timestamp
    private Double leitfaehigkeit;          // Leitfaehigkeit
    private Double systemdruck;             // Systemdruck
    private Double frequenzInv2;            // Frequenz_Inv2
    private Double frequenzInv3;            // Frequenz_Inv3
    private Double voltageDrv2;             // Voltage_Drv2
    private Double voltageDrv3;             // Voltage_Drv3
    private Double waterTodayIn;            // WaterToday_in
    private Double waterTodayPro;           // WaterToday_pro
    private Double waterTotalIn;            // WaterTotal_in
    private Double waterTotalPro;           // WaterTotal_pro
    private Double tempDrv2;                // Temp_Drv2
    private Double tempDrv3;                // Temp_Drv3
    private Boolean valvesFlush;            // Valves_Flush
    private Boolean valvesCIP;              // Valves_CIP
    private Integer machineId;              // mashine_i


    // Default constructor
    public Sensor() {
    }

    // Getters and Setters
    public Long getSensorId() { return sensorId; }
    public void setSensorId(Long sensorId) { this.sensorId = sensorId; }

    public LocalDateTime getTimestamp() { return timestamp; }
    public void setTimestamp(LocalDateTime timestamp) { this.timestamp = timestamp; }

    public Double getLeitfaehigkeit() { return leitfaehigkeit; }
    public void setLeitfaehigkeit(Double leitfaehigkeit) { this.leitfaehigkeit = leitfaehigkeit; }

    public Double getSystemdruck() { return systemdruck; }
    public void setSystemdruck(Double systemdruck) { this.systemdruck = systemdruck; }

    public Double getFrequenzInv2() { return frequenzInv2; }
    public void setFrequenzInv2(Double frequenzInv2) { this.frequenzInv2 = frequenzInv2; }

    public Double getFrequenzInv3() { return frequenzInv3; }
    public void setFrequenzInv3(Double frequenzInv3) { this.frequenzInv3 = frequenzInv3; }

    public Double getVoltageDrv2() { return voltageDrv2; }
    public void setVoltageDrv2(Double voltageDrv2) { this.voltageDrv2 = voltageDrv2; }

    public Double getVoltageDrv3() { return voltageDrv3; }
    public void setVoltageDrv3(Double voltageDrv3) { this.voltageDrv3 = voltageDrv3; }

    public Double getWaterTodayIn() { return waterTodayIn; }
    public void setWaterTodayIn(Double waterTodayIn) { this.waterTodayIn = waterTodayIn; }

    public Double getWaterTodayPro() { return waterTodayPro; }
    public void setWaterTodayPro(Double waterTodayPro) { this.waterTodayPro = waterTodayPro; }

    public Double getWaterTotalIn() { return waterTotalIn; }
    public void setWaterTotalIn(Double waterTotalIn) { this.waterTotalIn = waterTotalIn; }

    public Double getWaterTotalPro() { return waterTotalPro; }
    public void setWaterTotalPro(Double waterTotalPro) { this.waterTotalPro = waterTotalPro; }

    public Double getTempDrv2() { return tempDrv2; }
    public void setTempDrv2(Double tempDrv2) { this.tempDrv2 = tempDrv2; }

    public Double getTempDrv3() { return tempDrv3; }
    public void setTempDrv3(Double tempDrv3) { this.tempDrv3 = tempDrv3; }

    public Boolean getValvesFlush() { return valvesFlush; }
    public void setValvesFlush(Boolean valvesFlush) { this.valvesFlush = valvesFlush; }

    public Boolean getValvesCIP() { return valvesCIP; }
    public void setValvesCIP(Boolean valvesCIP) { this.valvesCIP = valvesCIP; }

    public Integer getMachineId() { return machineId; }
    public void setMachineId(Integer machineId) { this.machineId = machineId; }

    @Override
    public String toString() {
        return "Sensor{" +
                "sensorId=" + sensorId +
                ", timestamp=" + timestamp +
                ", leitfaehigkeit=" + leitfaehigkeit +
                ", systemdruck=" + systemdruck +
                ", frequenzInv2=" + frequenzInv2 +
                ", frequenzInv3=" + frequenzInv3 +
                ", voltageDrv2=" + voltageDrv2 +
                ", voltageDrv3=" + voltageDrv3 +
                ", waterTodayIn=" + waterTodayIn +
                ", waterTodayPro=" + waterTodayPro +
                ", waterTotalIn=" + waterTotalIn +
                ", waterTotalPro=" + waterTotalPro +
                ", tempDrv2=" + tempDrv2 +
                ", tempDrv3=" + tempDrv3 +
                ", valvesFlush=" + valvesFlush +
                ", valvesCIP=" + valvesCIP +
                ", machineId=" + machineId +
                '}';
    }

    public void setName(String string) {        
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setName'");
    }
}

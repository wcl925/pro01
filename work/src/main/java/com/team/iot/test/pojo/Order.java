package com.team.iot.test.pojo;

import java.util.Date;

public class Order {
    private String number;
    private String date;
    private String contract;
    private String road;
    private String Licenseplate;
    private String Model;
    private String Trainnumber;
    private String contractor;
    private String driverid;
    private String drivername;
    private String phone;
    private String loadingtime;
    private String Departuretime;
    private String arrivaltime;
    private String freight;
    private String Order;
    private String payment;
    private String Repairfee;
    private String Actuallicenseplate;
    private String remarks;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getContract() {
        return contract;
    }

    public void setContract(String contract) {
        this.contract = contract;
    }

    public String getRoad() {
        return road;
    }

    public void setRoad(String road) {
        this.road = road;
    }

    public String getLicenseplate() {
        return Licenseplate;
    }

    public void setLicenseplate(String licenseplate) {
        Licenseplate = licenseplate;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public String getTrainnumber() {
        return Trainnumber;
    }

    public void setTrainnumber(String trainnumber) {
        Trainnumber = trainnumber;
    }

    public String getContractor() {
        return contractor;
    }

    public void setContractor(String contractor) {
        this.contractor = contractor;
    }

    public String getDriverid() {
        return driverid;
    }

    public void setDriverid(String driverid) {
        this.driverid = driverid;
    }

    public String getDrivername() {
        return drivername;
    }

    public void setDrivername(String drivername) {
        this.drivername = drivername;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getLoadingtime() {
        return loadingtime;
    }

    public void setLoadingtime(String loadingtime) {
        this.loadingtime = loadingtime;
    }

    public String getDeparturetime() {
        return Departuretime;
    }

    public void setDeparturetime(String departuretime) {
        Departuretime = departuretime;
    }

    public String getArrivaltime() {
        return arrivaltime;
    }

    public void setArrivaltime(String arrivaltime) {
        this.arrivaltime = arrivaltime;
    }

    public String getFreight() {
        return freight;
    }

    public void setFreight(String freight) {
        this.freight = freight;
    }

    public String getOrder() {
        return Order;
    }

    public void setOrder(String order) {
        Order = order;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public String getRepairfee() {
        return Repairfee;
    }

    public void setRepairfee(String repairfee) {
        Repairfee = repairfee;
    }

    public String getActuallicenseplate() {
        return Actuallicenseplate;
    }

    public void setActuallicenseplate(String actuallicenseplate) {
        Actuallicenseplate = actuallicenseplate;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Override
    public String toString() {
        return "Order{" +
                "number='" + number + '\'' +
                ", date='" + date + '\'' +
                ", contract='" + contract + '\'' +
                ", road='" + road + '\'' +
                ", Licenseplate='" + Licenseplate + '\'' +
                ", Model='" + Model + '\'' +
                ", Trainnumber='" + Trainnumber + '\'' +
                ", contractor='" + contractor + '\'' +
                ", driverid='" + driverid + '\'' +
                ", drivername='" + drivername + '\'' +
                ", phone='" + phone + '\'' +
                ", loadingtime='" + loadingtime + '\'' +
                ", Departuretime='" + Departuretime + '\'' +
                ", arrivaltime='" + arrivaltime + '\'' +
                ", freight='" + freight + '\'' +
                ", Order='" + Order + '\'' +
                ", payment='" + payment + '\'' +
                ", Repairfee='" + Repairfee + '\'' +
                ", Actuallicenseplate='" + Actuallicenseplate + '\'' +
                ", remarks='" + remarks + '\'' +
                '}';
    }
}

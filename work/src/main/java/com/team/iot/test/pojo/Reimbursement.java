package com.team.iot.test.pojo;

public class Reimbursement {
    private String Reimbursementnumber;
    private String YBTinformation;
    private String YBTpicture;
    private String costpicture;
    private String Fuelcharge;
    private String cost;
    private String Fuelchargepicture;
    private String ParkingRate;
    private String Ureafee;
    private String Ureafeepicture;
    private String otherexpenses;
    private String otherexpensespicture;
    private String arrivaltime;
    private String total;
    private String ParkingRatepicture;

    public String getReimbursementnumber() {
        return Reimbursementnumber;
    }

    public void setReimbursementnumber(String reimbursementnumber) {
        Reimbursementnumber = reimbursementnumber;
    }

    public String getYBTinformation() {
        return YBTinformation;
    }

    public void setYBTinformation(String YBTinformation) {
        this.YBTinformation = YBTinformation;
    }

    public String getYBTpicture() {
        return YBTpicture;
    }

    public void setYBTpicture(String YBTpicture) {
        this.YBTpicture = YBTpicture;
    }

    public String getCostpicture() {
        return costpicture;
    }

    public void setCostpicture(String costpicture) {
        this.costpicture = costpicture;
    }

    public String getFuelcharge() {
        return Fuelcharge;
    }

    public void setFuelcharge(String fuelcharge) {
        Fuelcharge = fuelcharge;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getFuelchargepicture() {
        return Fuelchargepicture;
    }

    public void setFuelchargepicture(String fuelchargepicture) {
        Fuelchargepicture = fuelchargepicture;
    }

    public String getParkingRate() {
        return ParkingRate;
    }

    public void setParkingRate(String parkingRate) {
        ParkingRate = parkingRate;
    }

    public String getUreafee() {
        return Ureafee;
    }

    public void setUreafee(String ureafee) {
        Ureafee = ureafee;
    }

    public String getUreafeepicture() {
        return Ureafeepicture;
    }

    public void setUreafeepicture(String ureafeepicture) {
        Ureafeepicture = ureafeepicture;
    }

    public String getOtherexpenses() {
        return otherexpenses;
    }

    public void setOtherexpenses(String otherexpenses) {
        this.otherexpenses = otherexpenses;
    }

    public String getOtherexpensespicture() {
        return otherexpensespicture;
    }

    public void setOtherexpensespicture(String otherexpensespicture) {
        this.otherexpensespicture = otherexpensespicture;
    }

    public String getArrivaltime() {
        return arrivaltime;
    }

    public void setArrivaltime(String arrivaltime) {
        this.arrivaltime = arrivaltime;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getParkingRatepicture() {
        return ParkingRatepicture;
    }

    public void setParkingRatepicture(String parkingRatepicture) {
        ParkingRatepicture = parkingRatepicture;
    }

    @Override
    public String toString() {
        return "Reimbursement{" +
                "Reimbursementnumber='" + Reimbursementnumber + '\'' +
                ", YBTinformation='" + YBTinformation + '\'' +
                ", YBTpicture='" + YBTpicture + '\'' +
                ", costpicture='" + costpicture + '\'' +
                ", Fuelcharge='" + Fuelcharge + '\'' +
                ", cost='" + cost + '\'' +
                ", Fuelchargepicture='" + Fuelchargepicture + '\'' +
                ", ParkingRate='" + ParkingRate + '\'' +
                ", Ureafee='" + Ureafee + '\'' +
                ", Ureafeepicture='" + Ureafeepicture + '\'' +
                ", otherexpenses='" + otherexpenses + '\'' +
                ", otherexpensespicture='" + otherexpensespicture + '\'' +
                ", arrivaltime='" + arrivaltime + '\'' +
                ", total='" + total + '\'' +
                ", ParkingRatepicture='" + ParkingRatepicture + '\'' +
                '}';
    }
}

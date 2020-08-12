package com.team.iot.test.pojo;

public class Driver {

            private  String id;
            private  String name;
            private  String phone;
            private  String password;
            private  String IDcard;
            private  String IDcardA;
            private  String IDcardB;
            private  String license;
            private  String qualificationpicture;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getIDcard() {
        return IDcard;
    }

    public void setIDcard(String IDcard) {
        this.IDcard = IDcard;
    }

    public String getIDcardA() {
        return IDcardA;
    }

    public void setIDcardA(String IDcardA) {
        this.IDcardA = IDcardA;
    }

    public String getIDcardB() {
        return IDcardB;
    }

    public void setIDcardB(String IDcardB) {
        this.IDcardB = IDcardB;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public String getQualificationpicture() {
        return qualificationpicture;
    }

    public void setQualificationpicture(String qualificationpicture) {
        this.qualificationpicture = qualificationpicture;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", password='" + password + '\'' +
                ", IDcard='" + IDcard + '\'' +
                ", IDcardA='" + IDcardA + '\'' +
                ", IDcardB='" + IDcardB + '\'' +
                ", license='" + license + '\'' +
                ", qualificationpicture='" + qualificationpicture + '\'' +
                '}';
    }
}

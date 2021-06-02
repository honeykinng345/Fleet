package com.fleet.pk;

public class DataModel {
    public String carName, carModel,carChasiNum,CarNumber;

    public DataModel(String carName, String carModel, String carChasiNum, String carNumber) {
        this.carName = carName;
        this.carModel = carModel;
        this.carChasiNum = carChasiNum;
        CarNumber = carNumber;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getCarChasiNum() {
        return carChasiNum;
    }

    public void setCarChasiNum(String carChasiNum) {
        this.carChasiNum = carChasiNum;
    }

    public String getCarNumber() {
        return CarNumber;
    }

    public void setCarNumber(String carNumber) {
        CarNumber = carNumber;
    }
}

package com.rakovets.course.java.core.practice.jcf_set.enums;

public enum CityName {
    BREST("Брест"), VITEBSK("Витебск"), GOMEL("Гомель"), GRODNO("Гродно"), MINSK_REGION("Минская обл."), MOGILEV("Могилев"), MINSK("Минск");
    private String cityName;

    CityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCityName() {
        return cityName;
    }
}

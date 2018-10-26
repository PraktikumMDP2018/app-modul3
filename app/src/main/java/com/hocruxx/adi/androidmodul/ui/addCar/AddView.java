package com.hocruxx.adi.androidmodul.ui.addCar;

public interface AddView {
    String getName();

    String getMerk();

    String getModel();

    String getYear();

    void successAddCar();

    void failedAddCar();
}

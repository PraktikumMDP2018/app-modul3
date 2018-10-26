package com.hocruxx.adi.androidmodul.ui.home;

import com.hocruxx.adi.androidmodul.data.model.DataCar;

import java.util.List;

interface HomeView {

    void successShowCar(List<DataCar> dataCars);

    void failedShowCar(String message);

}

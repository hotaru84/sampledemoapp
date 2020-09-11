package com.example.demoapp.ui.home;

import android.util.Log;
import android.view.View;

import androidx.databinding.Bindable;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.google.android.material.chip.Chip;

public class HomeViewModel extends ViewModel {
    private MutableLiveData<Boolean> isBarcodeEnable = new MutableLiveData<>();
    private MutableLiveData<Boolean> is2DcodeEnable = new MutableLiveData<>();
    private MutableLiveData<Boolean> isOcrcodeEnable = new MutableLiveData<>();
    public MutableLiveData<Boolean> getIsBarcodeEnable() {
        return isBarcodeEnable;
    }

    public MutableLiveData<Boolean> getIs2DcodeEnable() {
        return is2DcodeEnable;
    }

    public MutableLiveData<Boolean> getIsOcrcodeEnable() {
        return isOcrcodeEnable;
    }
}
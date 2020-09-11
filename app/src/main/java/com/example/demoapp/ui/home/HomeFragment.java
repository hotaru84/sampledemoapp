package com.example.demoapp.ui.home;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import com.example.demoapp.R;
import com.example.demoapp.databinding.FragmentHomeBinding;

public class HomeFragment extends Fragment {

    private String TAG = getClass().getSimpleName();
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        HomeViewModel homeViewModel = new ViewModelProvider(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        FragmentHomeBinding binding = FragmentHomeBinding.inflate(inflater, (ViewGroup) root,false);
        homeViewModel.getIsBarcodeEnable().observe(getViewLifecycleOwner(),b->{
            //Changed
            Log.d(TAG,b+"");
        });
        binding.setViewModel(homeViewModel);
        return binding.getRoot();
    }
}
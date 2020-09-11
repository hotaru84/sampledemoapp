package com.example.demoapp.ui.home;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Toast;

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
            Toast.makeText(getContext(),"chip:" + b,Toast.LENGTH_SHORT).show();
        });
        homeViewModel.getSelectedMode().observe(getViewLifecycleOwner(),i->{
            Toast.makeText(getContext(),"spinner:" + i,Toast.LENGTH_SHORT).show();
        });
        binding.setViewModel(homeViewModel);
        ArrayAdapter adapter = ArrayAdapter.createFromResource(getContext(),R.array.list_label,R.layout.spinner_item);
        adapter.setDropDownViewResource(R.layout.spinner_dropdown_item);
        binding.spinner.setAdapter(adapter);
        return binding.getRoot();
    }
}
package com.example.parcial3;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.Toast;


import androidx.fragment.app.Fragment;

public class HomeFragment extends Fragment {

    private View v;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.activity_home, container, false);

        configureImageButton();
        return v;
    }

    private void configureImageButton() {
        ImageButton btn = (ImageButton) v.findViewById(R.id.boton1);

        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "You Clicked the button!", Toast.LENGTH_LONG).show();

            }
        });
    }
}
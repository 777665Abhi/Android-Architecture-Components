package com.abhi.androidarchitecturecomponent.fragment;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import com.abhi.androidarchitecturecomponent.R;

public class GameFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_game, container, false);
    }


    @Override
public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
    super.onViewCreated(view, savedInstanceState);
    Button buttonGame=view.findViewById(R.id.buttonGame);
    final NavController navController = Navigation.findNavController(view);

    buttonGame.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            navController.navigate(R.id.action_gameFragment_to_endFragment);
        }
    });
}
}

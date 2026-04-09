package com.example.lab4;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

public class FragmentTwo extends Fragment {

    // Variables globales
    private TextView tvValue_mouad;
    private SeekBar seek_mouad;
    private int progress_mouad = 0;
    private static final String KEY_PROGRESS_MOUAD = "progress";

    public FragmentTwo() {
        super(R.layout.fragment_two);
    }

    @Override
    public void onViewCreated(@NonNull View view_mouad, @Nullable Bundle savedInstanceState_mouad) {
        super.onViewCreated(view_mouad, savedInstanceState_mouad);
        
        tvValue_mouad = view_mouad.findViewById(R.id.tvValue);
        seek_mouad = view_mouad.findViewById(R.id.seekBar);

        // Restauration de la valeur
        if (savedInstanceState_mouad != null) {
            progress_mouad = savedInstanceState_mouad.getInt(KEY_PROGRESS_MOUAD, 0);
            seek_mouad.setProgress(progress_mouad);
            tvValue_mouad.setText("Valeur actuelle : " + progress_mouad);
        }

        // Ecouteur de la barre de progression
        seek_mouad.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override 
            public void onProgressChanged(SeekBar s_mouad, int p_mouad, boolean fromUser_mouad) {
                progress_mouad = p_mouad;
                tvValue_mouad.setText("Valeur actuelle : " + p_mouad);
            }
            @Override public void onStartTrackingTouch(SeekBar s_mouad) {}
            @Override public void onStopTrackingTouch(SeekBar s_mouad) {}
        });
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState_mouad) {
        super.onSaveInstanceState(outState_mouad);
        // Sauvegarde des donnees
        outState_mouad.putInt(KEY_PROGRESS_MOUAD, progress_mouad);
    }
}

// realise par CHARRAJ Mouad aka ZERO-XR7

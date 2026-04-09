package com.example.lab4;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FragmentOne extends Fragment {

    // Variables pour la vue
    private TextView tv_mouad;
    private Button btn_mouad;

    public FragmentOne() {
        super(R.layout.fragment_one); 
    }

    @Override
    public void onViewCreated(@NonNull View view_mouad, @Nullable Bundle savedInstanceState_mouad) {
        super.onViewCreated(view_mouad, savedInstanceState_mouad);
        
        // Liaison XML et Java
        tv_mouad = view_mouad.findViewById(R.id.textOne);
        btn_mouad = view_mouad.findViewById(R.id.btnHello);

        // Gestion du clic
        btn_mouad.setOnClickListener(v_mouad -> {
            tv_mouad.setText("Action effectuee sur Section A");
        });
    }
}

// realise par CHARRAJ Mouad aka ZERO-XR7

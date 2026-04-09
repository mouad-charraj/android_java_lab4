package com.example.lab4;

import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

public class MainActivity extends AppCompatActivity {

    // Boutons de navigation
    private Button btn1_mouad;
    private Button btn2_mouad;

    @Override
    protected void onCreate(Bundle savedInstanceState_mouad) {
        super.onCreate(savedInstanceState_mouad);
        setContentView(R.layout.activity_main);

        // Initialisation des boutons
        btn1_mouad = findViewById(R.id.btnFragment1);
        btn2_mouad = findViewById(R.id.btnFragment2);

        // Clic pour charger le premier fragment
        btn1_mouad.setOnClickListener(v_mouad -> {
            afficherFragment_mouad(new FragmentOne());
        });

        // Clic pour charger le second fragment
        btn2_mouad.setOnClickListener(v_mouad -> {
            afficherFragment_mouad(new FragmentTwo());
        });
    }

    // Methode simple pour le changement de contenu
    private void afficherFragment_mouad(Fragment f_mouad) {
        getSupportFragmentManager()
            .beginTransaction()
            .replace(R.id.fragment_container, f_mouad)
            .addToBackStack(null)
            .commit();
    }
}

// realise par CHARRAJ Mouad aka ZERO-XR7

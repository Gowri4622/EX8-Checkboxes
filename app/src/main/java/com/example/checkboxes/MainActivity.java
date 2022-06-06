package com.example.checkboxes;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private CheckBox chkCSE, chkEEE, chkECE, chkMECH, chkCIVIL, chkAIDS, chkAIML, chkEIE, chkBME;

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        chkCSE = findViewById(R.id.cse);
        chkEEE = findViewById(R.id.eee);
        chkECE = findViewById(R.id.ece);
        chkMECH = findViewById(R.id.mech);
        chkCIVIL = findViewById(R.id.civil);
        chkAIDS = findViewById(R.id.aids);
        chkAIML = findViewById(R.id.aiml);
        chkEIE = findViewById(R.id.eie);
        chkBME = findViewById(R.id.bme);
    }

    public void showSelected(View view) {

        String selected = "You selected: \n";

        if(chkCSE.isChecked())
            selected += "CSE";

        if(chkEEE.isChecked())
            selected += "\nEEE";

        if(chkECE.isChecked())
            selected += "\nECE";

        if(chkMECH.isChecked())
            selected += "\nMECH";

        if(chkCIVIL.isChecked())
            selected += "\nCIVIL";

        if(chkAIDS.isChecked())
            selected += "AIDS";

        if(chkAIML.isChecked())
            selected += "AIML";

        if(chkEIE.isChecked())
            selected += "EIE";

        if(chkBME.isChecked())
            selected += "BME";

        Toast.makeText(MainActivity.this, selected, Toast.LENGTH_SHORT).show();
    }
}
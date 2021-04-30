package fr.sio.covoiturage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AccueilActivity extends AppCompatActivity {
    Button buttonInscri;
    Button buttonList;
    Button buttonRetour;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accueil);

        buttonInscri = (Button) findViewById(R.id.buttonInscrption);
        buttonList = (Button) findViewById(R.id.buttonListProf);
        buttonRetour = (Button) findViewById(R.id.buttonRetour);

        buttonInscri.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                openActivityInscri();
            }

        });
        buttonRetour.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                openActivityRetour();
            }
        });
        buttonList.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                openActivityListProf();
            }

        });

    }

    public void openActivityRetour(){
        Intent mainActi = new Intent(this,MainActivity.class);
        startActivity(mainActi);
    }

        public void openActivityInscri(){
            Intent accueil = new Intent(this, Inscription.class);
            startActivity(accueil);
        }
    public void openActivityListProf(){
        Intent listProf = new Intent(this, ListProfActivity.class);
        startActivity(listProf);
    }





}
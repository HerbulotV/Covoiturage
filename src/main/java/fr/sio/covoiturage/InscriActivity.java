package fr.sio.covoiturage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class InscriActivity extends AppCompatActivity {

    Button buttonAccueil;
    Button retour;
    Button deconnexion;
    TextView dataUser;
    TextView nomUser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inscri);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String jsonProf = this.getIntent().getStringExtra("prof1");
        Users prof1 = gson.fromJson(jsonProf, Users.class);
        nomUser = (TextView) findViewById(R.id.nomUser);
        dataUser = (TextView) findViewById(R.id.dataUser);
        dataUser.setText(prof1.afficherUser());


        buttonAccueil = (Button) findViewById(R.id.buttonAccueil);
        buttonAccueil.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                openActivityAccueil();
            }
        });

        retour = (Button) findViewById(R.id.buttonRetour);
        retour.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                openActivityRetour();
            }
        }); deconnexion = (Button) findViewById(R.id.buttonDeco);
        deconnexion.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                openActivityDeco();
            }
        });


    }
        public void openActivityDeco(){
            Intent deco = new Intent(this, MainActivity.class);
            startActivity(deco);
        }
    public void openActivityAccueil(){
        Intent accueil = new Intent(this, AccueilActivity.class);
        startActivity(accueil);
    }
    public void openActivityRetour(){
        Intent inscription = new Intent(this, Inscription.class);
        startActivity(inscription);
    }

        Bundle paquet = this.getIntent().getExtras();
        String nom = paquet.getString("nom");

       Users prof1 = this.getIntent().getParcelableExtra("Users");

      //nomUser.setText(prof1.getNom());
     // prenomUser.setText(prof1.getPrenom());
     // villeUser.setText(prof1.getVille());


    }


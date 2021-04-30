package fr.sio.covoiturage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ListProfActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    Button buttonAccueil;
    Button retour;
    Button deconnexion;
    ListView lvProf;
    TextView tvSelection;
    TextView ville;
    TextView nom;
    TextView prenom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_prof);
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


        tvSelection = (TextView) findViewById(R.id.idTvSelection);
        lvProf = (ListView) findViewById(R.id.idLvisite);
        nom = (TextView) findViewById(R.id.nom);
        prenom = (TextView)findViewById(R.id.prenom);
        ville = (TextView)findViewById(R.id.ville);

       /* ArrayAdapter<String> adaptateur = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                visite
        );*/

        ItemProfesseurAdapter adaptateur = new ItemProfesseurAdapter (this, ModeleProf.getModele().getLesProfesseurs());
        lvProf.setAdapter(adaptateur);
        lvProf.setOnItemClickListener(this);


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
        Intent inscription = new Intent(this, AccueilActivity.class);
        startActivity(inscription);
    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Professeur ProfSelectionee = ModeleProf.getModele().getLesProfesseurs().get(position);
        tvSelection.setText("Professeur sélectioné : " + ProfSelectionee + " id : " + id);

    }
}



package fr.sio.covoiturage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Inscription extends AppCompatActivity {
    Button validerInsc;
    EditText pville;
    EditText pnom;
    EditText pprenom;
    Button buttonAccueil;
    Button buttonDeco;


   /* public void passe(View vue) {
     Users prof1 = new Users(nom.getText().toString(), prenom.getText().toString(), ville.getText().toString());

    Gson gson = new GsonBuilder().create();
   String jsonProf = gson.toJson(prof1);
       Intent intentEnvoyer = new Intent(this, InscriActivity.class);
       intentEnvoyer.putExtra("Users", prof1);
      startActivity(intentEnvoyer);
       Intent intent = new Intent(this, InscriActivity.class);
       intent.putExtra("prof", jsonProf);
       startActivity(intent);

    }*/
  /* public void passe(View vue){
       String nom = pnom.getText().toString();
       String prenom = pprenom.getText().toString();
       String ville = pville.getText().toString();

       Users prof1 = new Users(nom,prenom,ville);


       Intent inte = new Intent(this,InscriActivity.class);
       Toast.makeText(this, passGson(prof1), Toast.LENGTH_SHORT).show();

      inte.putExtra("prof1",passGson(prof1));
      startActivity(inte);}*/


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inscription);
        validerInsc = (Button) findViewById(R.id.validerInsc);
        pnom = (EditText) findViewById(R.id.edtNom);
        pprenom = (EditText)findViewById(R.id.editTextPrenomEns) ;
        pville = (EditText)findViewById(R.id.editTextVilleEns);

        buttonDeco = (Button) findViewById(R.id.buttonDeco);
        buttonAccueil = (Button) findViewById(R.id.buttonAccueil);
        buttonAccueil.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                openActivityAccueil();
            }
        });
        buttonDeco.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                openActivityDeco();
            }
        });

    }
    public void openActivityAccueil(){
        Intent accueil = new Intent(this, AccueilActivity.class);
        startActivity(accueil);
    }

    public void openActivityDeco(){
        Intent deco = new Intent(this, MainActivity.class);
        startActivity(deco);
    }




/*   public String passGson(Users unUser){
 Gson gson = new GsonBuilder().create();
       String jsonProf = gson.toJson(unUser);
        return jsonProf;
    }
*/



    public void passe(View vue) {
        String nomSaisie = pnom.getText().toString();
        Bundle paquet = new Bundle();
        paquet.putString("nom",nomSaisie);
        Intent IntentInscrie = new Intent(this, InscriActivity.class);
        IntentInscrie.putExtras(paquet);
        startActivity(IntentInscrie);

    }


}
package fr.sio.covoiturage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    Button inscription,connexion,propos;
    EditText login;
    EditText psw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inscription = (Button) findViewById(R.id.inscription);
        connexion = (Button) findViewById(R.id.binscriptions);
        propos= (Button) findViewById(R.id.bpropos);
        login = (EditText) findViewById(R.id.login);
        psw = (EditText) findViewById(R.id.psw);

        inscription.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valider(login.getText().toString(),psw.getText().toString());
            }
        });
        connexion.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                openActivityConnect();
            }

        });
        propos.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                openActivitypropos();
            }

        });

    }
    private void valider(String userLogin, String userPsw){
        if((userLogin.equals("Directeur"))&&(userPsw.equals("azerty"))){
    Intent valid = new Intent(this, AccueilActivity.class);
    startActivity(valid);}
        else{
            String message = new String ("Mot de passe ou Nom d'utilisateur incorrect");
            Toast.makeText(this, message, Toast.LENGTH_LONG).show();
        }
    }
    public void openActivitypropos(){
        Intent listProf = new Intent(this, Propos.class);
        startActivity(listProf);
    }
    public void openActivityConnect(){
        Intent listProf = new Intent(this, Inscription.class);
        startActivity(listProf);
    }




    @Override
    public void onClick(View v) {

    }
}
package fr.sio.covoiturage;

import java.util.ArrayList;
import java.util.List;

public class ModeleProf {
    private List<Professeur> lesProfesseurs = new ArrayList<Professeur>();
    private static ModeleProf modele = null;

    public ModeleProf(){
        super();
        this.peupler();
    }
    public static ModeleProf getModele() {
        if (modele == null) {
            modele = new ModeleProf();
        }
        return modele;
    }
    public List<Professeur> getLesProfesseurs(){
        return this.lesProfesseurs;
    }

    public void peupler(){
        this.lesProfesseurs.add(new Professeur (1, "Ara","valentin", "Stark", "Aria"));
        this.lesProfesseurs.add(new Professeur(1,"uber", "eat", "Jean", "Castex"));
        this.lesProfesseurs.add(new Professeur(2,"Mac", "Do", "Catherine", "Souspont"));
        this.lesProfesseurs.add(new Professeur(3,"Deli", "veroo", "Marc", "Gon"));
        this.lesProfesseurs.add(new Professeur(2, "herbulot","vhgf", "Saefi", "Aaefa"));
    }
    public Professeur connexion(String login, String mdp){
        for(Professeur unProfesseur : lesProfesseurs){
            if(login.equals(unProfesseur.getLogin())){
                if(mdp.equals(unProfesseur.getMdp())){
                    return unProfesseur;
                }
            }
        }
        return null;
    }
}

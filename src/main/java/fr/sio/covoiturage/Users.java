package fr.sio.covoiturage;

import android.os.Parcel;
import android.os.Parcelable;

public class Users implements Parcelable {
    String nom;
    String prenom;
    String ville;

    public Users(String nom, String prenom, String ville) {
        this.nom = nom;
        this.prenom = prenom;
        this.ville = ville;
    }

    public String afficherUser() {
        return "nom :" + nom + ",prenom :" + prenom + ",ville :" + ville + ".";
    }

    @Override
    public int describeContents(){
            return 0;
        }
        @Override
        public void writeToParcel(Parcel dest, int flags){
            dest.writeString(nom);
            dest.writeString(prenom);
            dest.writeString(ville);
        }

        public static final Parcelable.Creator<Users>
        CREATOR = new Parcelable.Creator<Users>(){
            public Users createFromParcel(Parcel in){
                return new Users(in);
            }
            public Users[] newArray(int size){
                return new Users[size];
            }

    };
        protected Users(Parcel in){
            this.nom = in.readString();
            this.prenom = in.readString();
            this.ville = in.readString();
        }

    public String getNom(){
            return nom;
        }
        public String getPrenom(){
            return prenom;
        }
        public String getVille(){
            return ville;
        }
        public void setNom(String nom){
            this.nom = nom;
        }
        public void setPrenom(String prenom){
            this.prenom = prenom;
        }
        public void setVille(String ville){
            this.ville = ville;
        }
}

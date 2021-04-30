package fr.sio.covoiturage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class ItemProfesseurAdapter extends ArrayAdapter<Professeur> {
        public ItemProfesseurAdapter (Context context, List<Professeur> lesProfesseurs) {
            super(context, -1, lesProfesseurs );
        }
        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater) getContext().
                    getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View vItem = null;

            // Si la vue est recyclée, elle contient déjà le bon layout
            if (convertView != null) {
                vItem = convertView ;
            } else { // il faut utiliser le LayoutInflater
                vItem = layoutInflater.inflate(R.layout.item_, parent, false);
            }


            TextView nom= (TextView) vItem.findViewById(R.id.nom);
            nom.setText(ModeleProf.getModele().getLesProfesseurs().
                    get(position).getNom());
            TextView tvQuantite = (TextView) vItem.findViewById(R.id.prenom);
            tvQuantite.setText(""+ ModeleProf.getModele().getLesProfesseurs().
                    get(position).getPrenom();
            return vItem;
        }
    }

}

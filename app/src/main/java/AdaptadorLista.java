import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.loginsabado.R;

import java.util.ArrayList;

public class AdaptadorLista extends RecyclerView.Adapter<AdaptadorLista.viewHolder> {

    ArrayList<String> listaDeDatos;

    public AdaptadorLista(ArrayList<String> listaDeDatos) {
        this.listaDeDatos = listaDeDatos;
    }

    @NonNull
    @Override
    public AdaptadorLista.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View vistaListado= LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_de_lista,null,false);
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull AdaptadorLista.viewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return listaDeDatos.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        public viewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}

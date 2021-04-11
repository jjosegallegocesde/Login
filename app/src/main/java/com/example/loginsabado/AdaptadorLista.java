package com.example.loginsabado;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdaptadorLista extends RecyclerView.Adapter<AdaptadorLista.viewHolder> {

    ArrayList<Trabajador> listaDeDatos;

    public AdaptadorLista(ArrayList<Trabajador> listaDeDatos) {
        this.listaDeDatos = listaDeDatos;

    }

    @NonNull
    @Override
    public AdaptadorLista.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vistaItemLista= LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_de_lista,parent,false);
        return new viewHolder(vistaItemLista);
    }

    @Override
    public void onBindViewHolder(@NonNull AdaptadorLista.viewHolder holder, int position) {
        holder.actualizarDatosDeItem(listaDeDatos.get(position));
    }

    @Override
    public int getItemCount() {
        return listaDeDatos.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {

        TextView nombreTrabajador,cedulaTrabajador,ocupacionTrabajador;
        ImageView fotoTrabajador;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
            nombreTrabajador=itemView.findViewById(R.id.nombreEmpleado);
            fotoTrabajador=itemView.findViewById(R.id.fotoEmpleado);
            cedulaTrabajador=itemView.findViewById(R.id.cedulaEmpleado);
            ocupacionTrabajador=itemView.findViewById(R.id.ocupacionEmpleado);



        }

        public void actualizarDatosDeItem(Trabajador datos) {
            nombreTrabajador.setText(datos.getNombreEmpleado());
            fotoTrabajador.setImageResource(datos.getFotoEmpelado());
            cedulaTrabajador.setText(datos.getCedulaEmpleado());
            ocupacionTrabajador.setText(datos.getOcupacionEmpleado());

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent intent=new Intent(itemView.getContext(),MainActivity.class);
                    intent.putExtra("trabajador",datos);
                    itemView.getContext().startActivity(intent);

                }
            });

        }
    }
}

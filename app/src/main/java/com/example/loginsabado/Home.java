package com.example.loginsabado;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;


public class Home extends AppCompatActivity {

    ArrayList<Trabajador> listaDeDatos=new ArrayList<>();
    RecyclerView listado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        listado=findViewById(R.id.listado);
        listado.setHasFixedSize(true);
        listado.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));


        crearListado();

        AdaptadorLista adaptador= new AdaptadorLista(listaDeDatos);
        listado.setAdapter(adaptador);

    }



    private void crearListado() {

        listaDeDatos.add(new Trabajador(
                "Sandra Perez",
                "43568747",
                "Profesional 1",
                getString(R.string.descripcion1),
                R.drawable.avatar1
        ));

        listaDeDatos.add(new Trabajador(
                "Raúl Rodriguez",
                "1028546258",
                "Operario",
                getString(R.string.descripcion2),
                R.drawable.avatar2
        ));

        listaDeDatos.add(new Trabajador(
                "Martha Nielsen",
                "1017164898",
                "Operario",
                getString(R.string.descripcion3),
                R.drawable.avatar3
        ));

        listaDeDatos.add(new Trabajador(
                "Bayron Perea",
                "1017458457",
                "Profesional 2",
                getString(R.string.descripcion4),
                R.drawable.avatar4
        ));



    }


}
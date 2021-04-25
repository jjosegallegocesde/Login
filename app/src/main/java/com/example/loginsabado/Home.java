package com.example.loginsabado;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.Locale;


public class Home extends AppCompatActivity {

    //ATRIBUTOS

    ArrayList<Trabajador> listaDeDatos=new ArrayList<>();
    RecyclerView listado;

    //METODOS

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


    //Metodo para configurar el idioma de mi telefono
    public void cambiarIdioma(String lenguaje){

        Locale idioma=new Locale(lenguaje); //tipo de dato local que recibe el idioma deseado
        Locale.setDefault(idioma); //se establece el idioma deseado

        Configuration configuracionTelefono=getResources().getConfiguration();
        configuracionTelefono.locale=idioma;
        getBaseContext().getResources().updateConfiguration(configuracionTelefono,getBaseContext().getResources().getDisplayMetrics());
    }


    //Metodo que pinta el Menu en ESTA actividad
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    //Metodo que controla la acción de cada opción del menu
    public boolean onOptionsItemSelected(MenuItem opcion){
        int id=opcion.getItemId();

        switch(id){

            case (R.id.opcion1):

                Intent intent=new Intent(Home.this,Perfil.class);
                startActivity(intent);

                break;

            case (R.id.opcion2):
                this.cambiarIdioma("en");
                Intent intent2=new Intent(Home.this,Home.class);
                startActivity(intent2);


                break;

            case (R.id.opcion3):
                this.cambiarIdioma("es");
                Intent intent3=new Intent(Home.this,Home.class);
                startActivity(intent3);

                break;

        }

        return super.onOptionsItemSelected(opcion);
    }




}
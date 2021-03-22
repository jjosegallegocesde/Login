package com.example.loginsabado;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //ATRIBUTOS
    EditText cajaHorasTrabajadas;
    Button botonCalcularSalario;
    TextView cajaResultado;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cajaHorasTrabajadas=findViewById(R.id.horas);//edittext
        botonCalcularSalario=findViewById(R.id.botonCalcular);//boton
        cajaResultado=findViewById(R.id.resultado);//textview

        botonCalcularSalario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int horasTrabajadas= Integer.parseInt(cajaHorasTrabajadas.getText().toString());

                if(horasTrabajadas<=40){

                    int salario=horasTrabajadas*20000;
                    cajaResultado.setText("Su salario es de: $"+salario);

                }else{

                    final int SALARIOBASE=40*20000;
                    int salarioExtra=(horasTrabajadas-40)*25000;
                    int salario=SALARIOBASE+salarioExtra;
                    cajaResultado.setText("Su salario es de: $"+salario);


                }


            }
        });


    }








}






package com.example.loginsabado;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //ATRIBUTOS
    EditText cajaHorasTrabajadas;
    Button botonCalcularSalario;
    TextView cajaResultado,nombreEmpleado,cedulaEmpleado,descripcionEmpleado,ocupacionEmpelado;
    ImageView fotoEmpleado;

    Trabajador empleado;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cajaHorasTrabajadas=findViewById(R.id.horas);//edittext
        botonCalcularSalario=findViewById(R.id.botonCalcular);//boton
        cajaResultado=findViewById(R.id.resultado);//textview

        nombreEmpleado=findViewById(R.id.nombreEmpleadoMain);
        cedulaEmpleado=findViewById(R.id.cedulaEmpleadoMain);
        descripcionEmpleado=findViewById(R.id.descripcionEmpeladoMain);
        ocupacionEmpelado=findViewById(R.id.ocupacionEmpleadoMain);
        fotoEmpleado=findViewById(R.id.fotoEmpleadoMain);

        empleado=(Trabajador) getIntent().getSerializableExtra("trabajador");

        nombreEmpleado.setText(empleado.getNombreEmpleado());
        cedulaEmpleado.setText(empleado.getCedulaEmpleado());
        descripcionEmpleado.setText(empleado.getDescripcionEmpleado());
        ocupacionEmpelado.setText(empleado.getOcupacionEmpleado());
        fotoEmpleado.setImageResource(empleado.getFotoEmpelado());


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






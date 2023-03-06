package com.example.lab3frasescelebres;

import androidx.appcompat.app.AppCompatActivity;
import java.lang.Math;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    //Creamos la varible para el número aleatorio
    private static int aleatorio;
    //Creamos la variable para el TextView que mostrará el número
    private TextView generado;

    //Creamos un objeto de tipo boton
    private Button botonGenerar;

    //Se declara la variable Log
    private static final String LOG_TAG = MainActivity.class.getSimpleName();

    /**
     * Metodo  onCrate de la clase
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Se le asigna el objeto TextView que tenemos en el diseño
        generado = (TextView) findViewById(R.id.txtNumero);

        //asignamos valor a la variable para generar el número aleatorio
        aleatorio = 1;

        //Se asigna al boton creado el boton mostrar frase que se encuentra en el activity main
        botonGenerar= (Button) findViewById(R.id.btnGenerar);

        /**
         * Al pulsar el boton mostrar frase se genera el numero aleatorio para poder seleccionar la frase correspondiente
         */
        botonGenerar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //La variable declarada sirve para capturar el numero aleatorio
                String numero;

                //Se genera el numero aleatorio
                aleatorio = (int) (Math.random()*3+1);

                //Se cambia el valor de entero a string
                numero = String.valueOf(aleatorio);

                //Se cambia el valor de texto que tenia el TextView
                generado.setText(numero);
            }
        });

    }


    /**
     * Metodo de llamada al segundo activity
     * @param view
     */
    public void launchSecondActivity(View view) {
        //Con esto se activa el segundo activity
        Intent intent = new Intent(this, SecondActivity.class);

        //permite mostrar el segundo activity
        startActivity(intent);
    }

    /**
     * Regresa el numero obtenido aleatoriamente
     * @return
     */
    public static int getNumAleatorio(){
        return aleatorio;
    }
}
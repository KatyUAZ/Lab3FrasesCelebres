package com.example.lab3frasescelebres;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    //se declara la variable que almacena el numero aleatorio
    int aleatorio = MainActivity.getNumAleatorio();

    /**
     * Metodo onCreate del segundo activity
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        //Primero se hace la declaracion e inicializacion de los View
        ImageView imagenAutor =(ImageView) findViewById(R.id.imagenAutor);
        TextView autor = (TextView) findViewById(R.id.autor);
        TextView frase = (TextView) findViewById(R.id.fraseCelebre);

        //Con el swicth dependiendo del numero se determina cual es la frase que corresponde
        switch (aleatorio){
            //si el numero aleatorio es 2...
            case 2:
                imagenAutor.setImageResource(R.drawable.bob_marley);
                autor.setText(R.string.autorFrase2);
                frase.setText(R.string.frase2);

                break;
                //si es el numero 3..
            case 3:
                imagenAutor.setImageResource(R.drawable.albert_einstein);
                autor.setText(R.string.autorFrase3);
                frase.setText(R.string.frase3);
            break;

            //si es el numero 1 u otro...
            case 1:
                imagenAutor.setImageResource(R.drawable.john_lennon);
                autor.setText(R.string.autorFrase1);
                frase.setText(R.string.frase1);
                break;

        }
    }
}
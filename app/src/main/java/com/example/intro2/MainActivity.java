package com.example.intro2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Colocamos los objetos necesarios
    EditText num1, num2;
    // Button btSuma, btResta, btProd, btDiv, btClear; // con el onClick ya no se necesita
    TextView tvResp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // R -> recursos
        num1 = findViewById(R.id.etNumero1);
        num2 = findViewById(R.id.etNumero2);
        tvResp = findViewById(R.id.tvRespuesta);
    }

    // vamos a generar un mensaje no intrusivo, temporal que va a desaparecer
    public void ocSuma(View view){
        // .trim() -> elimina los espacios de los costados de la cadena
        String n1 = num1.getText().toString().trim();
        String n2 = num2.getText().toString().trim();
        if(n1.isEmpty() || n2.isEmpty()){
            // Toast: objeto que da un mensaje no intrusivo.
            // .makeText(donde se mostrara, que mostrara, cuanto va a durar)
            Toast.makeText(getApplicationContext(), "No deben existir campos vacios", Toast.LENGTH_SHORT).show();
        }
        else{
            int res = Integer.parseInt(n1) + Integer.parseInt(n2);
            tvResp.setText(String.valueOf(res));
        }
    }

    public void ocResta(View view){
        // .trim() -> elimina los espacios de los costados de la cadena
        String n1 = num1.getText().toString().trim();
        String n2 = num2.getText().toString().trim();
        if(n1.isEmpty() || n2.isEmpty()){
            // Toast: objeto que da un mensaje no intrusivo.
            // .makeText(donde se mostrara, que mostrara, cuanto va a durar)
            Toast.makeText(getApplicationContext(), "No deben existir campos vacios", Toast.LENGTH_SHORT).show();
        }
        else{
            int res = Integer.parseInt(n1) - Integer.parseInt(n2);
            tvResp.setText(String.valueOf(res));
        }
    }

    public void ocProd(View view){
        // .trim() -> elimina los espacios de los costados de la cadena
        String n1 = num1.getText().toString().trim();
        String n2 = num2.getText().toString().trim();
        if(n1.isEmpty() || n2.isEmpty()){
            // Toast: objeto que da un mensaje no intrusivo.
            // .makeText(donde se mostrara, que mostrara, cuanto va a durar)
            Toast.makeText(getApplicationContext(), "No deben existir campos vacios", Toast.LENGTH_SHORT).show();
        }
        else{
            int res = Integer.parseInt(n1) * Integer.parseInt(n2);
            tvResp.setText(String.valueOf(res));
        }
    }

    public void ocDiv(View view){
        // .trim() -> elimina los espacios de los costados de la cadena
        String n1 = num1.getText().toString().trim();
        String n2 = num2.getText().toString().trim();
        if(n1.isEmpty() || n2.isEmpty()){
            // Toast: objeto que da un mensaje no intrusivo.
            // .makeText(donde se mostrara, que mostrara, cuanto va a durar)
            Toast.makeText(getApplicationContext(), "No deben existir campos vacios", Toast.LENGTH_SHORT).show();
        }
        else{
            try {
                int res = Integer.parseInt(n1) / Integer.parseInt(n2);
                tvResp.setText(String.valueOf(res));
            }
            catch (Exception e){
                Toast.makeText(getApplicationContext(), e.getMessage()+"\nImposible dividir entre 0", Toast.LENGTH_SHORT).show();
            }
        }
    }

    public void ocClear(View view){
        num1.setText(null);
        num2.setText(null);
        tvResp.setText("Resultado");

        num1.requestFocus(); // este pa comodidad del usuario
    }
}
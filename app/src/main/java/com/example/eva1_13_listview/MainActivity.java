package com.example.eva1_13_listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //datos
    String[] datos = {
        "Avion",
        "Carro",
        "Moto",
        "Bicicleta",
        "Patín",
        "Patineta",
        "Yate",
        "Camion",
        "troiciclo",
        "Alas",
        "Magia",
        "Amarillo"
        ,"Rojo",
        "verde",
        "Azul",
        "Naranja",
        "Datos",
        "No se que mas",
        "Ayuda",
        "Tacos","Hambueguesa",
        "Chocorroles",
        "Tasos",
        "Maldad",
            "Monitor",
            "Felicidad",
            "Mucho trabajo",
            "wtf",
            "Saludos profe",
            "No me repruebe",
            "Le estoy echando ganas",
            "Echando va con H?"
};
    ListView lstVwDatos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lstVwDatos= findViewById(R.id.lstVwDatos);
        lstVwDatos.setAdapter(new ArrayAdapter<String>(
               this,
                android.R.layout.simple_list_item_1,
                datos
    ));
        lstVwDatos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                Toast.makeText(getApplicationContext(),datos[i],Toast.LENGTH_SHORT).show();
            }
        });
    }
}
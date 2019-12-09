package omtc.itics.tesoem.edu.p3grindviewbaseomtc;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    GridView gvDatos;
    contenido contenido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gvDatos = findViewById(R.id.gvcontenido);

        ArrayList<String> arreglo = new ArrayList<>();
        arreglo.add("Fernando");
        arreglo.add("Francisco");
        arreglo.add("Guadalupe");
        arreglo.add("Sabino");
        arreglo.add("Angel");
        arreglo.add("Gersain");
        arreglo.add("Ulises");
        arreglo.add("Juan");
        contenido = new contenido(this, arreglo);
        gvDatos.setAdapter(contenido);
    }
}

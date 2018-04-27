package luis.munayco.com.inventario;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import luis.munayco.com.inventario.Objetos.FirebaseRerences;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // LLamada a la Base de Datos Firebase
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference(FirebaseRerences.PRODUCTOS_REFERENCE);
        Log.i("KEY",myRef.getKey());
    }
}

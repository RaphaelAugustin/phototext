package fr.supinternet.phototext;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.util.Log;


public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // Récupération du pseudo passé dans l'intent via putExtras
        Intent intent = getIntent();
        String pseudoText = intent.getExtras().getString("pseudo");
    }
}

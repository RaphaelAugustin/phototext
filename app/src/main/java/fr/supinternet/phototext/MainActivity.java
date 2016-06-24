package fr.supinternet.phototext;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
          super.onCreate(savedInstanceState);

           setContentView(R.layout.activity_main);
    }
    
    public void pushPseudo(View view) {
        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
        startActivity(intent);
    }
}

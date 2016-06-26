package fr.supinternet.phototext;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
          super.onCreate(savedInstanceState);

           setContentView(R.layout.activity_main);
    }

    public void pushPseudo(View view)
    {

        EditText pseudoText = (EditText) findViewById(R.id.pseudoText);

        Intent intent = new Intent(MainActivity.this, ChatActivity.class);
        intent.putExtra("pseudo", pseudoText.getText().toString());
        startActivity(intent);
    }
}

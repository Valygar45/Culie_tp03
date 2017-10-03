package fr.utt.if26.culie_tp03;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView tx = (TextView) findViewById(R.id.message);
        tx.setText("Message modifié dans le code Java");

        String message = "Bonjour IF26!";
        tx.setText(message);

        setContentView(R.layout.activity_main);
    }
}

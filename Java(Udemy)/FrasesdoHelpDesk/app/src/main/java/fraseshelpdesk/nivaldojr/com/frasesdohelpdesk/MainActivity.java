package fraseshelpdesk.nivaldojr.com.frasesdohelpdesk;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView textoNovaFrase;
    private Button botaoNovaFrase;

    private String[] frases = {"Realmente", "É uma questão de compreensão senhor.",
            "JUB up", "Genial", "200%"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textoNovaFrase = findViewById(R.id.textoNovaFraseId);
        botaoNovaFrase = findViewById(R.id.botaoNovaFraseId);


        botaoNovaFrase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random randomico = new Random();
                int num = randomico.nextInt(frases.length);
                textoNovaFrase.setText(frases[num]);
            }
        });
    }
}

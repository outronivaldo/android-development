package idadedecachorro.nivaldojr.com.idadedecachorro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button botaoCalcular;
    private TextView textoResultado;
    private EditText caixaTexto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botaoCalcular = findViewById(R.id.botaoCalcularId);
        textoResultado = findViewById(R.id.textoResultadoId);
        caixaTexto = findViewById(R.id.caixaTextoId);

        botaoCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textoDigitado = caixaTexto.getText().toString();

                if(textoDigitado.isEmpty()){
                    textoResultado.setText("Valor inválido!");
                }else{
                    int valorDigitado = Integer.parseInt(textoDigitado);
                    if(valorDigitado<1){
                        textoResultado.setText("Por favor, insira um valor maior que 0.");
                    }else {
                        int resultadoFinal = valorDigitado * 7;
                        textoResultado.setText("A idade do seu cachorro em anos humanos é: "
                                + resultadoFinal);
                    }
                }
            }
        });
    }
}

package aula3.nivaldojr.com.calculadorademultiplicar

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botao = findViewById<Button>(R.id.botao_calcular)

        botao.setOnClickListener {
            val editTextNumero1 = findViewById<EditText>(R.id.entrada_num1)
            val editTextNumero2 = findViewById<EditText>(R.id.entrada_num2)

            var num1 = 0.0
            if(editTextNumero1.text.toString() != ""){
                num1 = editTextNumero1.text.toString().toDouble()
            }

            var num2 = 0.0
            if(editTextNumero2.text.toString() != ""){
                num2 = editTextNumero1.text.toString().toDouble()
            }

            var resultado = num1 * num2
            Toast.makeText(this,  "Resultado: $resultado", Toast.LENGTH_SHORT).show()
        }
    }
}

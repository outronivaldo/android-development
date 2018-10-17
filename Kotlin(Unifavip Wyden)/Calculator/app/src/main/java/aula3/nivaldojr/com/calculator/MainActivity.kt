package aula3.nivaldojr.com.calculator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.calculate_button)

        button.setOnClickListener(){
            val editTextNumber1 = findViewById<EditText>(R.id.input_num1)
            val editTextNumber2 = findViewById<EditText>(R.id.input_num2)

            var num1 = 0.0
            if(editTextNumber1.text.toString() != ""){
                num1 = editTextNumber1.text.toString().toDouble()
            }

            var num2 = 0.0
            if(editTextNumber2.text.toString() != ""){
                num2 = editTextNumber2.text.toString().toDouble()
            }

            var result = num1 * num2
            Toast.makeText(this, "Result: $result", Toast.LENGTH_SHORT).show()

        }
    }
}

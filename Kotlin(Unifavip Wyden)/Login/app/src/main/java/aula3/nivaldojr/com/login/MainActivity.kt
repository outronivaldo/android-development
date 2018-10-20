package aula3.nivaldojr.com.login

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editTextName = findViewById<EditText>(R.id.name)
        val editTextUsername = findViewById<EditText>(R.id.username)
        val editTextPassword = findViewById<EditText>(R.id.password)

        val buttonCancel = findViewById<Button>(R.id.buttonCancel)
        val buttonLogin = findViewById<Button>( R.id.buttonLogin)

        buttonLogin.setOnClickListener(){
            if(editTextUsername.text.toString()=="user123"
                    && editTextPassword.text.toString() == "abc123") {
                var name = editTextName.text.toString()

                val intent = Intent(this, WelcomeActivity::class.java)

                intent.putExtra("name_welcome", name)

                startActivity(intent)

            }else if(editTextUsername.text.toString()!="user123"){
                Toast.makeText(this, "Invalid user!", Toast.LENGTH_SHORT).show()
            }else if(editTextPassword.text.toString() != "abc123"){
                Toast.makeText(this, "Invalid password!", Toast.LENGTH_SHORT).show()
            }
        }

        buttonCancel.setOnClickListener(){
            Toast.makeText(this, "Bye :)", Toast.LENGTH_SHORT).show()
            finish()
        }
    }
}

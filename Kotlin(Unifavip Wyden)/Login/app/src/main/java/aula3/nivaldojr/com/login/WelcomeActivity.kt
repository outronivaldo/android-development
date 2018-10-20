package aula3.nivaldojr.com.login

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class WelcomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        var params = intent.extras

        var name = params["name_welcome"]

        var nameWelcomeView = findViewById<TextView>(R.id.nameWelcome)

        nameWelcomeView.setText("Hi $name. Welcome!" )

    }
}

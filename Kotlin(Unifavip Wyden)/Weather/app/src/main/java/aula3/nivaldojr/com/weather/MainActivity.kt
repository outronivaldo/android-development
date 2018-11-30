package aula3.nivaldojr.com.weather

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private var textViewCity: TextView? = null
    private var textViewTemperature: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textViewCity = findViewById<TextView>(R.id.textViewCity)
        textViewTemperature = findViewById<TextView>(R.id.textViewTemperature)

        Thread{
            var city = CityWeatherService.getClimaCidade("3398688")
            runOnUiThread {
                textViewCity?.text = city?.name.toString()
                textViewTemperature?.text = city?.main?.temp.toString()
            }
        }.start()
    }
}

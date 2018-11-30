package aula3.nivaldojr.com.weather


import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object CityWeatherService {

    val BASE_URL = "http://api.openweathermap.org/data/2.5/"
    val service: CityWeatherREST

    init{
        val retrofit = Retrofit
            .Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        service = retrofit.create(CityWeatherREST::class.java)
    }

    fun getClimaCidade(cityId: String): City?{
        var call = service.getWeatherCity(cityId,
            "2ffec0179ea5097fc05f62abd147ceea",
            "metric")
        var city = call.execute().body()
        return city
    }

}
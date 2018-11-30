package aula3.nivaldojr.com.weather

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface CityWeatherREST {


    @GET("weather")
    fun getWeatherCity(@Query("id") id: String,
                       @Query("APPID") appid:String,
                       @Query("units") units: String): Call<City>

}
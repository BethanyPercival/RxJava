package uk.co.onthebeach.rxjava

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path


interface IService {
    @GET("films")
    fun listFilms(@Path("user") user: String): Call<List<Film>>
}

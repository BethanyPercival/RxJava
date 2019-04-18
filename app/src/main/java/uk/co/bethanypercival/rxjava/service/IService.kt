package uk.co.onthebeach.rxjava.service

import io.reactivex.Observable
import retrofit2.http.GET
import uk.co.onthebeach.rxjava.model.Film


interface IService {
    @GET("films")
    fun listFilms(): Observable<List<Film>>
}

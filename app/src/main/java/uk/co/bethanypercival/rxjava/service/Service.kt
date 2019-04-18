package uk.co.onthebeach.rxjava.service

import retrofit2.Retrofit


class Service {
    fun getService(): IService {
        val retrofit = Retrofit.Builder()
                .baseUrl("https://swapi.co/api/")
                .build()

        return retrofit.create<IService>(IService::class.java)
    }
}

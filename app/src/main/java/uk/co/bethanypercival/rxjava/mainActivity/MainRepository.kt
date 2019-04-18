package uk.co.onthebeach.rxjava.mainActivity

import uk.co.onthebeach.rxjava.service.Service


class MainRepository {

    fun getFilmList() = Service().getService().listFilms()
}

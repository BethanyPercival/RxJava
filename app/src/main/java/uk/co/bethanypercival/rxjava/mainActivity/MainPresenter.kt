package uk.co.onthebeach.rxjava.mainActivity

import io.reactivex.Observable
import io.reactivex.disposables.CompositeDisposable
import uk.co.onthebeach.rxjava.model.Film

class MainPresenter {
    private val mainRepository = MainRepository()
    private var _filmList: List<Film> = emptyList()
    var filmList: Observable<List<Film>> = Observable.empty()
    val compositeDisposable = CompositeDisposable()

    fun getFilmList() {
        val disposable = mainRepository.getFilmList()
//                use flatmap here to get further data
                .subscribe { filmList ->
                    _filmList = filmList
                }
        compositeDisposable.add(disposable)
    }
}

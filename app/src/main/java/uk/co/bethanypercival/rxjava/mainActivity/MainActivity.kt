package uk.co.onthebeach.rxjava.mainActivity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity;

import kotlinx.android.synthetic.main.activity_main.*
import uk.co.onthebeach.rxjava.R

class MainActivity: AppCompatActivity() {
    private val presenter = MainPresenter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)
        subscribeToData()
        presenter.getFilmList()
    }

    override fun onDestroy() {
        super.onDestroy()
        presenter.compositeDisposable.dispose()
    }

    private fun subscribeToData() {
//        subscribe to presenter
    }
}

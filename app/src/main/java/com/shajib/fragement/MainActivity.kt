package com.shajib.fragement

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) myFragment()

    }

    private fun myFragment() {
        supportFragmentManager
            ?.beginTransaction()
            ?.add(R.id.main, MainFragment())
            ?.commit()
        //supportFragmentManager?.beginTransaction()?.replace(R.id.main, MainFragment())?.commit()
    }

    fun loadSecondFragment() {
        /*supportFragmentManager
            ?.beginTransaction()
            ?.replace(R.id.main, SecondFragment()) //if I use add() without replace() -> it will be show the fragment over the main fragment
            ?.commit()*/

        supportFragmentManager
            ?.beginTransaction()
            ?.replace(R.id.main, SecondFragment())
            ?.addToBackStack("") //if we click back button it will go to the main fragment (remember the transaction -> replace() the main fragment)
            ?.commit()
    }
}
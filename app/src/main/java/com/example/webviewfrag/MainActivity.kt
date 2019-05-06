package com.example.webviewfrag

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_frag_deportes.*
import kotlinx.android.synthetic.main.fragment_frag_joyeria.*
import kotlinx.android.synthetic.main.fragment_frag_uno.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        iniciarFragUno(FragUno())

        btn1.setOnClickListener {
            view -> iniciarDeportes(FragDeportes())
        }

        btn2.setOnClickListener {
            view  -> iniciarJoyeria(FragJoyeria())
        }
        btn3.setOnClickListener {
            view -> iniciarTecnologia(FragTecnologia())
        }

        btn4.setOnClickListener {
            view -> iniciarHogar(FragHogar())
        }

        btn5.setOnClickListener {
            view -> iniciarCalzado(FragCalzado())
        }


    }

    fun iniciarFragUno(fragUno: FragUno){
        val a = supportFragmentManager.beginTransaction()
        a.replace(R.id.lay1,fragUno)
        a.commit()
    }

    fun iniciarDeportes(fragDeportes: FragDeportes){
        val a = supportFragmentManager.beginTransaction()
        a.replace(R.id.lay2,fragDeportes)
        a.commit()
    }

    fun iniciarJoyeria(fragJoyeria: FragJoyeria){
        val a = supportFragmentManager.beginTransaction()
        a.replace(R.id.lay2,fragJoyeria)
        a.commit()
    }

    fun iniciarTecnologia(fragTecnologia: FragTecnologia){
        val a = supportFragmentManager.beginTransaction()
        a.replace(R.id.lay2,fragTecnologia)
        a.commit()
    }
    fun iniciarHogar(fragHogar: FragHogar){
        val a = supportFragmentManager.beginTransaction()
        a.replace(R.id.lay2,fragHogar)
        a.commit()
    }
    fun iniciarCalzado(fragCalzado: FragCalzado){
        val a = supportFragmentManager.beginTransaction()
        a.replace(R.id.lay2,fragCalzado)
        a.commit()
    }


}

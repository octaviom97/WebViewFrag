package com.example.webviewfrag

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_frag_deportes.*


class FragDeportes : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_frag_deportes, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//        RV1.apply {
//            layoutManager = LinearLayoutManager(activity)
//            adapter = MiAdaptador()
//        }
        btnNike.setOnClickListener {
            view -> webNike()
        }
        btnAdidas.setOnClickListener {
            view -> webAdidas()
        }
        btnPuma.setOnClickListener {
            view -> webPuma()
        }
    }

    fun webNike(){
        val i = Intent(activity,WebView::class.java)
        val url = "https://www.nike.com/mx/"
        i.putExtra("url",url)
        startActivity(i)
    }
    fun webAdidas(){
        val i = Intent(activity,WebView::class.java)
        val url = "https://www.adidas.mx/"
        i.putExtra("url",url)
        startActivity(i)
    }
    fun webPuma(){
        val i = Intent(activity,WebView::class.java)
        val url = "https://es-us.puma.com/"
        i.putExtra("url",url)
        startActivity(i)
    }

}

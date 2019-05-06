package com.example.webviewfrag

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_frag_hogar.*


class FragHogar : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_frag_hogar, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btnHS.setOnClickListener {
            view -> webHomeStore()
        }

        btnLP.setOnClickListener {
                view -> webLverpool()
        }
        btnMS.setOnClickListener {
                view -> webMiniso()
        }
    }

    fun webHomeStore(){
        val i = Intent(activity,WebView::class.java)
        val url = "https://www.homedepot.com.mx/"
        i.putExtra("url",url)
        startActivity(i)
    }
    fun webLverpool(){
        val i = Intent(activity,WebView::class.java)
        val url = "https://www.liverpool.com.mx/"
        i.putExtra("url",url)
        startActivity(i)
    }
    fun webMiniso(){
        val i = Intent(activity,WebView::class.java)
        val url = "https://www.miniso.com.mx/"
        i.putExtra("url",url)
        startActivity(i)
    }

}

package com.example.webviewfrag

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_frag_joyeria.*


class FragJoyeria : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_frag_joyeria, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btnTanya.setOnClickListener {
                view -> webTanya()
        }
        btnCristal.setOnClickListener {
            view -> webCristal()
        }
        btnBizzarro.setOnClickListener {
            view -> webBizarro()
        }
    }

    fun webTanya(){
        val i = Intent(activity,WebView::class.java)
        val url = "https://www.tanyamoss.com/"
        i.putExtra("url",url)
        startActivity(i)
    }
    fun webCristal(){
        val i = Intent(activity,WebView::class.java)
        val url = "https://www.cristaljoyas.com/"
        i.putExtra("url",url)
        startActivity(i)
    }

    fun webBizarro(){
        val i = Intent(activity,WebView::class.java)
        val url = "https://www.joyeriasbizzarro.com/joyeria.html"
        i.putExtra("url",url)
        startActivity(i)
    }


}

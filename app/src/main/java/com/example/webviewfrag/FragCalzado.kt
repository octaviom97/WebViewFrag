package com.example.webviewfrag

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_frag_calzado.*


class FragCalzado : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_frag_calzado, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btnDG.setOnClickListener {
            view -> webDorothy()
        }
        btnCO.setOnClickListener {
                view -> webCapaOzono()
        }
        btnAndrea.setOnClickListener {
                view -> webAndrea()
        }
    }

    fun webDorothy(){
        val i = Intent(activity,WebView::class.java)
        val url = "https://www.dorothygaynor.com/"
        i.putExtra("url",url)
        startActivity(i)
    }
    fun webCapaOzono(){
        val i = Intent(activity,WebView::class.java)
        val url = "https://www.capadeozono.com.mx/"
        i.putExtra("url",url)
        startActivity(i)
    }
    fun webAndrea(){
        val i = Intent(activity,WebView::class.java)
        val url = "https://mx.andrea.com/"
        i.putExtra("url",url)
        startActivity(i)
    }



}

package com.example.webviewfrag

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_frag_tecnologia.*


class FragTecnologia : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_frag_tecnologia, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btnBB.setOnClickListener{
            view -> webBestBuy()
        }
        btnRS.setOnClickListener {
            view -> webRadioShack()
        }
        btnSteren.setOnClickListener {
            view -> webSteren()
        }
    }

    fun webBestBuy(){
        val i = Intent(activity,WebView::class.java)
        val url = "https://www.bestbuy.com.mx/"
        i.putExtra("url",url)
        startActivity(i)
    }

    fun webRadioShack(){
        val i = Intent(activity,WebView::class.java)
        val url = "https://www.radioshack.com.mx/"
        i.putExtra("url",url)
        startActivity(i)
    }

    fun webSteren(){
        val i = Intent(activity,WebView::class.java)
        val url = "https://www.steren.com.mx/"
        i.putExtra("url",url)
        startActivity(i)
    }


}

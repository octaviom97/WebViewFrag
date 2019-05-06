package com.example.webviewfrag

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import kotlinx.android.synthetic.main.recycler_row.view.*

class MiAdaptador:RecyclerView.Adapter<MiAdaptador.ViewHolder>() {
    val arr = listOf("Nike","Adidas","Puma")

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): MiAdaptador.ViewHolder {
        val li = LayoutInflater.from(p0.context)
        val fila = li.inflate(R.layout.recycler_row,p0,false)
        return ViewHolder(fila)
       

    }

    override fun getItemCount(): Int {
        return 3
    }

    override fun onBindViewHolder(p0: MiAdaptador.ViewHolder, p1: Int) {
        val txt = arr.get(p1)
        p0.v.btnRV.text = txt
    }

    class ViewHolder(val v: View):RecyclerView.ViewHolder(v){
    }

}
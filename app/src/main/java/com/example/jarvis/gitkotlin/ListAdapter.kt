package com.example.jarvis.gitkotlin

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.EditText
import android.widget.TextView

class ListAdapter(context: Context?, lista: ArrayList<ListItens>?) : ArrayAdapter<ListItens>(context, R.layout.list_itens, lista) {

    class ItensHolder{
        var titulo: TextView? = null
        var subtitulo: TextView? = null
        var id: TextView? = null
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View? {
        var itens: ListItens = getItem(position)
        var result: View? = null
        var holder: ItensHolder?

        if(convertView == null){
            holder = ItensHolder()
            val inflater: LayoutInflater = LayoutInflater.from(context)
            result = inflater.inflate(R.layout.list_itens, parent, false)
            holder.titulo = result.findViewById(R.id.txtTitulo_ListView)
            holder.subtitulo = result.findViewById(R.id.txtSubTitulo_ListView)
            holder.id = result.findViewById(R.id.txtID_ListView)

            result.tag = holder
        }else{
            holder = convertView.tag as ItensHolder?
        }

        holder!!.titulo!!.text = itens.titulo
        holder!!.subtitulo!!.text = itens.subtitulo
        holder!!.id!!.text = itens.id.toString()

        return result
    }
}
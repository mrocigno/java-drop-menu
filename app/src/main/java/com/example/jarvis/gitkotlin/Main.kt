package com.example.jarvis.gitkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
import android.widget.Toast

class Main : AppCompatActivity() {

    var edtText: EditText? = null
    var btnTest: Button? = null
    var litTest: ListView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initVars()
        initActions()
    }

    fun initVars(){
        edtText = findViewById(R.id.edtTeste)
        btnTest = findViewById(R.id.btnTeste)
        litTest = findViewById(R.id.litTeste)
    }

    fun initActions(){
        btnTest!!.setOnClickListener {
            val teste = ListItens("teste", "teste", 1)
            Toast.makeText(applicationContext, teste.id.toString(), Toast.LENGTH_SHORT).show()
        }
        var arrayTeste = ArrayList<ListItens>()
        arrayTeste.add(ListItens("Titulo1", "SubTitulo1", 1))
        arrayTeste.add(ListItens("Titulo2", "SubTitulo2", 2))
        arrayTeste.add(ListItens("Titulo3", "SubTitulo3", 3))
        litTest!!.adapter = ListAdapter(applicationContext, arrayTeste)

    }
}

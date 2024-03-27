package br.com.fiap.orgs

import android.annotation.SuppressLint
import android.app.Activity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.com.fiap.orgs.ui.recycleview.adapter.ListaProdutosAdapter


class MainActivity : Activity () {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Binding: processo e vinculação do
        //codigo fonte com o arquivo de layout.

//        val nome = findViewById<TextView>(R.id.nome)
//        //nome.setText("Cesta de frutas")
//        nome.text = "Cesta de frutas"
//
//        val descricao = findViewById<TextView>(R.id.descricao)
//        descricao.text = "Laranja, manga e uva"
//
//        val valor = findViewById<TextView>(R.id.valor)
//        valor.text = "19.99"

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.adapter = ListaProdutosAdapter();
    }
}

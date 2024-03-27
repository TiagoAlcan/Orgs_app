package br.com.fiap.orgs

import android.annotation.SuppressLint
import android.app.Activity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.com.fiap.orgs.model.Produto
import br.com.fiap.orgs.ui.recycleview.adapter.ListaProdutosAdapter
import java.math.BigDecimal


class MainActivity : Activity () {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Binding: processo de vinculação do código fonte com o arquivo de layout.
//        val nome = findViewById<TextView>(R.id.nome)
//        nome.setText("Cesta de frutas") ou
//        nome.text = "Cesta de frutas"
//        val descricao = findViewById<TextView>(R.id.descricao)
//        descricao.text = "Laranja, manga e uva"
//        val valor = findViewById<TextView>(R.id.valor)
//        valor.text = "19.99"

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.adapter = ListaProdutosAdapter(
            context = this,
            produtos = listOf(
                Produto("Teste 0", "Teste Descrição 0", BigDecimal("19.90")),
                //Produto produto1 = new Produto ("Teste 0", "Texte Descricao 0", 19.90) - equivalente em java
                Produto("Teste 1", "Teste Descrição 1", BigDecimal("29.90")),
                Produto("Teste 2", "Teste Descrição 2", BigDecimal("39.90")),
            )
        )
        // Pode ser configurado no layout
//        recyclerView.layoutManager = LinearLayoutManager(this)
    }
}

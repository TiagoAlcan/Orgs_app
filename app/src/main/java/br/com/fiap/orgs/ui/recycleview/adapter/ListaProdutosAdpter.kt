package br.com.fiap.orgs.ui.recycleview.adapter

import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.com.fiap.orgs.R
import br.com.fiap.orgs.model.Produto

class ListaProdutosAdapter(private val produtos: List<Produto>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

            fun vincula(produto: Produto) {
                val nome = itemView.findViewById<TextView>(R.id.nome)
                nome.text = produto.nome

                val descricao = itemView.findViewById<TextView>(R.id.descricao)
                descricao.text = produto.descricao

                val valor = itemView.findViewById<TextView>(R.id.valor)
                valor.text = produto.valor.toPlainString()
            }
        }
    }
// equivalente em java
//    @Override
//     public int getItemCount() {
//          return produtos.size
//     }

//    override fun getItemCount(): Int {
//        return produtos.size
//    }

    override fun getItemCount(): Int = produtos.size //mesma funcionalidade da de cima (quando temos apenas uma linha da para fazer desse jeito - quando a própria linha é o return da função)

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) { //mesma coisa que o void do java - não retorna nada
        TODO("Not yet implemented")
    }
}
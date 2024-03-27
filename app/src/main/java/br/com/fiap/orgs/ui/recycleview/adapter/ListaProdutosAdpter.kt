package br.com.fiap.orgs.ui.recycleview.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.com.fiap.orgs.model.Produto

class ListaProdutosAdapter(private val produtos: List<Produto>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        TODO("Not yet implemented")
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
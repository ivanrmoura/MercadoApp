package br.edu.ifpimercadoappaula.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.edu.ifpimercadoappaula.R
import br.edu.ifpimercadoappaula.model.Produto

class ProdutoAdapter(
    val listProdutos: List<Produto>,
    val context: Context
) : RecyclerView.Adapter<ProdutoAdapter.ProdutoViewHolder>() {


    class ProdutoViewHolder(view: View) : RecyclerView.ViewHolder(view){

        fun vincula(produto: Produto){
            val titulo = itemView.findViewById<TextView>(R.id.main_titulo)
            titulo.text = produto.titulo

            val descricao = itemView.findViewById<TextView>(R.id.main_descricao)
            descricao.text = produto.descricao

            val preco = itemView.findViewById<TextView>(R.id.main_preco)
            preco.text = produto.preco.toPlainString()
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProdutoViewHolder {
        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.produto_item, parent, false)

        return ProdutoViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listProdutos.size
    }

    override fun onBindViewHolder(holder: ProdutoViewHolder, position: Int) {

        val produto = listProdutos[position]

        holder.vincula(produto)

    }

}

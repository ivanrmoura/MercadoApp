package br.edu.ifpimercadoappaula

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.edu.ifpimercadoappaula.adapter.ProdutoAdapter
import br.edu.ifpimercadoappaula.model.Produto
import java.math.BigDecimal


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)


        val recyclerView = findViewById<RecyclerView>(R.id.main_recyclerview)

        val produtos = listOf(
            Produto("Camisa do Real Madrid 2023", "Camisa do Viny junior nike home", BigDecimal("350.50")),
            Produto("Chuteira Nikde Mercurial", "Chuteira do CR7", BigDecimal("860.40") )
        )

        recyclerView.adapter = ProdutoAdapter( produtos, this)

        recyclerView.layoutManager = LinearLayoutManager(this)


    }


}
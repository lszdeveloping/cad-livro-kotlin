package com.example.testeapi2

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.floatingactionbutton.FloatingActionButton

class SegundaActivity : AppCompatActivity(R.layout.activity_segunda) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val tvTitulo = findViewById<TextView>(R.id.tvTitulo)
        val tvAutor = findViewById<TextView>(R.id.tvAutor)
        val fabVolta = findViewById<FloatingActionButton>(R.id.fab_volta)

        val titulo = intent.getStringExtra("titulo")
        val autor = intent.getStringExtra("autor")

        tvTitulo.text = "Título: $titulo"
        tvAutor.text = "Autor: $autor"

        fabVolta.setOnClickListener {
            finish()
        }
    }
}
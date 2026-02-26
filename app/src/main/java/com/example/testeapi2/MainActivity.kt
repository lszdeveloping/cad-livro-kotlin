package com.example.testeapi2

import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val etTitulo = findViewById<EditText>(R.id.etTitulo)
        val etAutor = findViewById<EditText>(R.id.etAutor)
        val fabAvanca = findViewById<FloatingActionButton>(R.id.fab_avanca)

        fabAvanca.setOnClickListener {

            val titulo = etTitulo.text.toString()
            val autor = etAutor.text.toString()

            val intent = Intent(this, SegundaActivity::class.java)
            intent.putExtra("titulo", titulo)
            intent.putExtra("autor", autor)

            startActivity(intent)
        }
    }
}
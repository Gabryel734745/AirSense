package com.example.airsense

import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(  ) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Informa qual arquivo XML será usado como tela.
        setContentView(R.layout.activity_main)

        // Localiza no XML o TextView que possui o id tvMenu.
        val menu = findViewById<TextView>(R.id.tvMenu)

        // Executa este bloco quando o usuário toca no menu.
        menu.setOnClickListener {
            Toast.makeText(
                this,
                "Menu selecionado",
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}
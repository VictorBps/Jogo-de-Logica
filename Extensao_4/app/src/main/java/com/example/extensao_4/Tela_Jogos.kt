package com.example.extensao_4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Tela_Jogos : AppCompatActivity() {

    lateinit var basico1:Button
    lateinit var basico2:Button
    lateinit var bt_desconecte:Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_jogos)


        basico1=findViewById(R.id.bt_basico)
        basico2=findViewById(R.id.bt_basico1)
        bt_desconecte=findViewById(R.id.bt_desco)

        basico1.setOnClickListener {

            val chamaTelas : Intent
            chamaTelas = Intent(this,Teste_Facil::class.java)
            this.startActivity(chamaTelas)


        }

        basico2.setOnClickListener {

            val chamaTelas : Intent
            chamaTelas = Intent(this,Teste_Medio::class.java)
            this.startActivity(chamaTelas)


        }

        bt_desconecte.setOnClickListener {
            val chamaTelas : Intent
            chamaTelas = Intent(this,Logout::class.java)
            this.startActivity(chamaTelas)

        }

    }
}
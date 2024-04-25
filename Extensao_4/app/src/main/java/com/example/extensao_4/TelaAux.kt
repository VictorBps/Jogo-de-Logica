package com.example.extensao_4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class TelaAux : AppCompatActivity() {

    lateinit var bt_log:Button
    lateinit var bt_cadastro:Button
    lateinit var bt_voltar:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_aux)

        bt_log=findViewById(R.id.bt_login)
        bt_cadastro=findViewById(R.id.bt_cadastro)
        bt_voltar=findViewById(R.id.bt_back)


        bt_log.setOnClickListener {


            val chamaTelas : Intent
            chamaTelas = Intent(this,Login::class.java)
            this.startActivity(chamaTelas)
        }

        bt_cadastro.setOnClickListener {

            val chamaTelas : Intent
            chamaTelas = Intent(this,Cadastro::class.java)
            this.startActivity(chamaTelas)


        }


        bt_voltar.setOnClickListener {


            val chamaTelas : Intent
            chamaTelas = Intent(this,MainActivity::class.java)
            this.startActivity(chamaTelas)
        }




    }
}
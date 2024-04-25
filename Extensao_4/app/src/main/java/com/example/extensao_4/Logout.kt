package com.example.extensao_4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Logout : AppCompatActivity() {

    lateinit var bt_voltar:Button
    lateinit var bt_desconectar:Button
    lateinit var tv_nome:TextView
    lateinit var tv_login:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_logout)

        bt_voltar=findViewById(R.id.buton_voltar)
        bt_desconectar=findViewById(R.id.bt_logout)
        tv_nome=findViewById(R.id.tv_nome)
        tv_login=findViewById(R.id.tv_login1)


        tv_nome.text=Static.mostrarNome()
        tv_login.text=Static.mostrarLogin()


        bt_voltar.setOnClickListener {


            this.finish()
        }


        bt_desconectar.setOnClickListener {

            val chamaTelas : Intent
            chamaTelas = Intent(this,TelaAux::class.java)
            this.startActivity(chamaTelas)


        }

    }
}
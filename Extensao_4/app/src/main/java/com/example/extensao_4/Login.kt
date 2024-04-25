package com.example.extensao_4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class Login : AppCompatActivity() {

    lateinit var login:EditText
    lateinit var senha:EditText

    lateinit var logar:Button
    lateinit var sair:Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        login=findViewById(R.id.pt1_login)
        senha=findViewById(R.id.pt1_senha)
        logar=findViewById(R.id.bt1_logar)
        sair=findViewById(R.id.bt1_v1)

        val banco = Banco(applicationContext)
        val operacoesBanco = UsuarioDAO(banco)


        logar.setOnClickListener {


            if(operacoesBanco.autenticacao(login.text.toString(),senha.text.toString())){

                val chamaTelas : Intent
                chamaTelas = Intent(this,Tela_Jogos::class.java)
                this.startActivity(chamaTelas)

            }else {
                Toast.makeText(applicationContext,"Login errado !!!\n", Toast.LENGTH_SHORT).show()

            }

        }


        sair.setOnClickListener {

            val chamaTelas : Intent
            chamaTelas = Intent(this,TelaAux::class.java)
            this.startActivity(chamaTelas)


        }


    }




}
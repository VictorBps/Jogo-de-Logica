package com.example.extensao_4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText

class Cadastro : AppCompatActivity() {

    lateinit var nome:EditText
    lateinit var login: EditText
    lateinit var senha:EditText

    lateinit var voltar:Button
    lateinit var cadastrar:Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro)

        nome=findViewById(R.id.pt_nome)
        login=findViewById(R.id.pt_login)
        senha=findViewById(R.id.pt_senha)
        voltar=findViewById(R.id.bt1_v)
        cadastrar=findViewById(R.id.bt1_cadastrar)

        val banco = Banco(applicationContext)
        val operacoesBanco = UsuarioDAO(banco)
        cadastrar.setOnClickListener {

            var usuario:Usuario?=null

            usuario= Usuario(nome.text.toString(), login .text.toString(),senha.text.toString())
            nome.text.clear()
            login.text.clear()
            senha.text.clear()


            Log.i("Teste", "Usuário: ${usuario.nome}, ${usuario.login}, ${usuario.senha}")
            operacoesBanco.inserir(usuario)


        }

        voltar.setOnClickListener {

            val chamaTelas : Intent
            chamaTelas = Intent(this,TelaAux::class.java)
            this.startActivity(chamaTelas)


        }

    }
}
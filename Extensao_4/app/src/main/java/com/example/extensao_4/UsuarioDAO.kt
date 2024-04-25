package com.example.extensao_4

import android.content.ContentValues
import android.util.Log

class UsuarioDAO(banco : Banco) {

    var banco : Banco
    init {
        this.banco = banco
    }

    fun inserir(usuario: Usuario) {
        val db_insercao = this.banco.writableDatabase
        val valores = ContentValues().apply {
            put("nome", usuario.nome)
            put("login", usuario.login)
            put("senha", usuario.senha)
        }
        val confirmaInsercao = db_insercao?.insert("Usuario",  null, valores)
        Log.i("Teste","Inserção: "+confirmaInsercao)
    }


    fun autenticacao(login1:String,senha1:String): Boolean{

        val db_leitura = this.banco.readableDatabase
        var cursor = db_leitura.rawQuery("select * from Usuario",null)
        with(cursor) {
            while (moveToNext()) {

                val nome =  getString(getColumnIndexOrThrow("nome"))
                val login = getString(getColumnIndexOrThrow("login"))
                val senha = getString(getColumnIndexOrThrow("senha"))


                if(login1==login&&senha1==senha){

                    Static.Logar(nome,login)


                    return true
                }
            }
        }
        cursor.close()
        return false
    }

}
package com.example.extensao_4

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class Banco(context: Context) : SQLiteOpenHelper(context, "Banco", null, 1)
{
    override fun onCreate(db: SQLiteDatabase)
    {
        val nomeTabela = "Usuario"
        val id = "id"
        val nome = "nome"
        val login = "login"
        val senha = "senha"
        val SQL_criacao =
            "CREATE TABLE ${nomeTabela} (" +
                    "${id} INTEGER PRIMARY KEY AUTOINCREMENT," +
                    "${nome} TEXT,"+
                    "${login} TEXT,"+
                    "${senha} TEXT)"



        db.execSQL(SQL_criacao)
    }
    override fun onUpgrade(db: SQLiteDatabase, versaoAntiga: Int, novaVersao: Int) {
        val SQL_exclusao = "DROP TABLE IF EXISTS Usuario"
        db.execSQL(SQL_exclusao)
        onCreate(db)
    }
}
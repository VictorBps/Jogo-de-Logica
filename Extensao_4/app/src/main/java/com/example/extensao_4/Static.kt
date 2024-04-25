package com.example.extensao_4

import android.util.Log

class Static {
    companion object {

        var nome:String="null"
        var login:String="null"


        @JvmStatic fun Logar(Nome:String,Login:String){

           login=Login
           nome=Nome


        }

        @JvmStatic fun mostrarNome():String{
            return ""+nome
        }

        @JvmStatic fun mostrarLogin():String{
            return ""+login
        }


    }

}
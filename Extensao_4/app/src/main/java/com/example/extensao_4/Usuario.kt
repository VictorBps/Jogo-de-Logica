package com.example.extensao_4

class Usuario(var nome:String,var login:String,var senha:String) {


    override fun toString(): String {
        return "Nome :"+nome+", login :"+login+", senha :"+senha
    }

}
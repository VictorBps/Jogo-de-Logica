package com.example.extensao_4

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.Button
import android.widget.Spinner
import android.widget.TextView
import android.widget.Toast

class Teste_Medio : AppCompatActivity() {

    lateinit var spinner_cor: Spinner
    lateinit var spinner_cor1: Spinner
    lateinit var spinner_cor2: Spinner
    lateinit var spinner_n: Spinner
    lateinit var spinner_n1: Spinner
    lateinit var spinner_n2: Spinner
    lateinit var spinner_ani: Spinner
    lateinit var spinner_ani1: Spinner
    lateinit var spinner_ani2: Spinner
    lateinit var spinner_esp: Spinner
    lateinit var spinner_esp1: Spinner
    lateinit var spinner_esp2: Spinner

    lateinit var tv_1: TextView
    lateinit var tv_2: TextView
    lateinit var tv_3: TextView
    lateinit var tv_4: TextView
    lateinit var tv_5: TextView
    lateinit var tv_6: TextView
    lateinit var tv_7: TextView

    var cor:String?=null
    var cor1:String?=null
    var cor2:String?=null
    var naci:String?=null
    var naci1:String?=null
    var naci2:String?=null
    var animal:String?=null
    var animal1:String?=null
    var animal2:String?=null
    var esporte:String?=null
    var esporte1:String?=null
    var esporte2:String?=null

    lateinit var bt1: Button
    lateinit var bt2: Button
    lateinit var tv_m1: TextView
    lateinit var tv_m2: TextView
    lateinit var tv_m3: TextView
    lateinit var tv_m4: TextView
    lateinit var tv_m5: TextView
    lateinit var tv_m6: TextView
    lateinit var tv_m7: TextView
    lateinit var tv_m8: TextView
    lateinit var tv_m9: TextView
    lateinit var tv_m10: TextView
    lateinit var tv_m11: TextView
    lateinit var tv_m12: TextView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_teste_medio)

        spinner_cor = findViewById(R.id.sp1_cor)
        spinner_cor1 = findViewById(R.id.sp1_cor1)
        spinner_cor2 = findViewById(R.id.sp1_cor2)
        spinner_n = findViewById(R.id.sp1_naci)
        spinner_n1 = findViewById(R.id.sp1_naci1)
        spinner_n2 = findViewById(R.id.sp1_naci2)
        spinner_ani = findViewById(R.id.sp1_ani)
        spinner_ani1 = findViewById(R.id.sp1_ani1)
        spinner_ani2 = findViewById(R.id.sp1_ani2)
        spinner_esp = findViewById(R.id.sp1_esp)
        spinner_esp1 = findViewById(R.id.sp1_esp1)
        spinner_esp2 = findViewById(R.id.sp1_esp2)

        tv_1 = findViewById(R.id.tv_s1)
        tv_2 = findViewById(R.id.tv_s2)
        tv_3 = findViewById(R.id.tv_s3)
        tv_4 = findViewById(R.id.tv_s4)
        tv_5 = findViewById(R.id.tv_s5)
        tv_6 = findViewById(R.id.tv_s6)
        tv_7 = findViewById(R.id.tv_s7)

        tv_m1 = findViewById(R.id.tv_m1)
        tv_m2 = findViewById(R.id.tv_m2)
        tv_m3 = findViewById(R.id.tv_m3)
        tv_m4 = findViewById(R.id.tv_m4)
        tv_m5 = findViewById(R.id.tv_m5)
        tv_m6 = findViewById(R.id.tv_m6)
        tv_m7 = findViewById(R.id.tv_m7)
        tv_m8 = findViewById(R.id.tv_m8)
        tv_m9 = findViewById(R.id.tv_m9)
        tv_m10 = findViewById(R.id.tv_m10)
        tv_m11 = findViewById(R.id.tv_m11)
        tv_m12 = findViewById(R.id.tv_m12)

        bt1 = findViewById(R.id.bt_resposta2)
        bt2 = findViewById(R.id.bt_voltar2)


        spinner_cor.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {


                cor = spinner_cor.selectedItem.toString()

                if (cor == "Azul") {

                    tv_m1.setBackgroundColor(Color.parseColor("#2D76FF"))
                    tv_m2.setBackgroundColor(Color.parseColor("#2D76FF"))
                    tv_m3.setBackgroundColor(Color.parseColor("#2D76FF"))
                    tv_m4.setBackgroundColor(Color.parseColor("#2D76FF"))

                } else if (cor == "Branco") {

                    tv_m1.setBackgroundColor(Color.parseColor("#FFFFFF"))
                    tv_m2.setBackgroundColor(Color.parseColor("#FFFFFF"))
                    tv_m3.setBackgroundColor(Color.parseColor("#FFFFFF"))
                    tv_m4.setBackgroundColor(Color.parseColor("#FFFFFF"))

                } else if (cor == "Amarelo") {

                    tv_m1.setBackgroundColor(Color.parseColor("#FFF038"))
                    tv_m2.setBackgroundColor(Color.parseColor("#FFF038"))
                    tv_m3.setBackgroundColor(Color.parseColor("#FFF038"))
                    tv_m4.setBackgroundColor(Color.parseColor("#FFF038"))

                }else{

                    tv_m1.setBackgroundColor(Color.parseColor("#51FFA3"))
                    tv_m2.setBackgroundColor(Color.parseColor("#51FFA3"))
                    tv_m3.setBackgroundColor(Color.parseColor("#51FFA3"))
                    tv_m4.setBackgroundColor(Color.parseColor("#51FFA3"))

                }

            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                // Nada selecionado
            }
        }

        spinner_cor1.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {


                cor1 = spinner_cor1.selectedItem.toString()

                if (cor1 == "Azul") {

                    tv_m5.setBackgroundColor(Color.parseColor("#2D76FF"))
                    tv_m6.setBackgroundColor(Color.parseColor("#2D76FF"))
                    tv_m7.setBackgroundColor(Color.parseColor("#2D76FF"))
                    tv_m8.setBackgroundColor(Color.parseColor("#2D76FF"))

                } else if (cor1 == "Branco") {

                    tv_m5.setBackgroundColor(Color.parseColor("#FFFFFF"))
                    tv_m6.setBackgroundColor(Color.parseColor("#FFFFFF"))
                    tv_m7.setBackgroundColor(Color.parseColor("#FFFFFF"))
                    tv_m8.setBackgroundColor(Color.parseColor("#FFFFFF"))

                } else if (cor1 == "Amarelo") {

                    tv_m5.setBackgroundColor(Color.parseColor("#FFF038"))
                    tv_m6.setBackgroundColor(Color.parseColor("#FFF038"))
                    tv_m7.setBackgroundColor(Color.parseColor("#FFF038"))
                    tv_m8.setBackgroundColor(Color.parseColor("#FFF038"))

                }else{

                    tv_m5.setBackgroundColor(Color.parseColor("#51FFA3"))
                    tv_m6.setBackgroundColor(Color.parseColor("#51FFA3"))
                    tv_m7.setBackgroundColor(Color.parseColor("#51FFA3"))
                    tv_m8.setBackgroundColor(Color.parseColor("#51FFA3"))

                }


            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                // Nada selecionado
            }
        }


        spinner_cor2.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {


                cor2 = spinner_cor2.selectedItem.toString()

                if (cor2 == "Azul") {

                    tv_m9.setBackgroundColor(Color.parseColor("#2D76FF"))
                    tv_m10.setBackgroundColor(Color.parseColor("#2D76FF"))
                    tv_m11.setBackgroundColor(Color.parseColor("#2D76FF"))
                    tv_m12.setBackgroundColor(Color.parseColor("#2D76FF"))

                } else if (cor2 == "Branco") {

                    tv_m9.setBackgroundColor(Color.parseColor("#FFFFFF"))
                    tv_m10.setBackgroundColor(Color.parseColor("#FFFFFF"))
                    tv_m11.setBackgroundColor(Color.parseColor("#FFFFFF"))
                    tv_m12.setBackgroundColor(Color.parseColor("#FFFFFF"))

                } else if (cor2 == "Amarelo") {

                    tv_m9.setBackgroundColor(Color.parseColor("#FFF038"))
                    tv_m10.setBackgroundColor(Color.parseColor("#FFF038"))
                    tv_m11.setBackgroundColor(Color.parseColor("#FFF038"))
                    tv_m12.setBackgroundColor(Color.parseColor("#FFF038"))

                }else{

                    tv_m9.setBackgroundColor(Color.parseColor("#51FFA3"))
                    tv_m10.setBackgroundColor(Color.parseColor("#51FFA3"))
                    tv_m11.setBackgroundColor(Color.parseColor("#51FFA3"))
                    tv_m12.setBackgroundColor(Color.parseColor("#51FFA3"))

                }


            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                // Nada selecionado
            }
        }


        spinner_n.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {

                naci = spinner_n.selectedItem.toString()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                // Nada selecionado
            }
        }

        spinner_n1.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {

                naci1 = spinner_n1.selectedItem.toString()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                // Nada selecionado
            }
        }

        spinner_n2.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {

                naci2 = spinner_n2.selectedItem.toString()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                // Nada selecionado
            }
        }

        spinner_ani.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {

                animal = spinner_ani.selectedItem.toString()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                // Nada selecionado
            }
        }

        spinner_ani1.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {

                animal1 = spinner_ani1.selectedItem.toString()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                // Nada selecionado
            }
        }

        spinner_ani2.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {

                animal2 = spinner_ani2.selectedItem.toString()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                // Nada selecionado
            }
        }

        spinner_esp.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {

                esporte = spinner_esp.selectedItem.toString()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                // Nada selecionado
            }
        }

        spinner_esp1.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {

                esporte1 = spinner_esp1.selectedItem.toString()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                // Nada selecionado
            }
        }

        spinner_esp2.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {

                esporte2 = spinner_esp2.selectedItem.toString()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                // Nada selecionado
            }
        }

        var tentativas:Int
        tentativas=0;

        bt1.setOnClickListener {

            var acertos=0

            if(cor=="Amarelo"){

                acertos+=1
            }
            if(cor1=="Azul"){

                acertos+=1
            }
            if(cor2=="Branco"){

                acertos+=1
            }
            if(naci=="Alemão"){

                acertos+=1
            }
            if(naci1=="Brasileiro"){

                acertos+=1

            }
            if(naci2=="Espanhol"){

                acertos+=1
            }

            if(animal=="Borboletas"){

                acertos+=1
            }
            if(animal1=="Cavalos"){

                acertos+=1
            }
            if(animal2=="Cachorros"){

                acertos+=1
            }

            if(esporte=="Sinuca"){

                acertos+=1
            }

            if(esporte1=="Tênis"){

                acertos+=1
            }
            if(esporte2=="Futebol"){

                acertos+=1
            }


            if(cor=="Amarelo"&&cor1=="Azul"&&cor2=="Branco"&&naci=="Alemão"
                &&naci1=="Brasileiro"&&naci2=="Espanhol"&&animal=="Borboletas"&&animal1=="Cavalos"&&animal2=="Cachorros"
                &&esporte=="Sinuca"&&esporte1=="Tênis"&&esporte2=="Futebol"){

                Toast.makeText(applicationContext,"Parabens voce acertou tudo !!!\n"+"Tentativas:"+tentativas, Toast.LENGTH_SHORT).show()
            }else{
                tentativas++
                Toast.makeText(applicationContext,"Parabens voce acertou:\n"+acertos+"Tentativas:"+tentativas, Toast.LENGTH_SHORT).show()
            }

            if((cor=="Branco" && esporte=="Futebol")||(cor1=="Branco" && esporte1=="Futebol")||(cor2=="Branco" && esporte2=="Futebol")){

                tv_1.setTextColor(Color.GREEN)
            }else{

                tv_1.setTextColor(Color.BLACK)

            }

            if((naci1=="Espanhol" && esporte=="Tênis")||(naci2=="Espanhol" && esporte1=="Tênis")){

                tv_2.setTextColor(Color.GREEN)
            }else{

                tv_2.setTextColor(Color.BLACK)

            }

            if((naci=="Espanhol" && animal1=="Cavalos")||(naci1=="Espanhol" && animal=="Cavalos")||(naci1=="Espanhol" && animal2=="Cavalos")||(naci2=="Espanhol" && animal1=="Cavalos")){

                tv_3.setTextColor(Color.GREEN)
            }else{

                tv_3.setTextColor(Color.BLACK)

            }

            if((animal=="Borboletas" && naci1=="Brasileiro")||(animal1=="Borboletas" && naci2=="Brasileiro")){

                tv_4.setTextColor(Color.GREEN)

            }else{

                tv_4.setTextColor(Color.BLACK)

            }

            if((esporte1=="Tênis" &&naci=="Alemão" )||(esporte2=="Tênis" &&naci1=="Alemão" )){

                tv_5.setTextColor(Color.GREEN)
            }else{

                tv_5.setTextColor(Color.BLACK)

            }

            if((cor1=="Azul")){

                tv_6.setTextColor(Color.GREEN)
            }else{

                tv_6.setTextColor(Color.BLACK)

            }

            if((cor=="Branco" &&naci=="Espanhol" )||(cor1=="Branco" &&naci1=="Espanhol" )||(cor2=="Branco" &&naci2=="Espanhol" )){

                tv_7.setTextColor(Color.GREEN)
            }else{

                tv_7.setTextColor(Color.BLACK)

            }

        }


        bt2.setOnClickListener {


            val chamaTelas : Intent
            chamaTelas = Intent(this,Tela_Jogos::class.java)
            this.startActivity(chamaTelas)
        }


    }
}
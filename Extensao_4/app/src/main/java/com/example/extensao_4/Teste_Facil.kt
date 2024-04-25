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

class Teste_Facil : AppCompatActivity() {

    lateinit var spinner_cor: Spinner
    lateinit var spinner_cor1: Spinner
    lateinit var spinner_cor2: Spinner
    lateinit var spinner_n: Spinner
    lateinit var spinner_n1: Spinner
    lateinit var spinner_n2: Spinner

    lateinit var tv_1: TextView
    lateinit var tv_2: TextView
    lateinit var tv_3: TextView
    lateinit var tv_f1: TextView
    lateinit var tv_f2: TextView
    lateinit var tv_f3: TextView
    lateinit var tv_f4: TextView
    lateinit var tv_f5: TextView
    lateinit var tv_f6: TextView

     var cor:String?=null
     var cor1:String?=null
     var cor2:String?=null
     var naci:String?=null
     var naci1:String?=null
     var naci2:String?=null

    lateinit var bt1:Button
    lateinit var bt2:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_teste_facil)

        spinner_cor = findViewById(R.id.sp_cor)
        spinner_cor1 = findViewById(R.id.sp_cor1)
        spinner_cor2 = findViewById(R.id.sp_cor2)

        spinner_n = findViewById(R.id.sp_n)
        spinner_n1 = findViewById(R.id.sp_n1)
        spinner_n2 = findViewById(R.id.sp_n2)

        tv_1 = findViewById(R.id.tv_1)
        tv_2 = findViewById(R.id.tv_2)
        tv_3 = findViewById(R.id.tv_3)

        bt1 = findViewById(R.id.bt_resposta)
        bt2 = findViewById(R.id.bt_voltar)

        tv_f1 = findViewById(R.id.tv_f1)
        tv_f2 = findViewById(R.id.tv_f2)
        tv_f3 = findViewById(R.id.tv_f3)
        tv_f4 = findViewById(R.id.tv_f4)
        tv_f5 = findViewById(R.id.tv_f5)
        tv_f6 = findViewById(R.id.tv_f6)

        bt1.setBackgroundColor(Color.parseColor("#A9D8ED"))
        bt2.setBackgroundColor(Color.parseColor("#A9D8ED"))

        var tentativas: Int
        tentativas = 1

        spinner_cor.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {

                cor = spinner_cor.selectedItem.toString()

                if (cor == "Azul") {

                    tv_f1.setBackgroundColor(Color.parseColor("#2D76FF"))
                    tv_f2.setBackgroundColor(Color.parseColor("#2D76FF"))

                } else if (cor == "Vermelho") {

                    tv_f1.setBackgroundColor(Color.parseColor("#FF3535"))
                    tv_f2.setBackgroundColor(Color.parseColor("#FF3535"))

                } else if (cor == "Verde") {

                    tv_f1.setBackgroundColor(Color.parseColor("#5CFF57"))
                    tv_f2.setBackgroundColor(Color.parseColor("#5CFF57"))

                }else{

                    tv_f1.setBackgroundColor(Color.parseColor("#A9D8ED"))
                    tv_f2.setBackgroundColor(Color.parseColor("#A9D8ED"))

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

                    tv_f3.setBackgroundColor(Color.parseColor("#2D76FF"))
                    tv_f4.setBackgroundColor(Color.parseColor("#2D76FF"))

                } else if (cor1 == "Vermelho") {

                    tv_f3.setBackgroundColor(Color.parseColor("#FF3535"))
                    tv_f4.setBackgroundColor(Color.parseColor("#FF3535"))

                } else if (cor1 == "Verde") {

                    tv_f3.setBackgroundColor(Color.parseColor("#5CFF57"))
                    tv_f4.setBackgroundColor(Color.parseColor("#5CFF57"))

                }else{

                    tv_f3.setBackgroundColor(Color.parseColor("#A9D8ED"))
                    tv_f4.setBackgroundColor(Color.parseColor("#A9D8ED"))

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

                    tv_f5.setBackgroundColor(Color.parseColor("#2D76FF"))
                    tv_f6.setBackgroundColor(Color.parseColor("#2D76FF"))

                } else if (cor2 == "Vermelho") {

                    tv_f5.setBackgroundColor(Color.parseColor("#FF3535"))
                    tv_f6.setBackgroundColor(Color.parseColor("#FF3535"))

                } else if (cor2 == "Verde") {

                    tv_f5.setBackgroundColor(Color.parseColor("#5CFF57"))
                    tv_f6.setBackgroundColor(Color.parseColor("#5CFF57"))

                }else{

                    tv_f5.setBackgroundColor(Color.parseColor("#A9D8ED"))
                    tv_f6.setBackgroundColor(Color.parseColor("#A9D8ED"))

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
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {

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


        bt1.setOnClickListener {

            var acertos=0

            if(cor=="Azul"){

                acertos+=1
            }
            if(cor1=="Vermelho"){

                acertos+=1
            }
            if(cor2=="Verde"){

                acertos+=1
            }
            if(naci=="Alemão"){

                acertos+=1
            }
            if(naci1=="Italiano"){

                acertos+=1

            }
            if(naci2=="Espanhol"){

                acertos+=1
            }


            if(cor=="Azul"&&cor1=="Vermelho"&&cor2=="Verde"&&naci=="Alemão"&&naci1=="Italiano"&&naci2=="Espanhol"){

                Toast.makeText(applicationContext,"Parabens voce acertou tudo !!!\n"+"Tentativas:"+tentativas, Toast.LENGTH_SHORT).show()
            }else{
                tentativas++
                Toast.makeText(applicationContext,"Parabens voce acertou:\n"+acertos+"Tentativas:"+tentativas, Toast.LENGTH_SHORT).show()
            }
            if(cor=="Azul"&&naci=="Alemão"  || cor1=="Azul"&&naci1=="Alemão" || cor2=="Azul"&&naci2=="Alemão"){

                tv_2.setTextColor(Color.GREEN)
            }
            else{
                tv_2.setTextColor(Color.BLACK)

                }

            if(naci1=="Italiano"){

                tv_3.setTextColor(Color.GREEN)
            }
            else{
                tv_3.setTextColor(Color.BLACK)

                }

            if(cor=="Vermelho" && naci1=="Espanhol"||cor1=="Vermelho" && naci2=="Espanhol" ){

                tv_1.setTextColor(Color.GREEN)
            }
            else{
                tv_1.setTextColor(Color.BLACK)

                }

    }

        bt2.setOnClickListener {


            val chamaTelas : Intent
            chamaTelas = Intent(this,Tela_Jogos::class.java)
            this.startActivity(chamaTelas)
        }

    }
}
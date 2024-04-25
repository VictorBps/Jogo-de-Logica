package com.example.extensao_4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button=findViewById(R.id.bt_1)

        button.setOnClickListener {
            val chamaTelas : Intent
            chamaTelas = Intent(this,TelaAux::class.java)
            this.startActivity(chamaTelas)

            /*Intent(this, Tela_Super::class.java).let {
                register.launch(it)
            }*/

        }

    }
}
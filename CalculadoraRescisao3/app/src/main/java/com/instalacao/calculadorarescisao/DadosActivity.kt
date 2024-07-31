package com.instalacao.calculadorarescisao

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController


class DadosActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dados)

        val botaoCalcular : Button = findViewById(R.id.btCalcular)

        botaoCalcular.setOnClickListener{
            val intent = Intent(this, ResultadoActivity::class.java)
            startActivity(intent)
        }

    }

}
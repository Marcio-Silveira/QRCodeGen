package com.instalacao.calculadorarescisao

import android.os.Bundle
import android.webkit.WebView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ResultadoActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_resultado)

        fun webView() : WebView = findViewById(R.id.webView)
        webView().loadUrl("https://www.google.com")

    }
}

private fun WebView.loadUrl() {
    TODO("Not yet implemented")
}

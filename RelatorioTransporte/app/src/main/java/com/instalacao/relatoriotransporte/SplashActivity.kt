package com.instalacao.relatoriotransporte

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.instalacao.relatoriotransporte.databinding.ActivitySplashBinding
import kotlinx.coroutines.newSingleThreadContext
import kotlin.math.roundToLong

class SplashActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivitySplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Handler().postDelayed(Runnable() {

            fun run() {
                startActivity(Intent(baseContext,MainActivity::class.java))
                finish()
            }
        },5000)

    }

}

private fun Handler.postDelayed(runnable: Runnable) {

}


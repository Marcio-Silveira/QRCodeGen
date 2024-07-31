package com.instalacao.relatoriotransporte.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.instalacao.relatoriotransporte.R
import com.instalacao.relatoriotransporte.ui.theme.Green200
import com.instalacao.relatoriotransporte.ui.theme.Green500
import com.instalacao.relatoriotransporte.ui.theme.Green700
import com.instalacao.relatoriotransporte.ui.theme.Green900

@Composable
fun FormLogin(){

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.sweepGradient(
                    listOf(
                        Color.Black,
                        Green900,
                        Color.Black
                    )
                )
            ),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            text = "Consulvel",
            fontSize = 36.sp,
            fontFamily = FontFamily.Monospace,
            color = Color.White,
            style = TextStyle(
                brush = Brush.horizontalGradient(
                    listOf(
                        Color.White,
                        Green500,
                        Green200
                    )
                )
            )
        )

    }

}

@Composable
@Preview
private fun FormLoginPreview(){
    FormLogin()
}



package com.instalacao.menurestaurante

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.instalacao.menurestaurante.model.Comida
import com.instalacao.menurestaurante.ui.theme.MenuRestauranteTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ListaCardapio()
        }
    }
}

@Composable
private fun ListaCardapio(){

    val ListaComidas : MutableList<Comida> = mutableListOf(
        Comida(
            imgComida = R.drawable.tropeiro,
            nomeComida = "Tropeiro",
            descricaoComida = "jdfakjfnuhdvkjnvdnvdjnasnd",
            preco = "R$16.00"
        ),
        Comida(
            imgComida = R.drawable.feijoada,
            nomeComida = "Feijoada",
            descricaoComida = "feijjfbklalsinalmcoamsasd",
            preco = "R$ 22.00"
        ),
        Comida(
            imgComida = R.drawable.pasteis,
            nomeComida = "pastéis",
            descricaoComida = "pasdnrgjndmnandsoifammaosd",
            preco = "R$ 9.00"
        ),
        Comida(
            imgComida = R.drawable.hamburguer,
            nomeComida = "Hamburguer",
            descricaoComida = "hamburgljnhdlnlaçmfalkfpaç",
            preco = "R$ 19.00"
        )
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
    ) {
        LazyColumn {


            }

        }
    }







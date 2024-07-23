package com.instalacao.menurestaurante.lista_item

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ShapeDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import com.instalacao.menurestaurante.R

@Composable
fun ItemComida(

){

    ConstraintLayout(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.Black)
            .padding(0.dp, 10.dp, 0.dp, 10.dp)
    ) {
        val(
            imgComida,
            txtNomeComida,
            txtDescricaoComida,
            txtPreco,
            btCarrinho,
            containerImg,
            rowItem
        ) = createRefs()

            Card(
                modifier = Modifier
                    .constrainAs(containerImg) {
                        top.linkTo(parent.top, 0.dp)
                        start.linkTo(parent.start, 0.dp)
                    }
                    .size(130.dp)
                    .padding(20.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color.White
                ),
                shape = ShapeDefaults.Large,
                elevation = CardDefaults.cardElevation(
                    defaultElevation = 12.dp
                )
            ) {


            }
        Image(
            painter = painterResource(id = R.drawable.tropeiro),
            contentDescription = null,
            modifier = Modifier
                .constrainAs(imgComida) {
                    top.linkTo(containerImg.top, 0.dp)
                    start.linkTo(containerImg.start, 0.dp)
                    end.linkTo(containerImg.end, 0.dp)
                    bottom.linkTo(containerImg.bottom, 0.dp)
                }
                .size(60.dp)
        )

        Text(
            text = "Comida 1",
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
            color = Color.White,
            modifier = Modifier.constrainAs(txtNomeComida){
                top.linkTo(parent.top, 20.dp)
                start.linkTo(containerImg.end, 0.dp)
            }
        )

        Text(
            text = "asfldgfshngrkgnlsignksldgnlsnglsngnadfdfkkvblnkfndsl",
            fontSize = 14.sp,
            fontWeight = FontWeight.Bold,
            color = Color.White,
            modifier = Modifier
                .constrainAs(txtDescricaoComida) {
                    top.linkTo(txtNomeComida.bottom)
                    start.linkTo(containerImg.end)
                    end.linkTo(parent.end)
                }
                .padding(65.dp, 10.dp, 40.dp, 0.dp),
            maxLines = 3
        )

        Text(
            text = "R$ 28.00",
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
            color = Color.White,
            modifier = Modifier.constrainAs(txtPreco){
                top.linkTo(txtDescricaoComida.bottom, 25.dp)
                start.linkTo(containerImg.end, 0.dp)
            }
        )
        
        Button(
            onClick = {

            },
            modifier = Modifier
                .height(45.dp)
                .constrainAs(btCarrinho) {
                    top.linkTo(txtDescricaoComida.bottom, 10.dp)
                    start.linkTo(txtPreco.end, 15.dp)
                    end.linkTo(parent.end)


                },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xfff44336)
            )

        ) {
            Text(
                text = "Add Carrinho",
                fontSize = 14.sp,
                color = Color.White,
                fontWeight = FontWeight.Bold

            )
            
        }

        Row(
            modifier = Modifier.width(350.dp).height(3.dp).background(Color.White)
                .constrainAs(rowItem){
                    top.linkTo(txtPreco.bottom, 30.dp)
                    start.linkTo(parent.start, 20.dp)
                    end.linkTo(parent.end, 20.dp)

                }
        ) {

        }

        }


}





@Composable
@Preview
fun ItemComidaPreview(){
    ItemComida()
}
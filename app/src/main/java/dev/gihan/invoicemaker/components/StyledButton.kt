package dev.gihan.invoicemaker.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.ConstraintSet
import dev.gihan.invoicemaker.R
import dev.gihan.invoicemaker.ui.theme.AppUITheme


@Composable
fun StyledButton(
    srcId: Int,
    buttonText: String,
    onButtonClick: () -> Unit,
) {
    val errorColors = ButtonDefaults.buttonColors(
        backgroundColor = MaterialTheme.colors.error,
        contentColor = Color.White
    )

    Column(
        modifier = Modifier
            .padding(5.dp)
            .padding(20.dp)
    ) {
        Button(onClick = { onButtonClick.invoke() }, colors = errorColors) {

            val constraints = ConstraintSet {
                val image = createRefFor("image")
                val box = createRefFor("box")
                constrain(image){
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)
                    start.linkTo(parent.start)
                }
                constrain(box){
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                }
            }

            ConstraintLayout(constraintSet = constraints, modifier = Modifier.fillMaxWidth()) {
                Image(
                    painter = painterResource(id = srcId),
                    contentDescription = buttonText,
                    modifier = Modifier.height(30.dp).layoutId("image"),
                    contentScale = ContentScale.FillHeight
                )
                Box(
                    Modifier
                        .layoutId("box")
                        .fillMaxWidth()
                        .wrapContentSize(Alignment.Center)
                ) {
                    Text(buttonText, color = Color.White, style = MaterialTheme.typography.h4)
                }
            }
        }
    }

}

@Preview
@Composable
fun StyledButtonPreview() {
    AppUITheme {
        StyledButton(
            srcId = R.drawable.google_icon,
            buttonText = "Sign In",
            onButtonClick = {}
        )
    }
}
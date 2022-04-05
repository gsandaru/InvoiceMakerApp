package dev.gihan.invoicemaker.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.SnackbarDefaults.backgroundColor
import androidx.compose.material.Text
import androidx.compose.material.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.gihan.invoicemaker.ui.theme.AppUITheme

@Composable
fun StyledCard(
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit
) {
    Card(
        modifier = modifier,
        shape = RoundedCornerShape(8.dp),
        backgroundColor = MaterialTheme.colors.surface,
        contentColor = contentColorFor(backgroundColor),
        border = null,
        elevation = 1.dp,
        ) {
        Column {
            Box(
                Modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
                    .height(20.dp)
                    .background(MaterialTheme.colors.primaryVariant)
            )
            content()
        }

    }
}

@Preview
@Composable
fun StyledCardPreview() {
    AppUITheme {
        StyledCard(
            modifier = Modifier
                .fillMaxSize()
                .padding(10.dp)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentSize(Alignment.Center)
            ) {
                Text("Welcome", style = MaterialTheme.typography.h4)
            }
        }
    }

}
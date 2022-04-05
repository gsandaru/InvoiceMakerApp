package dev.gihan.invoicemaker.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.ConstraintSet
import androidx.fragment.app.Fragment
import dev.gihan.invoicemaker.R
import dev.gihan.invoicemaker.components.StyledButton
import dev.gihan.invoicemaker.components.StyledCard
import dev.gihan.invoicemaker.ui.theme.AppUITheme


class LoginFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return ComposeView(requireContext()).apply {

        }
    }
}

@Composable
fun LoginComposable() {

    val constraints = ConstraintSet {
        val topLogo = createRefFor("top_logo")
        val middleCard = createRefFor("middle_card")

        val topGuideLine = createGuidelineFromTop(0.15f)
        constrain(topLogo) {
            top.linkTo(topGuideLine)
            start.linkTo(parent.start)
            end.linkTo(parent.end)
        }
        constrain(middleCard) {
            top.linkTo(parent.top)
            bottom.linkTo(parent.bottom)
            start.linkTo(parent.start)
            end.linkTo(parent.end)
        }
    }

    Scaffold(backgroundColor = MaterialTheme.colors.primary) {
        ConstraintLayout(constraintSet = constraints, modifier = Modifier.fillMaxSize()) {
            Box(
                modifier = Modifier
                    .size(80.dp)
                    .clip(CircleShape)
                    .background(color = Color.White)
                    .layoutId("top_logo"),
            )
            StyledCard(
                modifier = Modifier
                    .layoutId("middle_card")
                    .fillMaxWidth()
                    .wrapContentHeight()
                    .padding(horizontal = 10.dp)
            ) {
                Column(modifier = Modifier.padding(10.dp)) {
                    Text("Hey!", style = MaterialTheme.typography.h2)
                    Text("Let's invoice your first customer", style = MaterialTheme.typography.h4)
                }
                StyledButton(
                    srcId = R.drawable.google_icon,
                    buttonText = "Sign In",
                    onButtonClick = {}
                )
            }
        }
    }

}

@Preview
@Composable
fun Preview() {
    AppUITheme {
        LoginComposable()
    }
}
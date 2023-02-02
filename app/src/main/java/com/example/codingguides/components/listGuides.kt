package com.example.codingguides.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.codingguides.data.CodeItem


@Composable
fun EachGuide(CodeItem: CodeItem, modifier: Modifier = Modifier) {
    var expanded by remember {
        mutableStateOf(false)
    }
    Card(
        modifier = Modifier
            .padding(8.dp)
            .background(color = Color.LightGray)
            .sizeIn(350.dp), elevation = 2.dp
    ) {
        Column(
            modifier = Modifier
                .padding(8.dp)
                .sizeIn(maxWidth = 70.dp)
                .background(color = Color.White),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(text = stringResource(CodeItem.nameRes), style = MaterialTheme.typography.subtitle1, color = Color.Blue)
            Box(
                modifier = Modifier
                    .clip(RoundedCornerShape(10.dp))
                    .size(300.dp)
            ) {
                Image(
                    modifier = Modifier.fillMaxSize(),
                    painter = painterResource(CodeItem.imageRes),
                    contentDescription = null
                )
            }
            Surface(
                modifier = Modifier
                    .clip(shape = RoundedCornerShape(8.dp))
                    .clickable { expanded = !expanded },
                color = Color.LightGray
            ) {
                Text(
                    text = "LearnMore:",
                    style = MaterialTheme.typography.subtitle1,
                    color = Color.Blue,
                    modifier = Modifier.padding(8.dp)
                )

            }
            if (expanded) {
                Column(
                    modifier = Modifier.fillMaxWidth(1f),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = stringResource(CodeItem.descRes),
                        style = MaterialTheme.typography.body1
                    )
                }
            }
        }
    }
}

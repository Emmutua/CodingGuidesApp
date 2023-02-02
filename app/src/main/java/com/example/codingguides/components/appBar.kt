package com.example.codingguides.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.superhero.R


@Preview
@Composable
fun AppBarCompose(modifier: Modifier = Modifier) {
    Row(
        modifier = Modifier
            .background(MaterialTheme.colors.surface)
            .fillMaxWidth().height(72.dp),
        verticalAlignment = Alignment.Top, horizontalArrangement = Arrangement.Center
    ) {
Box( modifier = Modifier
    .size(150.dp)
    .padding(10.dp), Alignment.TopStart) {
    Image(
        painter = painterResource(R.drawable.appbar),
        contentScale = ContentScale.Fit,
        contentDescription = null
    )
}
        Text(
            modifier =Modifier.padding(top = 10.dp),
            text = stringResource(R.string.app_name),
            style = MaterialTheme.typography.h1,
            color = Color.Blue,
            fontSize = 40.sp,
            maxLines = 1
        )
    }
}
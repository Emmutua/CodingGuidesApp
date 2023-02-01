package com.example.codingguides

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ExpandLess
import androidx.compose.material.icons.filled.ExpandMore
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.codingguides.data.CodeItem
import com.example.superhero.R


@Composable
fun EachGuide(CodeItem: CodeItem, modifier: Modifier = Modifier) {
    var expanded by remember {
        mutableStateOf(false)
    }
    Card(
        modifier = Modifier
            .padding(8.dp)
            .background(MaterialTheme.colors.surface), elevation = 2.dp
    ) {
        Column(
            modifier = Modifier.padding(8.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(text = stringResource(CodeItem.nameRes), style = MaterialTheme.typography.h3)
            Box(modifier = Modifier.clip(RoundedCornerShape(10.dp))) {
                Image(
                    modifier = Modifier.size(300.dp),
                    painter = painterResource(CodeItem.imageRes),
                    contentDescription = null
                )
            }
            Row(verticalAlignment = Alignment.CenterVertically) {
                Text(text = "KnowMore:", style = MaterialTheme.typography.h3)
                Spacer(Modifier.weight(1f))
                CodeIconButton(modifier = Modifier.size(60.dp), expanded = expanded,onClick = { expanded = !expanded })

            }
            if (expanded) {
                Text(text = stringResource(CodeItem.descRes), style = MaterialTheme.typography.body1)
            }
        }
    }
}

@Composable
private fun CodeIconButton(
    modifier: Modifier,
    expanded: Boolean,
    onClick: () -> Unit
) {
    IconButton(onClick =  onClick ,Modifier.size(30.dp)) {
        Icon( imageVector = if (expanded) Icons.Filled.ExpandLess else Icons.Filled.ExpandMore, contentDescription = "expand more button")
    }
}
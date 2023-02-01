package com.example.codingguides

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.codingguides.components.AppBarCompose
import com.example.codingguides.components.EachGuide
import com.example.codingguides.data.CodeItem
import com.example.codingguides.data.ListOfCodeItems
import com.example.codingguides.data.ListOfCodeItems.CodeItems
import com.example.codingguides.ui.theme.CodingGuidesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CodingGuidesTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    MainApp()
                }
            }
        }
    }
}

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Preview(showSystemUi = true)
@Composable
fun MainApp() {
    Scaffold(topBar = { AppBarCompose() }) {
       LazyColumn(modifier = Modifier.background(MaterialTheme.colors.surface).padding(8.dp)){
           items(CodeItems){
               EachGuide(CodeItem = it)
           }
       }
    }
}
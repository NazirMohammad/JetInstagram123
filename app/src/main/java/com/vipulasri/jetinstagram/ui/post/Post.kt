package com.vipulasri.jetinstagram.ui.post

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier


@Composable
fun Post(){

        Scaffold(
            topBar = { MyAppBar(
                title = "My App") },
            content = {
                Column(Modifier.fillMaxWidth())  {
                    Text(text = "NewPost ")
                    
                }
            }
        )
    }

@Composable
fun MyAppBar(title: String) {
    TODO("Not yet implemented")
}











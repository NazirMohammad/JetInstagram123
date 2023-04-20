package com.vipulasri.jetinstagram.ui.favorites

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.vipulasri.jetinstagram.R
import com.vipulasri.jetinstagram.data.FavoriteRepository
import com.vipulasri.jetinstagram.model.Favorite
import com.vipulasri.jetinstagram.ui.components.icon


@Composable
fun Favorite(){
val coroutineScope = rememberCoroutineScope()
    Scaffold(
        topBar = { Toolbar() }
    ) {
        val favs by FavoriteRepository.favs

        Column {
            FavInfo()
            SearchBar()
            LazyColumn(
                modifier = Modifier
                    .padding(top = 10.dp)
            ) {

                itemsIndexed(favs) { _, fav ->
                    Fav(fav)
        }


            }
        }
    }
}


@Composable
fun SearchBar(
    modifier: Modifier=Modifier
    ){

        TextField(value = "",
            onValueChange ={},
            leadingIcon ={
                Icon(
                    imageVector = Icons.Default.Search,
                    contentDescription = null
                )
            },
            colors = TextFieldDefaults.textFieldColors(
                backgroundColor = MaterialTheme.colors.surface
            ),
            placeholder={
                Text( text = stringResource(R.string.search))
            },
            modifier = modifier
                .fillMaxWidth()
                .heightIn(min = 56.dp)
        )
    }

@Composable
fun Fav
            (fav: Favorite
) {
                FavouriteView(fav)

}


@Composable
private fun Toolbar(){
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(56.dp)
            .padding(horizontal = 10.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ){
        Icon(
            Icons.Default.Close,
            modifier = Modifier.icon(),
            contentDescription = null
        )
        Text(
            text = "Favorite",
            fontWeight = FontWeight.Bold
        )
        Icon(
            Icons.Default.Add,
            modifier = Modifier.icon(),
            contentDescription = null
        )



    }
}


@Composable
fun FavInfo(
    modifier: Modifier = Modifier
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 4.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box(modifier = Modifier.weight(1f)) {




            Text(
                text = "New post from your favorite will appear higher in feed.Only you can see who you add or remove .How it works ",

                )
        }

    }}














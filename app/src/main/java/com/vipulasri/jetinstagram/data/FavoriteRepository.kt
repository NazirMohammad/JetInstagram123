package com.vipulasri.jetinstagram.data

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import com.vipulasri.jetinstagram.model.Favorite
import com.vipulasri.jetinstagram.model.User
import com.vipulasri.jetinstagram.model.names
import com.vipulasri.jetinstagram.model.usernames

object FavoriteRepository {
    private val _favs = mutableStateOf<List<Favorite>>(emptyList())
    val favs: State<List<Favorite>> = _favs

    private fun populateFavourite() {
        val favs = ArrayList<Favorite>()
        (0..9).forEach { index ->
            val fav = Favorite(
                id = index + 1,
                user = User(
                    name = names[index],
                    username = usernames[index],
                    image = "https://randomuser.me/api/portraits/men/${index + 1}.jpg"
                )
            )
            favs.add(fav)
        }

        this._favs.value = favs
    }

    init {
        populateFavourite()
    }

}

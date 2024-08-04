package com.biswesh.club_card.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowRight
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.biswesh.club_card.model.data.Club
import com.biswesh.club_card.viewModel.ClubViewModel

@Composable
fun ClubScreen(viewModel: ClubViewModel) {
    val clubs by viewModel.clubs.collectAsState()

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(text = "All Clubs", fontSize = 20.sp, fontWeight = FontWeight.Bold)
        TextButton(onClick = { /*TODO*/ }) {
            Text(text = "Menu")
            Icon(
                imageVector = Icons.AutoMirrored.Filled.ArrowRight,
                contentDescription = null
            )
        }
    }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(8.dp)
    ) {
//        LazyRow(
//            modifier = Modifier
//                .fillMaxWidth()
//                .padding(vertical = 8.dp),
//        ) {
//            items(clubs) { club ->
//                ClubCard(club = club, onClick = viewModel::onClubClick)
//            }
//        }
        LazyVerticalGrid(
            columns = GridCells.Adaptive(minSize = 180.dp),
            modifier = Modifier
                .size(800.dp)
                .padding(2.dp)

        ) {
            items(clubs) { club ->
                Box(
                    modifier = Modifier
                        .width(160.dp)
                        .height(300.dp)
                        .padding(4.dp)

                ) {
                    ClubCard(club = club, onClick = viewModel::onClubClick)
                }
            }
        }
    }
}


@Composable
fun ClubCard(club: Club, onClick: (Club) -> Unit) {
    Card(
        modifier = Modifier
            .padding(8.dp)
            .clickable { onClick(club) }
            .width(160.dp)
            .height(300.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White),
        elevation = CardDefaults.cardElevation(8.dp),
        shape = RoundedCornerShape(12.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(12.dp)
        ) {
            Image(
                painter = painterResource(id = club.imageResId),
                contentDescription = null,
                modifier = Modifier
                    .width(200.dp)
                    .height(130.dp)
                    .background(Color.Gray, shape = RoundedCornerShape(8.dp))
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = club.name,
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black
            )
            Spacer(modifier = Modifier.height(4.dp))
            Text(
                text = club.description,
                fontSize = 14.sp,
                color = Color.Gray
            )
        }
    }
}

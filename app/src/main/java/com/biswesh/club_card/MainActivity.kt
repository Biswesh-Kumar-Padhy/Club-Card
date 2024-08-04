package com.biswesh.club_card

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.biswesh.club_card.model.repository.ClubRepository
import com.biswesh.club_card.ui.theme.ClubCardTheme
import com.biswesh.club_card.view.ClubScreen
import com.biswesh.club_card.viewModel.ClubViewModel
import com.biswesh.club_card.viewModel.ClubViewModelFactory

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val clubRepository = ClubRepository()
            val clubViewModel: ClubViewModel = viewModel(factory = ClubViewModelFactory(clubRepository))
            ClubCardTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize()
                ) { innerPadding ->
                    Column(
                        modifier = Modifier
                            .padding(innerPadding)
                            .padding(8.dp)
                            .verticalScroll(rememberScrollState())
                    ) {
                        ClubScreen(clubViewModel)
                    }
                }
            }
        }
    }
}

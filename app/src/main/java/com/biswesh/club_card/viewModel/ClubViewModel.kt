package com.biswesh.club_card.viewModel

import androidx.lifecycle.ViewModel
import com.biswesh.club_card.model.data.Club
import com.biswesh.club_card.model.repository.ClubRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class ClubViewModel(private val repository: ClubRepository) : ViewModel() {
    private val _clubs = MutableStateFlow<List<Club>>(emptyList())
    val clubs: StateFlow<List<Club>> get() = _clubs

    private val _selectedClub = MutableStateFlow<Club?>(null)
    val selectedClub: StateFlow<Club?> get() = _selectedClub

    init {
        loadClubs()
    }

    private fun loadClubs() {
        _clubs.value = repository.getClubs()
    }

    fun onClubClick(club: Club) {
        _selectedClub.value = club
    }
}

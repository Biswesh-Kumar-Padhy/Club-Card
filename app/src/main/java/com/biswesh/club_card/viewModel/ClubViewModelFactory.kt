package com.biswesh.club_card.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.biswesh.club_card.model.repository.ClubRepository

class ClubViewModelFactory(private val repository: ClubRepository) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(ClubViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return ClubViewModel(repository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}

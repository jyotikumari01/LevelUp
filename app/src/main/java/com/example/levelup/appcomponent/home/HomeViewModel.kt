package com.example.levelup.appcomponent.home

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.example.levelup.appcomponent.data.source.HomeDataModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class HomeViewModel: ViewModel() {
    private var _states = MutableStateFlow(UiState())
    val states: StateFlow<UiState> = _states


    fun getNetworkCall(){

    }
}


sealed class UiState {
    data object Loading : Boolean = false
    data class Error : UiState<String> = null
    data class Success : UiState<HomeDataModel> = null
}
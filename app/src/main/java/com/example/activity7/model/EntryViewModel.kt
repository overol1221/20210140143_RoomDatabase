package com.example.activity7.model

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.example.activity7.repositori.RepositoriSiswa

class EntryViewModel(private val repositoriSiswa: RepositoriSiswa): ViewModel(){
    var uiStateSiswa by mutableStateOf(UIStateSiswa())
        private set


}
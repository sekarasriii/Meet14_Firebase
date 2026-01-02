package com.example.meet14_firebase.viewmodel

import com.example.meet14_firebase.modeldata.Siswa
import com.example.meet14_firebase.repositori.RepositorySiswa
import androidx.lifecycle.ViewModel
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.getValue
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import java.io.IOException
import androidx.compose.runtime.setValue

sealed interface StatusUiSiswa {
    data class Success(val siswa: List<Siswa> = listOf()) : StatusUiSiswa
    object Error : StatusUiSiswa
    object Loading : StatusUiSiswa
}
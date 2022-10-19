package com.kapps.dialogyt

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    var isDialogShown by mutableStateOf(false)
        private set

    fun onPurchaseClick(){
        isDialogShown = true
    }

    fun onDismissDialog(){
        isDialogShown = false
    }
}
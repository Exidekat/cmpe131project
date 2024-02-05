package com.example.gptkeys.ui.about

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class AboutViewModel : ViewModel() {

    private val _texthaydon = MutableLiveData<String>().apply {
        value = "Haydon Behl"
    }
    private val _textneal = MutableLiveData<String>().apply {
        value = "Neal Chandra"
    }

    val texthaydon: LiveData<String> = _texthaydon
    val textneal: LiveData<String> = _textneal


}


package com.example.nariveamdroid2

import androidx.lifecycle.ViewModel
import androidx.lifecycle.MutableLiveData


class TaskViewModel: ViewModel()
{
    var name = MutableLiveData<String>()
    var desc = MutableLiveData<String>()

}
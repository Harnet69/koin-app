package com.vital.kokhanau.koinapp.presentation.viewmodel

import androidx.lifecycle.ViewModel
import com.vital.kokhanau.koinapp.domain.GetDataUseCase

class DataViewModel(
    private val getDataUseCase: GetDataUseCase
) : ViewModel() {

    suspend fun getData() =
        getDataUseCase.invoke()
}

package com.vital.kokhanau.koinapp.domain

import android.util.Log
import com.vital.kokhanau.koinapp.data.model.AppDataModel
import com.vital.kokhanau.koinapp.data.repository.DataRepository
import retrofit2.HttpException

class GetDataUseCase(
    private val getRepository: DataRepository
) {

    suspend operator fun invoke(): List<AppDataModel>? {
        return try {
            Log.i("GetDataUseCase", "invoke: ")
            getRepository.getData()
        } catch (httpException: HttpException) {
            Log.e("GetDataUseCase", httpException.message())
            null
        }
    }
}

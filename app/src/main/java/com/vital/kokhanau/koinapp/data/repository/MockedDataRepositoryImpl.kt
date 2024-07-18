package com.vital.kokhanau.koinapp.data.repository

import com.vital.kokhanau.koinapp.data.model.AppDataModel
import kotlinx.coroutines.delay

@Suppress("MagicNumber")
class MockedDataRepositoryImpl : DataRepository {
    override suspend fun getData(): List<AppDataModel> {
        delay(5000)
        return listOf(
            AppDataModel("John"),
            AppDataModel("Sam"),
            AppDataModel("Sally")
        )
    }
}

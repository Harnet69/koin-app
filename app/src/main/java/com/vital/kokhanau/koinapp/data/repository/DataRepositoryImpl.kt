package com.vital.kokhanau.koinapp.data.repository

import com.vital.kokhanau.koinapp.data.model.AppDataModel
import com.vital.kokhanau.koinapp.service.DataService

class DataRepositoryImpl(
    private val dataService: DataService
) : DataRepository {
    override suspend fun getData(): List<AppDataModel> {
        return dataService.getData()
    }
}

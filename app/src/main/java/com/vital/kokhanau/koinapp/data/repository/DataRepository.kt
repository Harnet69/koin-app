package com.vital.kokhanau.koinapp.data.repository

import com.vital.kokhanau.koinapp.data.model.AppDataModel

interface DataRepository {

    suspend fun getData(): List<AppDataModel>?
}

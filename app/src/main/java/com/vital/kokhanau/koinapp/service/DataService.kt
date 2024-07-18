package com.vital.kokhanau.koinapp.service

import com.vital.kokhanau.koinapp.data.model.AppDataModel
import retrofit2.http.GET

interface DataService {

    @GET(OfficeDataServiceEndpoint.KOIN_APP_URL)
    suspend fun getData(): List<AppDataModel>
}

private object OfficeDataServiceEndpoint {

    const val KOIN_APP_URL = "https://appapi.vital.kokhanau.com/koin-app"
}

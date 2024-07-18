package com.vital.kokhanau.koinapp.di

import com.vital.kokhanau.koinapp.data.repository.DataRepository
import com.vital.kokhanau.koinapp.data.repository.MockedDataRepositoryImpl
import com.vital.kokhanau.koinapp.domain.GetDataUseCase
import com.vital.kokhanau.koinapp.presentation.viewmodel.DataViewModel
import com.vital.kokhanau.koinapp.service.DataService
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

val appModule = module {
    single {
        Retrofit.Builder()
            .baseUrl("https://vital.kokhanau.com")
            .addConverterFactory(MoshiConverterFactory.create())
            .build()
            .create(DataService::class.java)
    }

    single<DataRepository> {
        MockedDataRepositoryImpl()
    }

    single<GetDataUseCase> {
        GetDataUseCase(get())
    }

    viewModel {
        DataViewModel(get())
    }
}

package com.melaniadev.fitcare.data_layer.dagger

import com.melaniadev.fitcare.data_layer.repository_impl.FitCareRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import domain.repository_interfaces.FitCareRepository
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RepositoryModule {
    @Provides
    @Singleton
    fun provideFitCareRepository(): FitCareRepository {
        return FitCareRepositoryImpl()
    }
}
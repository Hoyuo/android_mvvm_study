package me.hoyuo.gallery.data.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import me.hoyuo.gallery.data.source.DataSource
import me.hoyuo.gallery.data.source.RepositoryImpl
import me.hoyuo.gallery.domain.repository.Repository

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Provides
    @Singleton
    fun provideRepository(
        @Remote remoteDataSource: DataSource,
//        @local localDataSource: DataSource,
    ): Repository = RepositoryImpl(remoteDataSource)
}

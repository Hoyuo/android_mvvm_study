package me.hoyuo.gallery.data.remote.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import me.hoyuo.gallery.data.di.Remote
import me.hoyuo.gallery.data.remote.api.PicsumApi
import me.hoyuo.gallery.data.remote.source.RemoteDataSource
import me.hoyuo.gallery.data.source.DataSource

@Module
@InstallIn(SingletonComponent::class)
object DataSourceModule {

    @Remote
    @Provides
    fun provideRemoteDataSource(
        picsumApi: PicsumApi,
    ): DataSource = RemoteDataSource(picsumApi)
}

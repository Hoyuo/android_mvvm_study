package me.hoyuo.gallery.data.remote.api

import io.reactivex.rxjava3.core.Single
import me.hoyuo.gallery.data.remote.model.ImageResponse
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface PicsumApi {
    @GET("/v2/list")
    fun getListImages(@Query("page") page: Int, @Query("limit") limit: Int): Single<List<ImageResponse>>

    @GET("/id/{id}/info")
    fun getImageDetails(@Path("id") id: String): Single<ImageResponse>
}

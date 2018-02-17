package com.auf.restfulapitestkotlin.api

import com.auf.restfulapitestkotlin.models.PhotoList
import retrofit2.Call
import retrofit2.http.GET

/**
 * Created by adam on 2/12/18.
 */
interface PhotoAPI {
    @GET("?key=8012964-ec1fcd5027f1c17622cbc8c07&q=nature&image_type=photo")
    fun getPhotos() : Call<PhotoList>
}
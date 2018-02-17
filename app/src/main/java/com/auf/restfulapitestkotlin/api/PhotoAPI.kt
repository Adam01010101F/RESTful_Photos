package com.auf.restfulapitestkotlin.api

import com.auf.restfulapitestkotlin.models.PhotoList
import retrofit2.Call
import retrofit2.http.GET

/**
 * Created by adam on 2/12/18.
 */
interface PhotoAPI {
    @GET("?key=&q=nature&image_type=photo")
    fun getPhotos() : Call<PhotoList>
}
package com.auf.restfulapitestkotlin.models

import java.io.Serializable
/**
 * Created by adam on 2/12/18.
 */
data class Photo (val id: String, val likes: Int,
                  val favorites: Int, val tags: String,
                  val previewURL : String, val webformatURL : String) : Serializable{

}
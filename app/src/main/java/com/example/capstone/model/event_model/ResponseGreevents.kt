package com.example.capstone.model.event_modelimport android.os.Parcelableimport kotlinx.parcelize.Parcelize@Parcelizedata class ResponseGreevents(    val msg: String,    val status: Int,    val data: ArrayList<Greevents>) : Parcelable@Parcelizedata class Greevents(    val id: Int,    val name: String,    val date: String,    val image_poster: String,    val image_surat: String,    val location: String,    val deskripsi: String,    val latitude: Double,    val longitude: Double,    val createdBy: String,    val author: String,    val contact_person: String,    val email: String,    val createdAt: String,    val updatedAt: String) : Parcelable
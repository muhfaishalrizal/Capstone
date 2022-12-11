package com.example.capstone.ui.upload_eventimport androidx.lifecycle.ViewModelimport com.example.capstone.data.AppRepositoryimport okhttp3.MultipartBodyimport okhttp3.RequestBodyclass UploadViewModel(private val appReposiroy: AppRepository) : ViewModel() {    fun uploadEvents(        name: RequestBody,        date: RequestBody,        image: MultipartBody.Part,        pdf_file: MultipartBody.Part,        location: RequestBody,        deskripsi: RequestBody,        lat: Double,        lon: Double,        author: RequestBody,        email: RequestBody,        contact: RequestBody    ) = appReposiroy.uploadEvent(        name,        date,        image,        pdf_file,        location,        deskripsi,        lat,        lon,        author,        email,        contact    )    fun uploadEventsWithoutLocation(        name: RequestBody,        date: RequestBody,        image: MultipartBody.Part,        pdf_file: MultipartBody.Part,        location: RequestBody,        deskripsi: RequestBody,        author: RequestBody,        email: RequestBody,        contact: RequestBody    ) = appReposiroy.uploadEventWithoutLocation(        name,        date,        image,        pdf_file,        location,        deskripsi,        author,        email,        contact    )}
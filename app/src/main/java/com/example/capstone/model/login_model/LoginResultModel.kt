package com.example.capstone.model.login_modelimport android.os.Parcelableimport kotlinx.parcelize.Parcelize@Parcelizedata class LoginResultModel(    var id: String? = null,    var name: String? = null,    var token: String? = null,) : Parcelable
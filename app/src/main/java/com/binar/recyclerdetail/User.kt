package com.binar.recyclerdetail

import android.widget.Button

data class User(
    val username: String ,
    val jeniskelamin: String ,
    val nomor: Int,
    val keterangan: Button? = null
)

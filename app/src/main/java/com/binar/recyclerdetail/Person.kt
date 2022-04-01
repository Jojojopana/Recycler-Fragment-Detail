package com.binar.recyclerdetail

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Person(
    val name: String = "",
    val number: String = "",
    val gender: String = ""
): Parcelable

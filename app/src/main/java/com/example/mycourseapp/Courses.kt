package com.example.mycourseapp

import androidx.annotation.DrawableRes

data class Courses(
    val rating : Float,
    val title: String,
    @DrawableRes val thumbnail: Int,
    val body : String
)

val course1 = Courses(
    4.5f,
     "the complete android 13 development course - Build 52 Apps",
     R.drawable.course1,
    "·Develop apps for the very latest version of Android 7 Nougat that also work on older Android devices running older versions of the Android operating system.\n"


)
val course2 = Courses(
    4.6f,
     "the complete android 13 development course - Build 52 Apps",
     R.drawable.course2,
    "·Develop apps for the very latest version of Android 7 Nougat that also work on older Android devices running older versions of the Android operating system.\n"

)
val course3 = Courses(
    4.7f,
     "the complete android 13 development course - Build 52 Apps",
     R.drawable.course3,
    "·Develop apps for the very latest version of Android 7 Nougat that also work on older Android devices running older versions of the Android operating system.\n"


)
val course4 = Courses(
    4.5f,
     "the complete android 13 development course - Build 52 Apps",
     R.drawable.course4,
    "·Develop apps for the very latest version of Android 7 Nougat that also work on older Android devices running older versions of the Android operating system.\n"


)
val course5 = Courses(
    4.1f,
     "the complete android 13 development course - Build 52 Apps",
     R.drawable.course5,
    "·Develop apps for the very latest version of Android 7 Nougat that also work on older Android devices running older versions of the Android operating system.\n"


)
val course6 = Courses(
    4.2f,
     "the complete android 13 development course - Build 52 Apps",
     R.drawable.course6,
    "·Develop apps for the very latest version of Android 7 Nougat that also work on older Android devices running older versions of the Android operating system.\n"


)
val course7 = Courses(
    4.4f,
     "the complete android 13 development course - Build 52 Apps",
     R.drawable.course7,
    "·Develop apps for the very latest version of Android 7 Nougat that also work on older Android devices running older versions of the Android operating system.\n"


)
val course8 = Courses(
    4.3f,
     "the complete android 12 development course ",
     R.drawable.course8,
    "·Develop apps for the very latest version of Android 7 Nougat that also work on older Android devices running older versions of the Android operating system.\n"

)

val allCourses = listOf(
    course1,
    course2,
    course3,
    course4,
    course5,
    course6,
    course7,
    course8
)
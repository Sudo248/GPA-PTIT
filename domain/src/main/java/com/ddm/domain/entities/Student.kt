package com.ddm.domain.entities

data class Student(
    var id: String,
    var name: String,
    var classId: String,
    var currentGpa: Float,
    var avatar: String? = null
)

package com.ddm.domain.entities

data class Semester(
    var id: String,
    var name: String,
    var subjectAmount: Byte,
    var gpaSemester: Float,
    var creditAmount: Byte,
    var subjects: List<Subject> = listOf()
)

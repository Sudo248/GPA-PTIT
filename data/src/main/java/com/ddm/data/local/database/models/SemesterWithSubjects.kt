package com.ddm.data.local.database.models

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation

data class SemesterWithSubjects(
    @Embedded val semesterId: String,
    @Relation(
        parentColumn = "semester_id",
        entityColumn = "subject_id",
        associateBy = Junction(SemesterSubjectJunction::class)
    )
    val subjects: List<SubjectDB>
)

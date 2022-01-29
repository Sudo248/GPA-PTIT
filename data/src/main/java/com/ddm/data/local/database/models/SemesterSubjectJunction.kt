package com.ddm.data.local.database.models

import androidx.room.ColumnInfo
import androidx.room.Entity

@Entity(tableName = "semester_subject_junction", primaryKeys = ["semester_id","course"])
data class SemesterSubjectJunction(
    @ColumnInfo(name = "semester_id")
    val semesterId: String,
    val course: Byte = 19,

    @ColumnInfo(name = "subject_id")
    val subjectId: String
)
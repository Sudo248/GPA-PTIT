package com.ddm.data.local.database.models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "semesters")
data class SemesterDB(
    @PrimaryKey(autoGenerate = false)
    @ColumnInfo(name = "semester_id")
    val id: String,
    @ColumnInfo(name = "semester_name")
    val name: String,
    @ColumnInfo(name = "subject_amount")
    val subjectAmount: Byte,
    @ColumnInfo(name = "gpa_semester")
    val gpaSemester: Float,
    @ColumnInfo(name = "credit_amount")
    val creditAmount: Byte,
)
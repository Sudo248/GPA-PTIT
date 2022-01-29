package com.ddm.data.local.database.models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "subjects")
data class SubjectDB(
    @PrimaryKey(autoGenerate = false)
    @ColumnInfo(name = "subject_id")
    val id: String,
    @ColumnInfo(name = "subject_name")
    val name: String,
    @ColumnInfo(name = "is_importance")
    val isImportance: Boolean, // true if subject calculated in gpa else false
    @ColumnInfo(name = "credit_number")
    val creditNumber: Byte,
    @ColumnInfo(name = "percent_cc")
    val percentCC: Byte,
    @ColumnInfo(name = "percent_kt")
    val percentKT: Byte,
    @ColumnInfo(name = "percent_tt")
    val percentTT: Byte,
    @ColumnInfo(name = "percent_bt")
    val percentBT: Byte,

    @ColumnInfo(name = "mark_cc")
    val markCC: Byte,
    @ColumnInfo(name = "mark_kt")
    val markKT: Byte,
    @ColumnInfo(name = "mark_tt")
    val markTT: Byte,
    @ColumnInfo(name = "mark_bt")
    val markBT: Byte,
    @ColumnInfo(name = "mark_exam")
    val markExam: Byte

)
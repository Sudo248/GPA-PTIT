package com.ddm.data.local.database.dao

import androidx.room.*
import com.ddm.data.local.database.models.SemesterDB
import com.ddm.data.local.database.models.SemesterSubjectJunction
import com.ddm.data.local.database.models.SubjectDB
import kotlinx.coroutines.flow.Flow

@Dao
interface GpaPTITDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertSemesterDB(semesterDB: SemesterDB)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertSubjectDB(subjectDB: SubjectDB)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertSemesterSubjectJunction(semesterSubjectJunction: SemesterSubjectJunction)

    @Update
    suspend fun updateSemesterDB(semesterDB: SemesterDB)

    @Update
    suspend fun updateSubjectDB(subjectDB: SubjectDB)

    @Update
    suspend fun updateSemesterSubjectJunction(semesterSubjectJunction: SemesterSubjectJunction)

    @Delete(entity = SemesterDB::class)
    suspend fun deleteSemesterDB(semesterId: String)

    @Delete(entity = SubjectDB::class)
    suspend fun deleteSubjectDB(subjectId: String)

    @Delete(entity = SemesterSubjectJunction::class)
    suspend fun deleteSemesterSubjectJunction(semesterId: String, course: Byte)

    @Query("SELECT * FROM semesters")
    suspend fun getAllSemesterDB(): Flow<List<SemesterDB>>

    @Query("SELECT * FROM subjects")
    suspend fun getAllSubjectDB(): Flow<List<SubjectDB>>

    @Query("SELECT * FROM semesters WHERE semester_id = :semesterId")
    suspend fun getSemesterDBById(semesterId: String): SemesterDB

    @Query("SELECT * FROM semesters WHERE semester_name = :semesterName")
    suspend fun getSemesterDBByName(semesterName: String): SemesterDB

    @Query("SELECT * FROM subjects WHERE subject_id = :subjectId")
    suspend fun getSubjectDBById(subjectId: String): SubjectDB

    @Query("SELECT * FROM subjects WHERE subject_name = :subjectName")
    suspend fun getSubjectDBByName(subjectName: String): SubjectDB

    @Query("SELECT * FROM subjects s INNER JOIN semester_subject_junction AS ssj ON s.subject_id = ssj.subject_id WHERE ssj.subject_id = :semesterId AND ssj.course = :course")
    suspend fun getSubjectDBsOfSemesterDB(semesterId: String, course: Byte): Flow<List<SubjectDB>>


}
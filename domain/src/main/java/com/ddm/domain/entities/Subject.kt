package com.ddm.domain.entities

import com.ddm.domain.util.toAlphabet
import com.ddm.domain.util.toBase4

data class Subject(
    var id: String,
    var name: String,
    var isImportance: Boolean, // true if subject calculated in gpa else false
    var creditNumber: Byte,
    var percents: ByteArray = byteArrayOf(),
    var marks: ByteArray = byteArrayOf(),
    val baseMarks: MutableMap<String, String> = mutableMapOf()
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Subject

        if (id != other.id) return false
        if (name != other.name) return false
        if (creditNumber != other.creditNumber) return false
        if (!percents.contentEquals(other.percents)) return false
        if (!marks.contentEquals(other.marks)) return false

        return true
    }

    override fun hashCode(): Int {
        var result = id.hashCode()
        result = 31 * result + name.hashCode()
        result = 31 * result + creditNumber
        result = 31 * result + percents.contentHashCode()
        result = 31 * result + marks.contentHashCode()
        return result
    }

    fun calculateGPA(): Float{
        var result = 0.0f
        for(i in 0..percents.size){
            result += percents[i] * marks[i]
        }
        result = if (result > 10) result * 0.01f else result
        baseMarks["10"] = "$result"
        baseMarks["4"] = "${result.toBase4()}"
        baseMarks["alphabet"] = result.toAlphabet()
        return result

    }

}

package com.ddm.domain.util

fun Float.toBase4(): Float{
    return when{
        this >= 9.0 -> 4.0f
        this >= 8.5 -> 3.7f
        this >= 8.0 -> 3.5f
        this >= 7.0 -> 3.0f
        this >= 6.5 -> 2.5f
        this >= 5.5 -> 2.0f
        this >= 5.0 -> 1.5f
        this >= 4.0 -> 1.0f
        else -> 0.0f
    }
}

fun Float.toAlphabet(): String{
    return when{
        this >= 9.0 -> "A+"
        this >= 8.5 -> "A"
        this >= 8.0 -> "B+"
        this >= 7.0 -> "B"
        this >= 6.5 -> "C+"
        this >= 5.5 -> "C"
        this >= 5.0 -> "D+"
        this >= 4.0 -> "D"
        else -> "F"
    }
}
package com.example.codingguides.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.superhero.R


data class CodeItem(
   @StringRes val nameRes : Int,
    @DrawableRes val imageRes : Int,
   @StringRes val descRes : Int
)

object ListOfCodeItems{
    val CodeItem = listOf(
        CodeItem(R.string.name1,R.drawable.day1,R.string.desc1),
        CodeItem(R.string.name2,R.drawable.day2,R.string.desc2),
        CodeItem(R.string.name3,R.drawable.day3,R.string.desc3),
        CodeItem(R.string.name4,R.drawable.day4,R.string.desc4),
        CodeItem(R.string.name5,R.drawable.day5,R.string.desc5),
        CodeItem(R.string.name6,R.drawable.day6,R.string.desc6),
        CodeItem(R.string.name7,R.drawable.day7,R.string.desc7),
        CodeItem(R.string.name8,R.drawable.day8,R.string.desc8),
        CodeItem(R.string.name9,R.drawable.day9,R.string.desc9),
        CodeItem(R.string.name10,R.drawable.day10,R.string.desc10),
        CodeItem(R.string.name11,R.drawable.day11,R.string.desc11),
        CodeItem(R.string.name12,R.drawable.day6,R.string.desc12),
        CodeItem(R.string.name13,R.drawable.day2,R.string.desc13),
        CodeItem(R.string.name14,R.drawable.day5,R.string.desc14),
        CodeItem(R.string.name15,R.drawable.day1,R.string.desc15)

    )
}
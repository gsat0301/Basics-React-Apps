package com.gabrieldev.androidmaster.TODOapp

import android.content.res.ColorStateList
import android.graphics.Paint
import android.view.View
import android.widget.CheckBox
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.gabrieldev.androidmaster.R

class TaskViewHolder(view: View): RecyclerView.ViewHolder(view) {
    private val tvTask:TextView = view.findViewById(R.id.tvTask)
    private val cbTask: CheckBox = view.findViewById(R.id.cbTask)

    fun render(task: Task) {

            if (task.isSelected){
                tvTask.paintFlags = tvTask.paintFlags or Paint.STRIKE_THRU_TEXT_FLAG
            }
        else{
                tvTask.paintFlags = tvTask.paintFlags and Paint.STRIKE_THRU_TEXT_FLAG.inv()

            }
        cbTask.isChecked = tvTask.isSelected

        val color = when(task.category){
            TaskCategories.Business -> R.color.business_category
            TaskCategories.Other -> R.color.other_category
            TaskCategories.Personal -> R.color.personal_category
        }

        cbTask.buttonTintList = ColorStateList.valueOf(ContextCompat.getColor
            (cbTask.context, color))

        tvTask.text = task.name

    }
}





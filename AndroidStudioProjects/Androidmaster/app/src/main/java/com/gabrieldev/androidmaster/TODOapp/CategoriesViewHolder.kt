package com.gabrieldev.androidmaster.TODOapp

import android.view.View
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.gabrieldev.androidmaster.R

class CategoriesViewHolder(view:View): RecyclerView.ViewHolder(view) {

    private val tvCategoryName:TextView = view.findViewById(R.id.tvCategoryName)
    private val divider:View = view.findViewById(R.id.divider)
    private val viewContainer : CardView =view.findViewById(R.id.viewContainer)

    fun render(taskCategories: TaskCategories, onItemSelected: (Int) -> Unit){
      val color =   if (taskCategories.isSelected){
            R.color.background_card
        }else{
            R.color.background_disabled
        }

        viewContainer.setCardBackgroundColor(ContextCompat.getColor(viewContainer.context, color))
        itemView.setOnClickListener{ onItemSelected(layoutPosition)}



        when(taskCategories){
            TaskCategories.Business ->{
                tvCategoryName.text = "Negocios"
            divider.setBackgroundColor(ContextCompat.getColor(divider.context, R.color.business_category))
            }

            TaskCategories.Other -> {
                tvCategoryName.text = "Otros"
                divider.setBackgroundColor(ContextCompat.getColor(divider.context, R.color.other_category))
            }

            TaskCategories.Personal -> {
                tvCategoryName.text = "Personal"
                divider.setBackgroundColor(ContextCompat.getColor(divider.context, R.color.personal_category))
            }
        }

    }
}
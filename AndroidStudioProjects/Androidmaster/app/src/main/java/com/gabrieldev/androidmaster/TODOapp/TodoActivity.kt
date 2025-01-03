package com.gabrieldev.androidmaster.TODOapp

import android.annotation.SuppressLint
import android.app.Dialog
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.gabrieldev.androidmaster.R
import com.gabrieldev.androidmaster.TODOapp.TaskCategories.*
import com.google.android.material.floatingactionbutton.FloatingActionButton

class TodoActivity : AppCompatActivity() {
    private val categories = listOf(
        Other,
        Business,
        Personal
    )

  private val task = mutableListOf<Task>(
        Task("PruebaBusiness", Business),
        Task("PruebaOther", Other),
        Task("PruebaPersonal", Personal)

    )

    private lateinit var rvCategories: RecyclerView
    private lateinit var categoriesAdapter: CategoriesAdapter

    private lateinit var  rvTasks: RecyclerView
    private lateinit var taskAdapter: TaskAdapter

    private lateinit var fabAddTask:FloatingActionButton

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_todo)
        initComponents()
        initUI()
        initListeners()


    }

   private fun initComponents(){
        rvCategories = findViewById(R.id.rvCategories)
       rvTasks= findViewById(R.id.rvTasks)
       fabAddTask = findViewById(R.id.fabAddTask)


            }

    private fun initListeners(){
        fabAddTask.setOnClickListener{showDialog()}
    }

    private fun showDialog(){
        val dialog = Dialog(this)
        dialog.setContentView(R.layout.dialog_task)

        val btnAddTask: Button = dialog.findViewById(R.id.btnAddTask)
        val etTask : EditText = dialog.findViewById(R.id.etTask)
        val rgCategories : RadioGroup = dialog.findViewById(R.id.rgCategories)

        btnAddTask.setOnClickListener{
            val currentTask = etTask.text.toString()
            if (currentTask.isNotEmpty()){
                val selectedId = rgCategories.checkedRadioButtonId
                val selectedRadioButton :Button = rgCategories.findViewById(selectedId)
                val currentCategory:TaskCategories = when(selectedRadioButton.text){
                    getString(R.string.todo_dialog_rbBusiness) -> Business
                    getString(R.string.todo_dialog_rbPersonal) -> Personal
                    else -> Other
                }
                task.add(Task(currentTask , currentCategory))
                updateTask()
                dialog.hide()
            }
        }


        dialog.show()

    }

    private fun updateTask(){
        val selectedCategories: List<TaskCategories> = categories.filter { it.isSelected }
        val newTasks = task.filter { selectedCategories.contains(it.category) }
        taskAdapter.task = newTasks
        taskAdapter.notifyDataSetChanged()
    }

    private fun initUI(){
        categoriesAdapter = CategoriesAdapter(categories){updateCategories(it)}
        rvCategories.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        rvCategories.adapter = categoriesAdapter

        taskAdapter = TaskAdapter(task) { onTaskSelected(it) }
        rvTasks.layoutManager = LinearLayoutManager(this)
        rvTasks.adapter = taskAdapter
    }

    private fun updateCategories(position: Int){
        categories[position].isSelected = !categories[position].isSelected
        categoriesAdapter.notifyItemChanged(position)
        updateTask()

    }
   @SuppressLint("SuspiciousIndentation")
   private fun onTaskSelected(position:Int){
    task[position].isSelected = !task[position].isSelected
       updateTask()
   }

}
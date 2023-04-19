package com.example.nariveamdroid2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.nariveamdroid2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity()
{
   private lateinit var binding: ActivityMainBinding
   private lateinit var taskViewModel: TaskViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        taskViewModel = ViewModelProvider(this).get(TaskViewModel::class.java)

        //give + button click listener event
        binding.newTaskButton.setOnClickListener {
            // on click create a view newTaskSheet
            NewTaskSheet(null).show(supportFragmentManager, "newTaskTag")
        }
        setRecyclerView()
    }
    private fun setRecyclerView() {
        taskViewModel.taskItems.observe(this){
            binding.todoListRecyclerView.apply {
                //set layout manager and adapter
                layoutManager = LinearLayoutManager(applicationContext)
                adapter = TaskItemAdapter(it)
            }
        }
    }
}
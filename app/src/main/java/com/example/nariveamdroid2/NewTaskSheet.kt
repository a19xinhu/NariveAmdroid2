package com.example.nariveamdroid2

import android.os.Bundle
import android.text.Editable
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.nariveamdroid2.databinding.ActivityMainBinding
import com.example.nariveamdroid2.databinding.FragmentNewTaskSheetBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment


class NewTaskSheet(var taskItem: TaskItem?) : BottomSheetDialogFragment()
{
    private lateinit var binding: FragmentNewTaskSheetBinding
    private lateinit var taskViewModel: TaskViewModel
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val activity = requireActivity()
        //if taskItem is not null
        if (taskItem != null)
        {
            binding.taskTitle.text = "Edit Task"
        }
        else
        {
            binding.taskTitle.text = "New Task"
        }
        taskViewModel = ViewModelProvider(activity).get(TaskViewModel::class.java)
        binding.saveButton.setOnClickListener {
            saveAction()
        }
        binding.saveButton50.setOnClickListener {
            saveAction50()
        }

    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View{
        binding = FragmentNewTaskSheetBinding.inflate(inflater,container,false)
        return binding.root
    }

    private fun saveAction()
    {
        val newTask = TaskItem()
        taskViewModel.addTaskItem(newTask)
        dismiss()
    }

    private fun saveAction50()
    {
       for (i in 0.. 49){
           val newTask = TaskItem()
           taskViewModel.addTaskItem(newTask)
       }
        dismiss()
    }
}
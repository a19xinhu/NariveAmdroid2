package com.example.nariveamdroid2

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.nariveamdroid2.databinding.TaskItemCellBinding

class TaskItemAdapter(
    private val taskItem: List<TaskItem>
):RecyclerView.Adapter<TaskItemViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaskItemViewHolder {
        val from = LayoutInflater.from(parent.context)
        val binding = TaskItemCellBinding.inflate(from,parent,false)
        return TaskItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: TaskItemViewHolder, position: Int) {
        /*holder.bindTaskItem(taskItem[position])*/
    }

    override fun getItemCount(): Int = taskItem.size

}
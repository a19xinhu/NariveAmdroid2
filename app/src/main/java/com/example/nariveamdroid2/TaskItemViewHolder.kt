package com.example.nariveamdroid2

import android.content.Context
import androidx.recyclerview.widget.RecyclerView
import com.example.nariveamdroid2.databinding.TaskItemCellBinding

class TaskItemViewHolder(
    private val context: Context,
    private val binding: TaskItemCellBinding
): RecyclerView.ViewHolder(binding.root) {
    fun bindTaskItem(taskItem: TaskItem)
    {
        binding.name.text = taskItem.name
    }
}
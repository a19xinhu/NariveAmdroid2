package com.example.nariveamdroid2

import java.time.LocalDate
import java.time.LocalTime
import java.util.*

class TaskItem (
  //  var image: String,
    var name: String?,
    var desc: String,
    var dueTime: LocalTime?,
    var completedDate: LocalDate?,
    var id: UUID = UUID.randomUUID()
){
}
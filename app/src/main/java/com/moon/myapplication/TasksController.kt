package com.moon.myapplication

class TasksController {

    private var currentTaskIndex = -1
    private val tasks = mutableListOf<ITask>()

    fun addTask(task: ITask) {
        tasks.add(task)
    }

    fun start() {
        executeNextTask()
    }

    fun executeNextTask(input: ITaskInput? = null) {
        currentTaskIndex++
        if (currentTaskIndex < tasks.size) {
            tasks[currentTaskIndex].execute(input)
        } else {
        }
    }

    fun destroy() {
        currentTaskIndex = -1
        tasks.clear()
    }
}
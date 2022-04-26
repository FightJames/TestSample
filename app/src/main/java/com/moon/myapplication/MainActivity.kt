package com.moon.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    val tasksController = TasksController()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        runTask()
    }

    val callback = object:ITaskCallback{
        override fun onStart(task: ITask) {
        }

        override fun onFinish(task: ITask, output: ITaskOutput?) {
            tasksController.executeNextTask(output)
        }

        override fun onFailed(task: ITask, error: Exception) {
        }

    }

    fun runTask() {
        tasksController.addTask(ATask(callback))
        tasksController.addTask(BTask(callback))
        tasksController.start()
    }
}
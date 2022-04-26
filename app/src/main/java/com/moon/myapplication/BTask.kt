package com.moon.myapplication

import android.util.Log

class BTask(private val callback: ITaskCallback) : ITask {
    override fun name(): String = "Atask"

    override fun execute(input: ITaskInput?) {
        callback.onStart(this)
        val aRes = input as ATask.Output
        Log.d("Aout", "$aRes")
        callback.onFinish(this, null)
    }

    override fun cancel() {
    }

}
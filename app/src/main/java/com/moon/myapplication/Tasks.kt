package com.moon.myapplication

interface ITaskInput {

}

interface ITaskOutput : ITaskInput {

}

interface ITask {

    fun name(): String

    fun execute(input: ITaskInput?)

    fun cancel()
}

interface ITaskCallback {

    fun onStart(task: ITask)

    fun onFinish(task: ITask, output: ITaskOutput?)

    fun onFailed(task: ITask, error: Exception)

}
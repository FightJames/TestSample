package com.moon.myapplication

class ATask(private val callback: ITaskCallback ) : ITask {

    override fun name(): String = "Atask"

    override fun execute(input: ITaskInput?) {
        callback.onStart(this)
        callback.onFinish(this, Output())
    }

    override fun cancel() {
    }

    class Output : ITaskOutput {
        val aTaskRes: String = "hi"
        override fun toString(): String {
            return "Output(ATask)"
        }
    }

}
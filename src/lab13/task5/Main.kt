package lab13.task5

import javax.swing.JButton
import javax.swing.JFrame

const val BUTTON_COUNT = 5


class MyFrame
    () : JFrame() {
    init {
        title = "Task2"
        layout = null
        isVisible = true

        val myButtons = Array(BUTTON_COUNT) { i -> JButton("Button$i") }

        for ((i, butt) in myButtons.withIndex()) {
            butt.setBounds(10 + i * 200, 100 + i * 30, 180, 80)
            add(butt)
        }

        setSize(1100, 400)
    }
}

fun main() {
    val frame = MyFrame()
}

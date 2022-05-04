package lab13.task2

import java.awt.Dimension
import java.awt.FlowLayout
import javax.swing.JButton
import javax.swing.JFrame
import javax.swing.JPanel

const val BUTTON_COUNT = 10


class MyFrame
    () : JFrame() {
    init {
        title = "Task2"
        layout = FlowLayout()
        isVisible = true

        val myPanel = JPanel()
        add(myPanel)

        val myButtons = Array(BUTTON_COUNT) { i -> JButton("Button$i") }

        for (butt in myButtons) {
            butt.preferredSize = Dimension(100, 100)
            myPanel.add(butt)
        }

        setSize(1100, 200)
    }
}

fun main() {
    val frame = MyFrame()
}

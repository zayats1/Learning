package lab13.task4

import java.awt.Dimension
import java.awt.GridLayout
import javax.swing.JButton
import javax.swing.JFrame

const val BUTTON_COUNT = 20

const val ROWS = 4
const val COLS = 5

const val GAP = 4

class MyFrame
    () : JFrame() {
    init {
        title = "Task4"
        layout = GridLayout(ROWS, COLS, GAP, GAP)
        isVisible = true

        val myButtons = Array(BUTTON_COUNT) { i -> JButton("Button$i") }

        for (butt in myButtons) {
            butt.preferredSize = Dimension(100, 100)
            add(butt)
        }

        size = Dimension(1000, 600)
    }
}

fun main() {
    val frame = MyFrame()
}

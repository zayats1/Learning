package lab13.task2

import java.awt.BorderLayout
import java.awt.BorderLayout.*
import java.awt.Dimension
import javax.swing.JButton
import javax.swing.JFrame


class MyFrame
    () : JFrame() {
    init {
        title = "Task2"
        layout = BorderLayout()
        isVisible = true

        val myButtons = Array<JButton>(5) { i -> JButton("Button$i") }
        for (butt in myButtons) {
            butt.preferredSize = Dimension(100, 100)
        }

        add(myButtons[0], NORTH)
        add(myButtons[1], WEST)
        add(myButtons[2], CENTER)
        add(myButtons[3], EAST)
        add(myButtons[4], SOUTH)


        setSize(500, 400)
    }
}

fun main() {
    val frame = MyFrame()
}

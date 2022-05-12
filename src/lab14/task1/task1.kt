package lab14.task1

import java.awt.Color
import java.awt.Color.*
import java.awt.Cursor
import java.awt.GridBagLayout
import javax.swing.JButton
import javax.swing.JFrame
import javax.swing.JLabel


const val BUTTON_COUNT = 5
val Colors = listOf<Color>(blue, yellow, gray, green, red)

class GUI() : JFrame() {
    private val buttons: Array<JButton> = Array(BUTTON_COUNT) { i -> JButton("Button$i") }

    init {
        defaultCloseOperation = EXIT_ON_CLOSE
        setSize(800, 400)
        setLocationRelativeTo(null)
        layout = GridBagLayout()
        title = "Task1"

        buttons.zip(Colors).forEach { (button, backgroundColor) ->
            button.background = backgroundColor
            button.foreground = black
            add(button)
        }

        buttons[4].cursor = Cursor(Cursor.MOVE_CURSOR)

        val label = JLabel()
        label.text = "With love from ${buttons[4].text}"
        add(label)
        isVisible = true
    }
}

fun main() {
    val myGUI = GUI()
}
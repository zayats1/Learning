package lab13.task1

import javax.swing.JButton
import javax.swing.JFrame


const val HEIGHT = 300
const val WIDTH = 400

fun main() {
    val programFrame = JFrame("Task1")
    programFrame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
    programFrame.layout = null      // I don`t use any layout managers in this program
    programFrame.isVisible = true

    val myButton = JButton("Butt")
    myButton.setBounds(100, 100, 100, 40);
    programFrame.setSize(WIDTH, HEIGHT)

    programFrame.add(myButton)
}
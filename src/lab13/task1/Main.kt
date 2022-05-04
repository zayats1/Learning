package lab13.task1

import javax.swing.JButton
import javax.swing.JFrame


const val HEIGHT = 380
const val WIDTH = 640

fun main() {
    val programFrame = JFrame("MyProgram")
    programFrame.setSize(HEIGHT, WIDTH)
    programFrame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
    programFrame.layout = null      // I don`t use any layout managers in this program
    programFrame.isVisible = true

    val myButton = JButton("Butt")
    myButton.setBounds(130, 100, 100, 40);

    programFrame.add(myButton)
}
package lab14.task2

import java.awt.Color
import java.awt.Font
import java.awt.GridBagLayout
import javax.swing.JFrame
import javax.swing.JLabel
import javax.swing.JPasswordField
import javax.swing.JTextField

class GUI() : JFrame() {
    init {
        defaultCloseOperation = EXIT_ON_CLOSE
        setSize(500, 400)
        setLocationRelativeTo(null)
        layout = GridBagLayout()
        title = "Task2"


        val myTextField = JTextField(10)
        myTextField.text = "Text"

        println(myTextField.text)

        myTextField.isEditable = false
        myTextField.background = Color.ORANGE
        add(myTextField)

        val myPassword = JPasswordField(10)
        myPassword.text = "password"
        println(myPassword.text)

        add(myPassword)


        val label = JLabel("BOLD FONT")
        val myFont = Font("Hack", Font.BOLD, 25)
        label.foreground = Color.RED
        label.font = myFont
        add(label)

        isVisible = true
    }
}


fun main() {
    val gui = GUI()
}

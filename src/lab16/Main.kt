package lab16

import java.awt.FlowLayout
import java.awt.GridLayout
import javax.swing.*
import javax.swing.BoxLayout.Y_AXIS

class Calculator : JFrame() {
    private val buttonsPanel = JPanel()
    private val addButton = JButton("+")
    private val subtractButton = JButton("-")
    private val multiplyButton = JButton("*")
    private val divideButton = JButton("/")

    private val input1 = JTextField()
    private val input2 = JTextField()
    private val output = JTextField()

    private val zero = (0).toString()

    init {
        defaultCloseOperation = EXIT_ON_CLOSE
        setSize(300, 175)
        layout = GridLayout(2, 1)
        isResizable = false
        title = "DemoCalculator"

        val box = JPanel()
        box.layout = BoxLayout(box, Y_AXIS)
        with(box) {
            add(input1)
            add(input2)
            add(output)
        }
        add(box)

        buttonsPanel.layout = FlowLayout()
        with(buttonsPanel) {
            add(addButton)
            add(subtractButton)
            add(multiplyButton)
            add(divideButton)
        }
        add(buttonsPanel)
    }

    private fun parseNumbersFromInputs(): Pair<Double, Double> {
        var number1 = 0.0
        var number2 = 0.0
        try {
            number1 = input1.text.toDouble()
            number2 = input2.text.toDouble()
        } catch (e: NumberFormatException) {
            input1.text = zero
            input2.text = zero
        }
        return Pair(number1, number2)
    }


    public fun calculate() {
        input1.text = zero
        input2.text = zero
        output.text = zero

        addButton.addActionListener {
            run {
                val (number1, number2) = parseNumbersFromInputs()
                output.text = "${number1 + number2}"
            }
        }

        subtractButton.addActionListener {
            run {
                val (subtracted, subtrahend) = parseNumbersFromInputs()
                output.text = "${subtracted - subtrahend}"
            }
        }
        multiplyButton.addActionListener {
            run {
                val (number1, number2) = parseNumbersFromInputs()
                output.text = "${number1 * number2}"
            }
        }
        divideButton.addActionListener {
            run {
                val (divided, divisor) = parseNumbersFromInputs()

                if (divisor.equals(0.0)) {
                    output.text = "Dividing by zero is not allowed"
                } else {
                    output.text = "${divided / divisor}"
                }
            }
        }
    }
}


fun main() {
    val calculator = Calculator()
    calculator.calculate()
    calculator.isVisible = true
}
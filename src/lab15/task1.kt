package lab15

import java.awt.Color
import java.awt.GridLayout
import javax.swing.*

class ProgressBarDemo : JFrame() {

    private val progressBarLabel = JLabel("встановлення")
    private val text = JTextField(5)

    private val panel = JPanel()

    private val panel2 = JPanel()


    private val bar = JProgressBar()
    private val slider = JSlider()

    init {
        title = "ProgressBarDemo"
        defaultCloseOperation = EXIT_ON_CLOSE
        setSize(600, 200)
        setLocationRelativeTo(null)
        layout = GridLayout(2, 2, 4, 4)
        setSize(601, 201)
        addPanels()
    }

    fun run() {
        increaseProgressBar(progressBarLabel)
        decreaseProgressBar(progressBarLabel)
    }

    private fun increaseProgressBar(label: JLabel) {
        label.text = "installing"
        for (i in bar.minimum..bar.maximum) {
            Thread.sleep(100)
            bar.value = i
            //заповнюємо значення компонента повзунок
            slider.value = i / 2
            //передаємо значення повзунка в текстове поле
            text.text = slider.value.toString()
        }
    }

    private fun decreaseProgressBar(label: JLabel) {
        label.text = "rollback installing"

        for (i in bar.maximum downTo bar.minimum) {
            Thread.sleep(100)
            bar.value = i
            slider.value = i / 2
            text.text = slider.value.toString()
        }
        label.text = ""
    }

    private fun addPanels() {
        panel.background = Color.orange
        add(panel)

        panel2.background = Color.green
        add(panel2)

        bar.minimum = 0
        bar.maximum = 100

        bar.isStringPainted = true

        bar.value = 0

        slider.minimum = 0
        slider.maximum = 50

        slider.majorTickSpacing = 10
        slider.minorTickSpacing = 1

        slider.paintTicks = true

        slider.paintLabels = true

        panel2.add(slider)
        panel2.add(text)
        panel.add(bar)
        panel.add(progressBarLabel)
    }
}

fun main() {
    val demo = ProgressBarDemo()
    demo.isVisible = true
    while (true) {
        demo.run()
    }
}


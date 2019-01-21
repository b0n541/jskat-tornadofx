package org.jskat.gui

import javafx.collections.FXCollections
import tornadofx.Controller

class MainController: Controller() {
    val values = FXCollections.observableArrayList("Alpha","Beta","Gamma","Delta")
    fun writeToDb(inputValue: String) {
        println("Writing $inputValue to database!")
        values.add(inputValue)
    }
}
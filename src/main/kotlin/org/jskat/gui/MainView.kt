package org.jskat.gui

import javafx.beans.property.SimpleStringProperty
import javafx.geometry.Pos
import javafx.scene.control.Control
import javafx.scene.layout.Priority
import javafx.stage.StageStyle
import tornadofx.*
import java.time.LocalDate
import javax.swing.SpringLayout

class MainView : View() {

    val controller: MainController by inject()
    val input = SimpleStringProperty()

    override val root = borderpane {
        top {
            menubar {
                menu("File") {
                    menu("Connect") {
                        item("International Skat Server (ISS)")
                    }
                    separator()
                    item("Save")
                    separator()
                    item("Quit")
                }
                menu("Edit") {
                    item("Copy")
                    item("Paste")
                }
            }
        }
        center {
            vbox(10) {
                alignment = Pos.CENTER
                maxWidth = Control.USE_PREF_SIZE

                label("Welcome to JSkat") {
                    style {
                        fontSize = 24.px
                    }
                }

                button("Connect to the International Skat Server") {
                    maxWidth = Double.MAX_VALUE
                    style {
                        fontSize = 18.px
                    }
                    action {
                        find<HandPanelFragment>().openModal(stageStyle = StageStyle.UTILITY)
                    }
                }

                button("Play on Local Table") {
                    maxWidth = Double.MAX_VALUE
                    style {
                        fontSize = 18.px
                    }
                    action {
                        openInternalWindow<HandPanelFragment>()
                    }
                }

                button("Settings") {
                    maxWidth = Double.MAX_VALUE
                    style {
                        fontSize = 18.px
                    }
                    action {
                        openInternalWindow<HandPanelFragment>()
                    }
                }

                button("Quit") {
                    maxWidth = Double.MAX_VALUE
                    style {
                        fontSize = 18.px
                    }
                    action {
                        openInternalWindow<HandPanelFragment>()
                    }
                }
            }
        }
        bottom {
            padding = tornadofx.insets(3, 3, 3, 3)

            hbox(5) {
                label("Status") {
                    alignment = Pos.CENTER_LEFT
                }
                pane() {
                    hgrow = Priority.ALWAYS
                }
                label("System info") {
                    alignment = Pos.CENTER_RIGHT
                }
            }
        }
    }
}

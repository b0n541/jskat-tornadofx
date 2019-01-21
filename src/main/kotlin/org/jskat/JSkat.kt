package org.jskat

import org.jskat.gui.MainView
import tornadofx.App
import tornadofx.launch

class JSkat: App(MainView::class) {
    val greeting: String
        get() {
            return "Hello world."
        }
}

fun main(args: Array<String>) {
   launch<JSkat>(args)
}

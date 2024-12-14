package com.binitagoswami.project

import io.kvision.*
import io.kvision.core.*
import io.kvision.form.text.text
import io.kvision.html.*
import io.kvision.material.ExperimentalMaterialApi
import io.kvision.material.button.ButtonType
import io.kvision.material.button.MdButton
import io.kvision.material.button.MdElevatedButton
import io.kvision.material.button.MdFilledTonalButton
import io.kvision.navigo.Navigo
import io.kvision.panel.hPanel
import io.kvision.panel.root
import io.kvision.panel.vPanel
import io.kvision.routing.Routing
import io.kvision.utils.perc
import io.kvision.utils.px
import io.kvision.utils.vh

class App : Application() {
    @OptIn(ExperimentalMaterialApi::class)
    override fun start() {
        val routing = Routing.init()
        routing
            .on("/", {
                console.log("root Page")
            })
            .on("/foo", { console.log("Foo Page") })
            .resolve()
        root(
            id = "app"
        ) {
//            background = Background(
//                color = Color.name(Col.GREEN)
//            )
            border = Border(
                width = 1.px,
                style = BorderStyle.DASHED,
                color = Color.name(Col.BLACK)
            )
            vPanel(
                justify = JustifyContent.START,
                alignItems = AlignItems.CENTER
            ) {
                borderRight = Border(
                    width = 1.px,
                    style = BorderStyle.DASHED,
                    color = Color.name(Col.BLACK)
                )
                height = 100.vh
                width = 100.perc
                div("Binita Goswami") {
                    marginTop = 10.px
                    marginBottom = 10.px
                    fontSize = 50.px
                }
                hPanel(justify = JustifyContent.START) {
                    width = 100.perc
                    height = 100.vh
                    borderTop = Border(
                        width = 1.px,
                        style = BorderStyle.DASHED,
                        color = Color.name(Col.BLACK)
                    )
                    borderBottom = Border(
                        width = 1.px,
                        style = BorderStyle.DASHED,
                        color = Color.name(Col.BLACK)
                    )
                    vPanel {
                        width = 20.perc
                        height = 100.perc
                        spacing = 2
                        justifyContent = JustifyContent.CENTER
                        alignItems = AlignItems.CENTER
//                        marginLeft = 10.px
//                        link("Butterflying", "#")
//                        link("Photography", "#")
//                        link("My Recipes", "#")
//                        link("Music", "#")
                        button("Butterflies", style = ButtonStyle.PRIMARY) {
                            width = 90.perc
                            marginLeft = 2.px
                            marginRight = 2.px
                            onClick {
                                routing.navigate("/foo")
                            }
                        }
                        button("Cooking", style = ButtonStyle.PRIMARY) {
                            width = 90.perc
                            marginLeft = 2.px
                            marginRight = 2.px
                            onClick {
                                println("Default button clicked")
                            }
                        }
                        button("Music", style = ButtonStyle.PRIMARY) {
                            width = 90.perc
                            marginLeft = 2.px
                            marginRight = 2.px
                            onClick {
                                println("Default button clicked")
                            }
                        }
                        button("Photography", style = ButtonStyle.PRIMARY) {
                            width = 90.perc
                            marginLeft = 2.px
                            marginRight = 2.px
                            onClick {
                                println("Default button clicked")
                            }
                        }
                        borderRight = Border(
                            width = 1.px,
                            style = BorderStyle.DASHED,
                            color = Color.name(Col.BLACK)
                        )
                    }

                    div("Content") {
                        width = 100.perc
                        align = Align.CENTER
                    }
                }
            }
            footer("Made by me with ✨ | 2024") {
                align = Align.CENTER
            }
        }
    }
}


fun main() {
    startApplication(
        ::App,
        module.hot,
        MaterialModule,
        BootstrapCssModule,
        FontAwesomeModule,
        CoreModule
    )
}

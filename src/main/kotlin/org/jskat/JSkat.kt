package org.jskat

import org.jskat.events.CardsDealtEvent
import org.jskat.events.PlayerBidEvent
import org.jskat.game.*
import org.jskat.gui.MainView
import tornadofx.App

class JSkat : App(MainView::class) {
}

fun main(args: Array<String>) {

//    launch<JSkat>(args)

    val game = SkatGame(SkatGameState(
            GamePhase.GAME_START,
            mapOf(Pair(PlayerPosition.FORE_HAND, Player("Fore Hand")),
                    Pair(PlayerPosition.MIDDLE_HAND, Player("Middle Hand")),
                    Pair(PlayerPosition.REAR_HAND, Player("Rear Hand")))))

    game.onCardsDealt(
            CardsDealtEvent(
                    playerCards = mapOf(
                            Pair(PlayerPosition.FORE_HAND, Hand(setOf(Card.CJ, Card.SJ, Card.HJ, Card.DJ, Card.CA, Card.CT, Card.CK, Card.CQ))),
                            Pair(PlayerPosition.MIDDLE_HAND, Hand(setOf(Card.HJ, Card.DJ))),
                            Pair(PlayerPosition.REAR_HAND, Hand(setOf(Card.CJ, Card.DJ)))),
                    skat = Hand(setOf(Card.D8, Card.D7))))

    game.onPlayerBid(PlayerBidEvent(PlayerPosition.MIDDLE_HAND, 18))
    game.onPlayerBid(PlayerBidEvent(PlayerPosition.FORE_HAND, 18))
    game.onPlayerBid(PlayerBidEvent(PlayerPosition.REAR_HAND, 20))
    game.onPlayerBid(PlayerBidEvent(PlayerPosition.FORE_HAND, 20))

    for (gameState in game.history) {
        println(gameState)
    }
}

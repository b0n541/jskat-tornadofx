package org.jskat.events

import org.jskat.game.Hand
import org.jskat.game.PlayerPosition

data class CardsDealtEvent (val playerCards: Map<PlayerPosition, Hand>, val skat: Hand)
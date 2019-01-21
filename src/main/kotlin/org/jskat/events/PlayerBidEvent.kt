package org.jskat.events

import org.jskat.game.PlayerPosition

data class PlayerBidEvent(val player: PlayerPosition, val bid: Int)
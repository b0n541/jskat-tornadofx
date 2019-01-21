package org.jskat.game

import org.jskat.events.CardsDealtEvent
import org.jskat.events.PlayerBidEvent

class SkatGame(var state: SkatGameState, val history: MutableList<SkatGameState> = mutableListOf(state)) {

    fun onCardsDealt(event: CardsDealtEvent) {
        state = state.copy(
                phase = GamePhase.DEAL,
                dealtCards = event.playerCards,
                dealtSkat = event.skat)
        history.add(state)
    }

    fun onPlayerBid(event: PlayerBidEvent) {
        state = state.copy(
                phase = GamePhase.BID,
                bids = state.bids + Pair(event.player, event.bid),
                maxBids = state.maxBids + Pair(event.player, event.bid))
        history.add(state)
    }
}
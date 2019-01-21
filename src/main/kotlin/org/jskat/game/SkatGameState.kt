package org.jskat.game

data class SkatGameState(
        val phase: GamePhase,
        val player: Map<PlayerPosition, Player>,
        val dealtCards: Map<PlayerPosition, Hand> = emptyMap(),
        val dealtSkat: Hand = Hand(),
        val bids: List<Pair<PlayerPosition, Int>> = emptyList(),
        val maxBids: Map<PlayerPosition, Int> = emptyMap(),
        val gameType: GameType = GameType.UNKNOWN
) {
}
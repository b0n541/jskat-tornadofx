package org.jskat.game

enum class Card(val suit: Suit, val rank: Rank) {
    CJ(Suit.CLUBS, Rank.JACK),
    SJ(Suit.SPADES, Rank.JACK),
    HJ(Suit.HEARTS, Rank.JACK),
    DJ(Suit.DIAMONDS, Rank.JACK),
    CA(Suit.CLUBS, Rank.ACE),
    CT(Suit.CLUBS, Rank.TEN),
    CK(Suit.CLUBS, Rank.KING),
    CQ(Suit.CLUBS, Rank.QUEEN),
    C9(Suit.CLUBS, Rank.NINE),
    C8(Suit.CLUBS, Rank.EIGHT),
    C7(Suit.CLUBS, Rank.SEVEN),
    SA(Suit.SPADES, Rank.ACE),
    ST(Suit.SPADES, Rank.TEN),
    SK(Suit.SPADES, Rank.KING),
    SQ(Suit.SPADES, Rank.QUEEN),
    S9(Suit.SPADES, Rank.NINE),
    S8(Suit.SPADES, Rank.EIGHT),
    S7(Suit.SPADES, Rank.SEVEN),
    HA(Suit.HEARTS, Rank.ACE),
    HT(Suit.HEARTS, Rank.TEN),
    HK(Suit.HEARTS, Rank.KING),
    HQ(Suit.HEARTS, Rank.QUEEN),
    H9(Suit.HEARTS, Rank.NINE),
    H8(Suit.HEARTS, Rank.EIGHT),
    H7(Suit.HEARTS, Rank.SEVEN),
    DA(Suit.DIAMONDS, Rank.ACE),
    DT(Suit.DIAMONDS, Rank.TEN),
    DK(Suit.DIAMONDS, Rank.KING),
    DQ(Suit.DIAMONDS, Rank.QUEEN),
    D9(Suit.DIAMONDS, Rank.NINE),
    D8(Suit.DIAMONDS, Rank.EIGHT),
    D7(Suit.DIAMONDS, Rank.SEVEN);

    override fun toString(): String {
        return suit.toString() + rank.toString()
    }
}

enum class Suit {

    CLUBS,
    SPADES,
    HEARTS,
    DIAMONDS;

    override fun toString(): String {
        when (this) {
            CLUBS -> return "♣"
            SPADES -> return "♠"
            HEARTS -> return "♥"
            DIAMONDS -> return "♦"
        }
    }
}

enum class Rank {
    ACE,
    TEN,
    KING,
    QUEEN,
    JACK,
    NINE,
    EIGHT,
    SEVEN;

    override fun toString(): String {
        when (this) {
            ACE -> return "A"
            TEN -> return "T"
            KING -> return "K"
            QUEEN -> return "Q"
            JACK -> return "J"
            NINE -> return "9"
            EIGHT -> return "8"
            SEVEN -> return "7"
        }
    }
}
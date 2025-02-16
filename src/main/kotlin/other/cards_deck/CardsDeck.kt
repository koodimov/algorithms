package mov.kudy.other.cards_deck

data class Card(
    val suit: Suit,
    val rank: Rank
)

enum class Suit {
    Diamonds, Hearts, Spades, Clubs;
}

enum class Rank {
    Six, Seven, Eight, Nine, Ten, Jack, Queen, King, Ace;
}


fun cardsDeck(input: List<Card>): Int {
    val cardsArray = IntArray(36) { 0 }
    input.forEach {
        cardsArray[cardIndex(it)]++
    }
    return cardsArray.min()
}

private fun cardIndex(card: Card): Int = card.suit.ordinal * 9 + card.rank.ordinal

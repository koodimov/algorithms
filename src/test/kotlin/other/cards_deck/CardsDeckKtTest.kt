package other.cards_deck

import io.kotest.common.runBlocking
import io.kotest.data.forAll
import io.kotest.data.row
import io.kotest.matchers.shouldBe
import mov.kudy.other.cards_deck.Card
import mov.kudy.other.cards_deck.Rank
import mov.kudy.other.cards_deck.Rank.*
import mov.kudy.other.cards_deck.Suit
import mov.kudy.other.cards_deck.Suit.*
import mov.kudy.other.cards_deck.cardsDeck
import org.junit.jupiter.api.Test

class CardsDeckKtTest {
    @Test
    fun `should return result according to parameters`(): Unit = runBlocking {
        forAll(
            row(listOf(Card(Spades, Ace)), 0),
            row(fullDeck(1), 1),
            row(fullDeck(3), 3),
            row(fullDeck(1) + listOf(Card(Spades, Ace), Card(Diamonds, Queen)), 1),
            row(emptyList(), 0)
        ) { cards, result ->
            cardsDeck(cards) shouldBe result
        }
    }

    private fun fullDeck(count: Int): List<Card> {
        return (1..count).flatMap {
            Suit.entries.flatMap { suit ->
                Rank.entries.map { rank ->
                    Card(suit, rank)
                }
            }
        }
    }
}
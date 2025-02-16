package sliding_window

import io.kotest.common.runBlocking
import io.kotest.data.forAll
import io.kotest.data.row
import io.kotest.matchers.shouldBe
import mov.kudy.sliding_window.bestTimeToBuyAndSellStocks
import org.junit.jupiter.api.Test

class BestTimeToBuyAndSellStocksKtTest {

    @Test
    fun `when receive prices array then return the most profit`(): Unit = runBlocking {
        forAll(
            row(intArrayOf(7, 1, 5, 3, 6, 4), 5),
            row(intArrayOf(7, 6, 4, 3, 1), 0),
        ) { prices, result ->
            bestTimeToBuyAndSellStocks(prices) shouldBe result
        }
    }
}
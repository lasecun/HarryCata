import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class HarryTest {

    @Test
    fun priceWithOneBook() {
        // GIVEN
        val expectedPrice = 8.0

        // WHEN
        val priceWithOneBook = totalMoney(listOf(Books.BOOK_1))

        // THEN
        assertEquals(expectedPrice, priceWithOneBook)
    }

    @Test
    fun priceWithTwoBook() {
        // GIVEN
        val expectedPrice = 15.2

        // WHEN
        val priceWithTwoBook = totalMoney(listOf(Books.BOOK_1, Books.BOOK_2))

        // THEN
        assertEquals(expectedPrice, priceWithTwoBook)
    }

    @Test
    fun priceWithTwoBookSimilar() {
        // GIVEN
        val expectedPrice = 16.0

        // WHEN
        val priceWithTwoBook = totalMoney(listOf(Books.BOOK_1, Books.BOOK_1))

        // THEN
        assertEquals(expectedPrice, priceWithTwoBook)
    }

    @Test
    fun priceWithThreeBook() {
        // GIVEN
        val expectedPrice = 21.6

        // WHEN
        val priceWithTwoBook = totalMoney(listOf(Books.BOOK_1, Books.BOOK_2, Books.BOOK_3))

        // THEN
        assertEquals(expectedPrice, priceWithTwoBook)
    }
}
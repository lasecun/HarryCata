fun main(args: Array<String>) {
    val result = totalMoney(listOf(Books.BOOK_1))
    println("Total to pay: $result")
}

fun totalMoney(booksList: List<Books>): Double? {
    if (booksList.size == 1) {
        return 8.0
    }
    if (booksList.size == 2) {
        if(booksList[0] == booksList[1]){
            return 16.0
        }else {
            val price = 8 * 2 * 5
            val totalPrice: Double = price.toDouble() / 100
            return 16 - totalPrice
        }
    }
    return null
}


enum class Books {
    BOOK_1,
    BOOK_2,
    BOOK_3,
    BOOK_4,
    BOOK_5,
}
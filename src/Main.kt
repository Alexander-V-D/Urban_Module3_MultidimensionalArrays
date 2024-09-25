fun main() {

}

//Функция для задачи 1
fun printMinimalElement(array: Array<Array<Int>>) {
    var min = array[0][0]
    for (row in array) {
        for (cell in row) {
            if (cell < min) min = cell
        }
    }
    println("Ответ к задаче 1: $min")
}

//Функция для задачи 2
fun printMedian() {
    val array = arrayOf(
        arrayOf(1, 2, 4),
        arrayOf(4, 6, 6),
        arrayOf(7, 5, 3),
        arrayOf(10, 3, 9),
        arrayOf(13, 14, 10)
    )
    var sortedArray = arrayOf<Int>()
    for (row in array) {
        for (cell in row) {
            sortedArray += cell
        }
    }
    sortedArray.sort()
    println("Ответ к задаче 2: Медиана равна ${sortedArray[7]}")
}

//Функция для задачи 3
fun printArray() {
    var array = Array(5) { Array(5) {0} }
    var n = 0
    for (i in array.size / 2..<array.size) {
        for (j in array.size / 2 - n..array.size / 2 + n) {
            array[i][j] = 1
        }
        n++
    }
    println("Ответ к задаче 3:")
    for (row in array) {
        for (cell in row) {
            print(cell)
        }
        println()
    }
}

//Функция для задачи 4
fun printSecondMax(array: Array<Int>) {
    var max = array[0]
    for (i in array) if (i > max) max = i
    var secondMax = array[0]
    for (i in array) if (i > secondMax && i != max) secondMax = i
    println("Ответ к задаче 4: $secondMax")
}
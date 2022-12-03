fun main(){
    val testInput = readTestInput("Day03_test")
    val actualInput = readInput("Day03")
    val score = calculateScore(testInput)
    println("The score of given rucksacks is: $score")
}


fun calculateScore(list: List<String>): Int {
    var sum = 0
    list.forEach {
        sum += it.pointOfSameItem()
    }
    return sum
}
fun String.pointOfSameItem(): Int {
    val length = this.length
    for (i in 0 until length/2){
        for (j in length/2 until length){
            if (this[i] == this[j]){
                return this[i].findItemPoint()
            }
        }
    }
    return 0
}

fun Char.findItemPoint(): Int {
    return if (this in 'a'..'z') this.code.minus(96)
    else this.code.minus(38)
}


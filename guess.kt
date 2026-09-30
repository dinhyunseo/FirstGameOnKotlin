fun main() {
    val secretNum = (1..500).random()
    //println("секрет: $secretNum");
    var isCorrect = false
    var count = 0
    print("угадай число от 1 до 500: ")
    while (!isCorrect) {
        var num = readln().toInt()
        count++
        when {
            num > secretNum -> println("Загаданное число меньше")
            num < secretNum -> println("Загаданное число больше")
            else -> {
                println("Угадал")
                isCorrect = true
            }
        }
    }

    println("Вы угадали число, ваше число: $secretNum")
    println("Ваши попытки: $count")
    when {
        count <= 10 -> println("Мегахорош!")
        count <= 20 -> println("Хорош!")
        count <= 30 -> println("Неплохо!")
        count <= 40 -> println("мог бы лучше!")
        count <= 50 -> println("Ну тут уже даже я в ахуе!")
        count <= 70 -> println("Ты это специально?")
        count > 70 -> println("....")
    }
}

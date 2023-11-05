fun main() {
    println("Данная программа считает различные цифры в 2-мерном массиве. Массив заполняется в ручную!!!")
    println("Введите количество строк массива:")
    val row=readln().toInt()
    println("Введите количество столбцов массива:")
    val colum=readln().toInt()
    val matrix =Array(row){ IntArray(colum)}
    var str=""
    println("Введите элементы массива(только 3-х значные числа) через Enter")
    for (i in 0..<row){
        for(j in 0 ..< colum){
           var number = readln().toInt()
            while ( number < 100 || number >= 1000) {
                println("Неверный формат числа! Введите трехзначное число:")
                number = readln().toInt()
            }
matrix[i][j]=number
            str+=matrix[i][j].toString()
        }
    }
    println("Ваш 2-мерный массив: ")
    for (rows in matrix) {
        for (element in rows) {
            print("$element ")
        }
        println()
    }
println("Количество различных цифр в данном массиве: ${str.toSet().size}")
}

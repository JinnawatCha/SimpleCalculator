import java.util.Scanner

fun main(){
    val scan = Scanner(System.`in`)
    println("Welcome to SimpleCalculator")
    println("Enter your two number: ")
    val num1 = scan.nextDouble()
    val num2 = scan.nextDouble()
    val total = Calculator()
    println("Choose a operation (+,-,x,%) : ")
    val operation = scan.next()
    if (operation !in listOf("+","-","x","%")) {
        println("Invalid operation")
    }

    when(operation){
        "x" -> total.multiply(num1,num2)
        "%" -> total.divide(num1,num2)
        "+" -> total.plus(num1,num2)
        "-" -> total.minus(num1,num2)
    }
}

class Calculator (){
    fun plus(num1: Double, num2: Double){
        println(num1+num2)
    }
    fun minus(num1: Double, num2: Double){
        println(num1-num2)
    }
    fun multiply(num1: Double, num2: Double){
        println(num1*num2)
    }
    fun divide(num1: Double, num2: Double){
        println(num1/num2)
    }
}
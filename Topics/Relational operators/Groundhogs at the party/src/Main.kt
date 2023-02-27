fun main() {
    // write your code here
    val num = readln().toInt()
    val week = readln().toBoolean()
    println(((num >= 10 && num <= 20) && week==false) || ((num >= 15 && num <= 25) && week==true))
}
/**
 *
 * Created by jarvis on 2016. 11. 25..
 */

fun sum(a:Int, b:Int) = a+b

fun main(args: Array<String>) {
    var a :Int = sum(5,3)
    println("Hello Arahansa! $a")
    main2()
}

fun main2(){
    val a = {a:Int, b:Int-> a+b}(3,5)
    println("Hello arahan! $a")
}

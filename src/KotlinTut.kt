/**
 * Created by adrian.curia on 7/10/2017.
 */

package demo

import java.time.ZoneId

// import from java
import java.util.Random

fun  main(args : Array<String>) {
    System.out.println("hello world")

    val name = "Adi"
    var age = 33

    var bigInt: Int = Int.MAX_VALUE
    var smallInt: Int = Int.MIN_VALUE
    var bigFloat: Float = Float.MAX_VALUE
    var smallFloat: Float = Float.MIN_VALUE

    System.out.println("BigInt is=" + bigInt)
    System.out.println("SmallInt is= $smallInt")

    /**
     * other datatypes
     *
     * Long
     * double
     * Float
     * Boolean
     * Short (16 bits)
     * Byte (8 bits)
     * Char
     */

    if (true is Boolean){
        print("true is booleand\n")
    }


    var myChar : Char = 'A'
    println("A is a Char: ${myChar is Char}")


    println("3.14 to Int :"+(3.14.toInt()))
    println("A to Int :"+('A'.toInt()))
    println("65 to Char :"+(65.toChar()))


    /** Strings*/
    val myName = "Adrian Curia"
    var longStr = """sadasda asd dasd asdafdad
                fasdsadasd asda sdg sdfwd
                sdfsdf sdfsd
                sdf sdfs dfsdf
                sdf sdf sdfsdf"""

    var longStr2: String = """sadasda asd dasd asdafdad
                        fasdsadasd asda sdg sdfwd
                        sdfsdf sdfsd
                        sdf sdfs dfsdf
                        sdf sdf sdfsdf"""


    var text = longStr + " " + longStr2
    print("All text is $text")

    println("\n1 + 2 = ${1+2}")
    println("\nText length = ${text.length}")


    var str1 = "a bcd"
    var str2 = "A bcd"
    println("Strings equals? => ${str1.equals(str2)} ")

    println("Compare A to B => ${"A".compareTo("B")} ")

    println("Second index => ${str1.get(2)}  ")
    println("Second index => ${str1[2]}  ")

    println("Range index => ${str1.subSequence(2,4)}  ")

    println("Contains random => ${str1.contains("random")}  ")


    /**
     * Arrays - multiple values with multiple different types
     */
    var myArray = arrayOf(1, 1.23, "a")
    println("a[3]=${myArray[2]}")
    myArray[1] = 3.14
    println("Array Length : ${myArray.size}")
    println("a in array : ${myArray.contains("a")}")

    var partArray = myArray.copyOfRange(0,1)
    println("First : ${myArray.first()}")
    println("IndexOf : ${myArray.indexOf("a")}")

    var sqArray = Array(5,{x -> x*x})
    print(sqArray[2])

    // type specific arrays
    var arr2: Array<Int> = arrayOf(1,2,3) // try with string

    // ranges
    val oneTo10 = 1..10
    val alpha = "A".."Z"

    println("R in alpha: ${"R" in alpha}")

    val tenTo1 = 10.downTo(1) // we also have upTo
    // step through range
    val rng3 = oneTo10.step(3)

    // cycle
    for(x in rng3) println("range3: $x")
    for(x in tenTo1.reversed()) println("range3: $x")


    // conditions
    val myage = 8

    if (myage < 7) {
        println("go to school")
    } else if (myage == 5) {
        println("take sugar")
    } else if ((myage > 5) && (myage <=17)) {
        println("aaaaaa")
    } else {
        print("default")
    }

    when(myage) {
        0,1,2,3 -> print("aaaa")
        5 -> print("bbbb")
        in 6..17 -> {
            val grade = myage - 1
            print("Goto grade $grade")
        }
        else -> print("default")
    }


    for (x in 1 ..10) {
        println("loooping $x")
    }

    val rand = Random()
    val MagicNum = rand.nextInt(50) + 1

    var guess = 0

    while(MagicNum != guess) {
        guess += 1
    }

    println("Magic number was $guess")

    // continue and break
    for(x in 1..20) {
        if (x%2 == 0) {
            continue
        }
        println("Odd: $x")

        if (x==15) break
    }


    var arr3 : Array<Int> = arrayOf(3,6,9)
    for (i in arr3.indices){
        println("mult 3: ${arr3[i]}")
    }

    for ((index, value) in arr3.withIndex()){
        println("index 3: $index value = $value")
    }


    /**
     * functions
     */
    fun add(num1: Int, num2: Int) : Int = num1+ num2
    println("5 + 4 = ${add(5,4)}")

    fun addDef(num1: Int = 3, num2: Int = 3) : Int = num1+ num2
    println("5 + 4 = ${addDef()}")

    // named parameters
    println("5 + 4 = ${add(num2=5,num1 = 4)}")

    fun sayHello(name: String) : Unit = println("Hello $name")
    sayHello("Adi")

    val(two, three) = nextTwo(1)
    println("1 $two $three")

    println("Sum = ${getSum(1,2,3,4,5)}")

    // function literals
    val multitply = {num1: Int, num2: Int -> num1 * num2}
    println("5 * 4 = ${multitply(5,4)}")


    // recursive functions
    fun fact(x: Int) : Int {
        tailrec fun factTail(y: Int, z: Int) : Int {
            if (y==0) return z
            else return factTail(y - 1, y * z)
        }
        return factTail(x, 1)
    }

    // higher order functions

}



fun nextTwo(num: Int): Pair<Int,Int> {
    return Pair(num+1,num+2)
}

fun getSum(vararg nums: Int) : Int{
    var sum = 0

    nums.forEach { n-> sum += n }
    return sum
}

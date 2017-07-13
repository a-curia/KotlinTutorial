/**
 * Created by adrian.curia on 7/10/2017.
 */

package demo

import java.time.ZoneId

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
}
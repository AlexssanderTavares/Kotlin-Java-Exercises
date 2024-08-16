/*
    MAKE A FUNCTION THAT VERIFIES IF A VALOR IS PERFECT OR NOT. A VALOR IS CALLED PERFECT WHEN
    IT IS EQUAL THE SUM OF ITS DIVISORS EXCEPT ITSELF. EXAMPLE: 6 IS PERFECT BECAUSE 6 = 1 + 2 + 3
    THE FUNCTION MUST RETURN A BOOLEAN RESULT
* */


fun main() {
    val userNum = readln().toInt()

    println(isPerfect(userNum))
}

fun isPerfect(num: Int): Boolean{
    if(num != 0){
        var res = 0
        val divisors = ArrayList<Int>()
        for(n in 1..num){
            if(num % n == 0 && n < num){
                divisors.add(n)
            }
        }

        divisors.forEach {
            println(it)
            res += it
        }

        return if(res == num){
            println("$num is perfect?")
            true
        }else{
            println("$num is perfect?")
            false
        }
    }else{
        throw IllegalArgumentException("Zero can't be divided. Division by zero is impossible.")
    }

}
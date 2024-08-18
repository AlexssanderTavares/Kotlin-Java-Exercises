
/*
    Write a function that receives as parameter two values X and Z and calculates and returns X^z. Without using ready
    functions or pow operators.
* */


fun main() {
    println(potencyOf(5, 3))

}


fun potencyOf(x: Int, z: Int) : Int{
    var count: Int = 1
    var res = x
    do{
        res *= x
        count++
    }while(count < z)
    return res
}
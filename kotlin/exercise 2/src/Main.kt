//TIP CONSIDER AN ARRAY OF TRAJECTORIES OF 9 ELEMENTS, WHERE EACH ELEMENT HAS THE NEXT ARRAY ELEMENT ADDRESS TO BE READ.
//    INDEX 1 2 3 4 5 6 7 8 9
//    VALOR 5 7 6 9 2 8 4 0 3
//
//    SO THE SEQUENCE OF READING WILL BE 1, 5, 2, 7, 4, 9, 3, 6, 8, 0
//    BUILD AN ALGORITHM THAT IS ABLE TO READ THIS ARRAY AND FOLLOW ITS OWN TRAJECTORY.



fun main() {
    val arr: Array<Int> = arrayOf(1,5,7,6,9,2,8,4,0,3)

    var counter = arr[0]

    while(counter < arr.size){
        println(arr[counter])
        counter = arr[counter]
    }
}
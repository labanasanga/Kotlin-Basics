class safarimidmorning {
    //data member

    var nambari: Int = 9
    var nambari2: Int = 5


    //member Function

fun square(): Int {
        return nambari * nambari
    }

}
//fun square(): Int{
 //   return nambari + nambari2
//}




fun main(args: Array<String>) {
    //instance of an object
    val myobj=safarimidmorning()
    println("The square of ${myobj.square()}")
}

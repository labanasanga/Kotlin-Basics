fun main(args: Array<String>) {
    var myarr= arrayOf("banana","oranges","mangoes",76,64)
    myarr[1]="bananas"
    println("I love eating ${myarr[1]}")

    var myarr2= arrayOf<Int>(5,7,4,-3,7,8,23,13)
    println(myarr2.sorted())

    var myarr3= arrayOf<String>("Kenya","Uganda","Tanzania","Burundi","Rwanda")
    println(myarr3.sorted())

    var myarr4= arrayOf<Float>(1f,122f,343f,87f,332f,2f)
    println(myarr4.sorted())
}
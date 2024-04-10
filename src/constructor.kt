class staff(val name:String,val age:Int,val gender:String)


fun main(args: Array<String>) {
    val myob=staff("laban",18,"Male")
    println("Staff name is ${myob.name} of age ${myob.age} and their gender is ${myob.gender}")
}
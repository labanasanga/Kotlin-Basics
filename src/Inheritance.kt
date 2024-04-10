open class parent{

    var father="He likes watching football"
    var mother="She likes cooking"
    var mothercolor="Lightskin"
    var fathercolor="Darkskin"

}
class boy:parent(){
    fun mvulana(){
        println("The boy is $fathercolor and likes watching $father")
    }

}
class girl:parent(){
    fun msichana(){
        println("The girl is $mothercolor and she likes $mother ")
    }
}

fun main(args: Array<String>) {
         val  obj=boy()
    obj.mvulana()
    }

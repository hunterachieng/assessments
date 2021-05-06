fun main(){
    introduction("Synthia",30)
    juiceDispenser(10)
    juiceDispenser(1)
    juiceDispenser(17)
    println(namesArray(arrayOf("Eunice","Tabitha","Amanda","Judith")))
    multiply(30,40)
    division(420,20)
    modulus(30,3)
    var person = Human("Aphonse",30,80.5)
    person.eat(4)
    person.speak("Ich kann sehr gut Deutsch sprechen")
    person.birthday()
    println(comparison(30,50))
    println(stringArray("Eve","Kelly","Maurine","Susan","Loice"))

}
fun introduction (name:String,age:Int){
    println("My name is $name and I am $age years old")
}
fun juiceDispenser (age:Int){
    if(age < 6){
        println("Glass of milk")
    }
    else if(age >6 && age < 15){
        println("Bottle of fanta")
    }
    else{
        println("Cocacola")
    }
}
fun namesArray( names:Array<String>):Int{
    var number = 0
    for (name in names){
        if (name.length > 4){
            number += names.indexOf(name)
        }
    }
    return number
}
fun multiply (num1:Int,num2:Int){
    println(num1 * num2)
}
fun division (num1:Int, num2:Int){
    println(num1 / num2)
}
fun modulus (num1:Int, num2:Int){
    println(num1%num2)
}
class Human (var name:String, var age:Int, var weight:Double){
    fun eat(foodWeight:Int){
        println("I am eating $foodWeight kgs of food")
        weight += foodWeight
    }
    fun speak(speech:String){
        println(speech)
    }
    fun birthday(){
        println(age + 1)
    }
}
fun comparison( first:Int, second:Int):Boolean{
    if(first < second){
        return true
    }
    else{
        return false
    }
}
fun stringArray (first:String,second:String,third:String,fourth:String,fifth:String):Array<String>{
    return arrayOf(first,second,third,fourth,fifth)
}
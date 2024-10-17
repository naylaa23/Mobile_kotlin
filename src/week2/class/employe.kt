package week2.`class`

open class Employe (val name: String){
    fun sayHello(name: String){
        println("hello $name myname is ${this.name}")
    }
}

class Manager (name: String) :  Employe(name)

class Member (name: String) : Employe(name)
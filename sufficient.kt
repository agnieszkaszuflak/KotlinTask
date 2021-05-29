data class Person(val surname: String, val name: String, val age: Number){

    public fun getPerson():String {
        return (this.name + " " + this.surname + ", age "+  this.age.toString())
    }    
}
fun main() {
    println("Hello, world!!!");
   	val person = Person("Doe", "John", 5);
    println(person.getPerson())
}
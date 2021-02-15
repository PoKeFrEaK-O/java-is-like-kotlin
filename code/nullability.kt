// By default, Kotlin assumes that value cannot be null.
// You cannot assign null to reference a, and if you try to do so, it will result in a compiler error:
var a: String = "value"
//a = null
// Error: null can not be a value of a non-null type String

// If we want to create a nullable reference,
// we need to create append the question mark(?) to the type definition:
var b: String? = "value"
b = null
println(b)
// No Error
// println(b) --> null

// When we want to access the b reference, we must handle the null case explicitly:
if (b != null) {
    println("b ist nicht null, sondern $b")
} else {
    println("b ist null")
}
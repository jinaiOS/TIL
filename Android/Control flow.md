# Control flow
## If

```kotlin
val d: Int
val check = true

if (check) {
    d = 1
} else {
    d = 2
}

println(if (a > b) a else b)
```

## When

```kotlin
val obj = "Hello"

val result = when (obj) {
    "1" -> println("One")
    "Hello" -> println("Greeting")
    else -> println("Unknown")
} // Greeting
```

### **Ranges**

```kotlin
1..4 // 1, 2, 3, 4
1..<4 // 1, 2, 3
4 downTo 1 // 4, 3, 2, 1
```

### Char Ranges

```kotlin
'a'..'d' // 'a', 'b', 'c', 'd'
'z' downTo 's' step 2 // 'z', 'x', 'v', 't'
```

## For

```kotlin
for (number in 1..5) { 
    print(number) // 12345
}
```

## **While**

```kotlin
var cakesEaten = 0
while (cakesEaten < 3) {
    println("Eat a cake")
    cakesEaten++
}
// Eat a cake
// Eat a cake
// Eat a cake
```

```kotlin
var cakesEaten = 0
var cakesBaked = 0
while (cakesEaten < 3) {
    println("Eat a cake")
    cakesEaten++
}
do {
    println("Bake a cake")
    cakesBaked++
} while (cakesBaked < cakesEaten)
// Eat a cake
// Eat a cake
// Eat a cake
// Bake a cake
// Bake a cake
// Bake a cake
```

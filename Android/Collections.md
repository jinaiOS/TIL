# Collections
## Lists

- 순서가 있는 요소들의 집합

### **불변 리스트 (Immutable Lists)**

```kotlin
val fruits = listOf("Apple", "Banana")

print(fruits[0]) // "Apple"

fruits.filter { it == "Apple" } // ["Apple"]
fruits.map { it.length } // [5, 6]
```

### **가변 리스트 (Mutable Lists)**

```kotlin
val fruits = mutableListOf("Apple", "Banana")

fruits.add("Melon")
fruits.remove("Apple")
```

## Sets

- 중복된 요소를 허용하지 않는 컬렉션

### **불변 Set**

```kotlin
val fruits = setOf("Apple", "Banana")

fruits.filter { it == "Apple" } // ["Apple"]
fruits.map { it.length } // [5, 6]
```

### **가변 Set**

```kotlin
val fruits = mutableSetOf("Apple", "Banana")

fruits.add("Melon")
fruits.remove("Apple")

/// 중복은 지원하지 않아서 추가 되지 않음
fruits.add("Apple")
```

## Maps

- 키와 값 쌍으로 이루어진 컬렉션

### 불변 Map

```kotlin
var fruits = mapOf("apple" to "사과", "banana" to "바나나") // {apple=사과, banana=바나나}

fruits["apple"] // 사과
fruits.filter { it.key.startsWith("a") } // {apple=사과}
fruits.map { it.value.uppercase() } // [사과, 바나나]
```

### 가변 Map

```kotlin
var fruits = mutableMapOf("apple" to "사과", "banana" to "바나나")

fruits["Melon"] = "멜론"
fruits.remove("apple")
```

### Map 순회

```kotlin
for ((key, value) in fruits) {
    println("$key = $value")
}
```

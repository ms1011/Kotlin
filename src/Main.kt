fun main() {
    println("Hello World!");
    variables();
}

fun variables() {
    var name = "홍길동";       // 가변 String (text)
    val birthYear = 1988;     // 불가변 Int (number)
    println(name);
    println(birthYear);

    var name2: String = "홍길순";
    val birthYear2: Int = 1992;
    println(name2);
    println(birthYear2);
}
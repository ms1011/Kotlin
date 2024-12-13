fun main() {
    println("Hello World!");
    variables();
    dataTypes();
    ifExpressions();
    whenExpression();
    arrays();
}

fun arrays() {
    val colors = arrayOf("Red", "Green", "Blue");
    colors[0] = "Yellow";
    println(colors[0]);
    println(colors.size);

    if ("Green" in colors) {
        println("있다!");
    } else {
        println("없다!");
    }

    for (color in colors) {
        println(color);
    }
}

fun whenExpression() {
    val day = 4;

    val result = when (day) {
        1 -> "월";
        2 -> "화";
        3 -> "수";
        4 -> "목";
        5 -> "금";
        6 -> "토";
        7 -> "일";
        else -> "잘못된 요일";
    }
    println(result);
}

fun ifExpressions() {
    val time = 20;
//    val greeting = if (time < 12) {
//        "좋은 아침";
//    } else {
//        "식사는 하셨어요?";
//    }
    val greeting = if (time < 12) "좋은 아침" else "식사는 하셨어요?";

    println(greeting);
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

fun dataTypes() {
    // 자료형 명시 X
    val myNum = 5;
    val myDouble = 3.14;
    val myLetter = 'A';
    val myBoolean = true;
    val myText = "Hello";

    // 자료형 명시 O
    val myNum2: Int = 5;        // Byte, Short, Int, Long
    val myNum3: Float = 3.14F;
    val myDouble2: Double = 3.14;
    val myLetter2: Char = 'A';
    val myBoolean2: Boolean = true;
    val myText2: String = "Hello";

    // 형변환
    val x: Int = 3;
    val y: Long = x.toLong();
    println(y);
}
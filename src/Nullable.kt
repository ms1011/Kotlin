class Nullable {
    fun printLength(str: String?) {
        if (str != null) {
            println("길이는 ${str.length}")
        } else {
            println("null입니다.")
        }
    }

}
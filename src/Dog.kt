class Dog: Animal() {
    // override를 변수 앞에 붙여야 한다
    override var type = "강아지";
//    override var name = "초코"; // 컴파일 오류 발생

    override fun bark() {
        println("멍멍~");
    }
}
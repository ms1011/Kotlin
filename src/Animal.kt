// 상속을 주기 위해선 open을 붙여야한다.
open class Animal {
    // override를 위해서는 open을 붙여야한다
    open var type = "동물";
    var name = "쫑이";

    open fun bark() {
        println("짖다");
    }
}
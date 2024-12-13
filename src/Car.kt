/*
class Car {
    var brand = "";
    var model = "";
    var year = 0;
}*/

class Car(var brand: String, var model: String, var year: Int) {
    fun drive(speed: Int) {
        println(speed.toString() + "속도로 부릉~");
    }

    fun introduce() {
        println(brand);
        println(model);
        println(year);
    }
}
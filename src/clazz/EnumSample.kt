package clazz

enum class Color {
    RED, GREEN, BLUE
}

enum class ColorValue (rgb: Int){
    RED(0xFF0000), GREEN(0x00FF00), BLUE(0x0000FF);

    var rgb : Int = 0

    init {
        this.rgb = rgb
    }
}

fun main(args: Array<String>) {
    println(Color.RED)
    println(ColorValue.RED)
}
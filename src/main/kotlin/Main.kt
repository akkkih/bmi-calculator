import java.util.*

fun main() {
    println("--- BMI Calculator ---")
    println("Welcome to the BMI Calculator.")
    
    print("Please enter your weight in kilograms: ")
    val weight = readln().toDoubleOrNull() ?: 0.0
    
    print("Please enter your height in meters: ")
    val height = readln().toDoubleOrNull() ?: 0.0
    
    val imc = weight / (height * height)
    val ranking = when {
        imc < 18.5 -> Weight.UNDERWEIGHT
        imc < 25.0 -> Weight.NORMAL
        imc < 30.0 -> Weight.OVERWEIGHT
        else -> Weight.OBESE
    }
    
    val formatted = "%.1f".format(Locale.US, imc)
    println("Your BMI is $formatted, meaning you're ${ranking.text}.")
    println("----------------------")
}

enum class Weight(val text: String) {
    UNDERWEIGHT("underweight"),
    NORMAL("normal"),
    OVERWEIGHT("overweight"),
    OBESE("obese");
}
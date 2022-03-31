package kristalcraft.SimpleCalculator.Calculator

class Arguments {
    val ADD: String = "+"
    val SUBSTRACT: String = "-"
    val MULTIPLY: String = "*"
    val DIVIDE: String = "/"

    val error_operator: String = "Insert valid operator"
    //val error_numbers: String= "Insert valid numbers"

    //val TestValue1: Double = 5.0
    //val TestValue2 = 4.0

    fun main(symbol:String, number1: String, number2: String): String {
        return start(symbol, number1, number2)
    }

    private fun start(operatorSymbol: String, number1: String, number2: String): String {
        return calculate(number1, number2, operatorSymbol)
    }

    private fun calculate(opOne: String, opTwo: String, sym: String): String {
        return when (sym) {
            ADD -> (opOne.toDouble() + opTwo.toDouble()).toString()
            SUBSTRACT -> (opOne.toDouble() - opTwo.toDouble()).toString()
            MULTIPLY -> (opOne.toDouble() * opTwo.toDouble()).toString()
            DIVIDE -> (opOne.toDouble() / opTwo.toDouble()).toString()
            else -> error_operator
        }
    }

    fun checkOperator(operatorSymbol: String): Boolean {
        return when (operatorSymbol) {
            //equals
            ADD -> true
            SUBSTRACT -> true
            MULTIPLY -> true
            DIVIDE -> true
            else -> false
        }
    }
}

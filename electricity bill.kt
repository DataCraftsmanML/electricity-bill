import java.util.Scanner

fun main() {
    
    val scanner = Scanner(System.`in`)
    var unit: Int
    var amt: Float
    var total_amt: Float
    var sur_charge: Float
    
    println("Electricity Bill")
    print("Enter the number of units consumed: ")
    unit = scanner.nextInt()
    
    amt = when {
       
        unit <= 50 -> unit * 0.50f
        unit <= 100 -> 50 * 0.50f + (unit - 50) * 0.75f
        unit <= 200 -> 50 * 0.50f + 50 * 0.75f + (unit - 100) * 1.20f
        else -> 50 * 0.50f + 50 * 0.75f + 100 * 1.20f + (unit - 200) * 1.50f
    }
    
    sur_charge = amt * 0.20f
    total_amt = amt + sur_charge
    
    println("Electricity Bill = Rs. $total_amt")
}

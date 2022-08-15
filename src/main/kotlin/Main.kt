import io.github.dagte.crossingtheswamp.*
import java.util.*

fun main(args: Array<String>) {
    // Adding comment just to check that it works
//    println("Program arguments: ${args.joinToString()}")
//    var bo = Board();
//    bo.name = "bla"
//    print(bo.name) // Prints: Marcin
    val scanner  = Scanner(System.`in`)
//    val num1 = scanner.nextInt()
//    println("The input one is : $num1")
//    val num2 = scanner.nextInt()
//    println("The input two is : $num2")
    println("Define the board X times Y")
    val x = scanner.nextInt()
    val y = scanner.nextInt()


    val board = Board(x, y);
    val currentPosition = Position(board)
    var iteration: Int = 0
    while (true) {
        println("Tell me which direction")
        val direction = scanner.next()
        println("Choose walk (1), jump (2) or run (3)")
        val distance = scanner.nextInt()
        val movement = Movement(Direction.valueOf(direction), Distance.of(distance))
        currentPosition.move(movement)
        iteration++
        if (currentPosition.isOffBoard()) break
    }
    println("You escaped the board in ${iteration} turns")

}
package io.github.dagte.crossingtheswamp

class Position(_board: Board) {
    val board: Board = _board;
    var horizontal: Int = 0;
    var vertical: Int = 0;

    fun move(movement: Movement) {
        println("Moving ${movement.distance} towards ${movement.direction}")
        if (movement.isHorizontal()) {
            if (movement.direction == Direction.RIGHT) {
                horizontal += (movement.distance?.value ?: 0)
            } else {
                horizontal -= (movement.distance?.value ?: 0)
            }
        }
        if (movement.direction == Direction.DOWN) {
            vertical += (movement.distance?.value ?: 0)
        } else {
            vertical -= (movement.distance?.value ?: 0)
        }
    }

    fun isOffBoard(): Boolean {
        println("Current horizontal: ${horizontal}")
        println("Current vertical: ${vertical}")
        return horizontal > board.columns || horizontal < 0 || vertical > board.rows || vertical < 0
    }

}
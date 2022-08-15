package io.github.dagte.crossingtheswamp

class Movement(_direction: Direction, _distance: Distance)  {
    var direction: Direction? = null
        get() {
            return field;
        }
        set(value) {
            field = value;
        };
    var distance: Distance? = null
        get() {
            return field;
        }
        set(value) {
            field = value;
        };

    init {
        println("Dire = $direction")
        println("Dist = $_distance")
        direction = _direction
        distance = _distance
    }

    fun isHorizontal(): Boolean {
        return this.direction?.equals(Direction.LEFT) == true ||this.direction?.equals(Direction.RIGHT) == true
    }

}
package io.github.dagte.crossingtheswamp

enum class Distance(val value: Int) {
    STAND(0), WALK(1), JUMP(2), RUN(3);

    companion object {
        fun of(number: Int): Distance {
            if (number == 3) {
                return RUN
            }
            if (number == 2) {
                return JUMP
            }
            if (number.equals(1)) {
                return WALK
            }
            return STAND
        }
    }
}
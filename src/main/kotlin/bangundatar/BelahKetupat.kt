package bangundatar

import kotlin.math.sqrt

class BelahKetupat internal constructor() : BangunDatar {
    override fun luas(s1: Double, s2: Double): Double {
        return s1 * s2 / 2
    }

    override fun keliling(s1: Double, s2: Double): Double {
        return 4 * sisiMiring(s1, s2)
    }

    fun sisiMiring(s1: Double, s2: Double): Double {
        return sqrt(s1 / 2 * (s1 / 2) + s2 / 2 * (s2 / 2))
    }
}
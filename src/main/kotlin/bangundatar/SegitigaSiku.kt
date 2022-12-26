package bangundatar

import kotlin.math.sqrt

class SegitigaSiku internal constructor() : BangunDatar {
    override fun luas(s1: Double, s2: Double): Double {
        return 0.5 * s1 * s2
    }

    override fun keliling(s1: Double, s2: Double): Double {
        return s1 + s2 + sisiMiring(s1, s2)
    }

    fun sisiMiring(s1: Double, s2: Double): Double {
        return sqrt(s1 * s1 + s2 * s2)
    }
}
package bangundatar

class Persegi internal constructor() : BangunDatar {
    override fun luas(s1: Double, s2: Double): Double {
        return 0.0
    }

    override fun keliling(s1: Double, s2: Double): Double {
        return 0.0
    }

    fun luas(s: Double): Double {
        return s * s
    }

    fun keliling(s: Double): Double {
        return 4 * s
    }
}
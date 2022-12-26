package bangundatar

class PersegiPanjang internal constructor() : BangunDatar {
    override fun luas(s1: Double, s2: Double): Double {
        return s1 * s2
    }

    override fun keliling(s1: Double, s2: Double): Double {
        return 2 * (s1 + s2)
    }
}
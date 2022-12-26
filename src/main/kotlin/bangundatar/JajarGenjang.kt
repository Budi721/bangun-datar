package bangundatar

class JajarGenjang internal constructor() : BangunDatar {
    override fun luas(s1: Double, s2: Double): Double {
        return s1 * s2
    }

    override fun keliling(s1: Double, s2: Double): Double {
        return 2 * (s1 + sisiMiring(s2))
    }

    private fun sisiMiring(b: Double): Double {
        return b
    }
}
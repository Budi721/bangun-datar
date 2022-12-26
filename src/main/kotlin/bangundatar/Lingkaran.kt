package bangundatar

class Lingkaran internal constructor() : BangunDatar {
    private val pi = 3.1415
    override fun luas(s1: Double, s2: Double): Double {
        return 0.0
    }

    override fun keliling(s1: Double, s2: Double): Double {
        return 0.0
    }

    // metode overload
    fun luas(r: Double): Double {
        return pi * r * r
    }

    //metode overload
    fun keliling(r: Double): Double {
        return 2 * pi * r
    }
}
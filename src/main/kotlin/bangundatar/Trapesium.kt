package bangundatar

class Trapesium internal constructor() : BangunDatar {
    override fun luas(s1: Double, s2: Double): Double {
        return 0.0
    }

    override fun keliling(s1: Double, s2: Double): Double {
        return 0.0
    }

    fun luas(a: Double, b: Double, s: Double): Double {
        return (a + b) * tinggi(a, b, s) / 2
    }

    fun keliling(a: Double, b: Double, s: Double): Double {
        return a + b + s + tinggi(a, b, s)
    }

    fun tinggi(a: Double, b: Double, s: Double): Double {
        return Math.sqrt(s * s - (b - a) * (b - a))
    }
}
import bangundatar.*
import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader
import java.math.RoundingMode
import java.text.DecimalFormat
import java.util.*

object Main {
    private val scanner = Scanner(System.`in`)
    @JvmStatic
    fun main(args: Array<String>) {
        mainMenu()
    }

    private fun mainMenu() {
        println("=========================================")
        println("| Hitung Luas dan Keliling Bangun Datar |")
        println("=========================================")
        println("1. Persegi")
        println("2. Persegi Panjang")
        println("3. Segitiga Siku-Siku")
        println("4. Jajar Genjang")
        println("5. Trapesium")
        println("6. Layang-Layang")
        println("7. Belah Ketupat")
        println("8. Lingkaran")
        println("9. Keluar\n")
        val isr = InputStreamReader(System.`in`)
        val bufferedReader = BufferedReader(isr)
        try {
            print("Masukan Pilihan Menu : ")
            val input = bufferedReader.readLine()

            //kondisional untuk pilihan menu yang dimasukan
            if (input.isEmpty()) {
                println("\nAnda tidak memasukkan inputan, silahkan coba lagi.\n")
                mainMenu()
            } else when (input.toInt()) {
                1 -> persegi()
                2 -> persegiPanjang()
                3 -> segitigaSiku()
                4 -> jajarGenjang()
                5 -> trapesium()
                6 -> layangLayang()
                7 -> belahKetupat()
                8 -> lingkaran()
                9 -> println("\nThank You For Using This Application.\n")
                else -> {
                    println("\nTidak ada pilihan, silahkan coba lagi.\n")
                    mainMenu()
                }
            }
        } catch (e: NumberFormatException) {
            println("\nTidak ada pilihan, silahkan coba lagi.\n")
            mainMenu()
        } catch (e: IOException) {
            println("\nTidak ada pilihan, silahkan coba lagi.\n")
            mainMenu()
        }
    }

    private fun persegi() {
        var s: Double
        var coba: Char
        val persegi = Persegi()
        do {
            print("\nMasukan sisi persegi: ")
            s = scanner.nextDouble()
            println("Luas persegi: " + roundingMode(persegi.luas(s)))
            println("Keliling persegi: " + roundingMode(persegi.keliling(s)))
            print("\nIngin mencoba lagi? (y/t) : ")
            coba = scanner.next()[0]
            print("\n")
        } while (coba == 'Y' || coba == 'y')
        print("\n")
        mainMenu()
    }

    private fun persegiPanjang() {
        var s1: Double
        var s2: Double
        var coba: Char
        val persegiPanjang = PersegiPanjang()
        do {
            print("\nMasukan panjang persegi panjang: ")
            s1 = scanner.nextDouble()
            print("Masukan lebar persegi panjang: ")
            s2 = scanner.nextDouble()
            println("Luas persegi panjang: " + roundingMode(persegiPanjang.luas(s1, s2)))
            println("Keliling persegi panjang: " + roundingMode(persegiPanjang.keliling(s1, s2)))
            print("\nIngin mencoba lagi? (y/t) : ")
            coba = scanner.next()[0]
            print("\n")
        } while (coba == 'Y' || coba == 'y')
        print("\n")
        mainMenu()
    }

    private fun segitigaSiku() {
        var s1: Double
        var s2: Double
        var coba: Char
        val segitigaSiku = SegitigaSiku()
        do {
            print("\nMasukan alas segitiga siku-siku: ")
            s1 = scanner.nextDouble()
            print("Masukan tinggi segitiga siku-siku: ")
            s2 = scanner.nextDouble()
            println("Sisi miring (hipotenusa): " + roundingMode(segitigaSiku.sisiMiring(s1, s2)))
            println("Luas segitiga: " + roundingMode(segitigaSiku.luas(s1, s2)))
            println("Keliling segitiga: " + roundingMode(segitigaSiku.keliling(s1, s2)))
            print("\nIngin mencoba lagi? (y/t) : ")
            coba = scanner.next()[0]
            print("\n")
        } while (coba == 'Y' || coba == 'y')
        print("\n")
        mainMenu()
    }

    private fun lingkaran() {
        var r: Double
        var coba: Char
        val lingkaran = Lingkaran()
        do {
            print("\nMasukan jari-jari lingkaran: ")
            r = scanner.nextDouble()
            println("Luas lingkaran: " + roundingMode(lingkaran.luas(r)))
            println("Keliling lingkaran: " + roundingMode(lingkaran.keliling(r)))
            print("\nIngin mencoba lagi? (y/t) : ")
            coba = scanner.next()[0]
            print("\n")
        } while (coba == 'Y' || coba == 'y')
        print("\n")
        mainMenu()
    }

    private fun jajarGenjang() {
        var a: Double
        var t: Double
        var b: Double
        var coba: Char
        val jajarGenjang = JajarGenjang()
        do {
            print("\nMasukan alas jajar genjang: ")
            a = scanner.nextDouble()
            print("Masukan tinggi jajar genjang: ")
            t = scanner.nextDouble()
            print("Masukan sisi miring jajar genjang: ")
            b = scanner.nextDouble()
            println("Luas jajar genjang: " + roundingMode(jajarGenjang.luas(a, t)))
            println("Keliling jajar genjang: " + roundingMode(jajarGenjang.keliling(a, b)))
            print("\nIngin mencoba lagi? (y/t) : ")
            coba = scanner.next()[0]
            print("\n")
        } while (coba == 'Y' || coba == 'y')
        print("\n")
        mainMenu()
    }

    private fun trapesium() {
        var a: Double
        var b: Double
        var s: Double
        var coba: Char
        val trapesium = Trapesium()
        do {
            print("\nMasukan sisi sejajar a trapesium: ")
            a = scanner.nextDouble()
            print("Masukan sisi sejajar b trapesium: ")
            b = scanner.nextDouble()
            print("Masukan sisi miring trapesium: ")
            s = scanner.nextDouble()
            println("Tinggi trapesium: " + roundingMode(trapesium.tinggi(a, b, s)))
            println("Luas trapesium: " + roundingMode(trapesium.luas(a, b, s)))
            println("Keliling trapesium: " + roundingMode(trapesium.keliling(a, b, s)))
            print("\nIngin mencoba lagi? (y/t) : ")
            coba = scanner.next()[0]
            print("\n")
        } while (coba == 'Y' || coba == 'y')
        print("\n")
        mainMenu()
    }

    private fun layangLayang() {
        var d1: Double
        var d2: Double
        var ab: Double
        var bc: Double
        var coba: Char
        val layangLayang = LayangLayang()
        do {
            print("\nMasukan diagonal1/AC layang-layang: ")
            d1 = scanner.nextDouble()
            print("Masukan diagonal2/BD layang-layang: ")
            d2 = scanner.nextDouble()
            print("Masukan sisi miring1/AB layang-layang: ")
            ab = scanner.nextDouble()
            print("Masukan sisi miring2/BC layang-layang: ")
            bc = scanner.nextDouble()
            println("Luas layang-layang: " + roundingMode(layangLayang.luas(d1, d2)))
            println("Keliling layang-layang: " + roundingMode(layangLayang.keliling(ab, bc)))
            print("\nIngin mencoba lagi? (y/t) : ")
            coba = scanner.next()[0]
            print("\n")
        } while (coba == 'Y' || coba == 'y')
        print("\n")
        mainMenu()
    }

    private fun belahKetupat() {
        var d1: Double
        var d2: Double
        var coba: Char
        val belahKetupat = BelahKetupat()
        do {
            print("\nMasukan diagonal1/AC belah ketupat: ")
            d1 = scanner.nextDouble()
            print("Masukan diagonal2/BD belah ketupat: ")
            d2 = scanner.nextDouble()
            println("Sisi miring belah ketupat: " + roundingMode(belahKetupat.sisiMiring(d1, d2)))
            println("Luas belah ketupat: " + roundingMode(belahKetupat.luas(d1, d2)))
            println("Keliling belah ketupat: " + roundingMode(belahKetupat.keliling(d1, d2)))
            print("\nIngin mencoba lagi? (y/t) : ")
            coba = scanner.next()[0]
            print("\n")
        } while (coba == 'Y' || coba == 'y')
        print("\n")
        mainMenu()
    }

    private fun roundingMode(number: Double): String {
        val df = DecimalFormat("#.#####")
        df.roundingMode = RoundingMode.CEILING
        return df.format(number)
    }
}
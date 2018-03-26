import ws_eta.Lib

class App {
    companion object App {
        @JvmStatic
        fun main(args: Array<String>) {
            val x: Int = Lib.foo(3)
            print(x)
        }
    }
}


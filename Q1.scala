object interest{

    def main(args: Array[String]) = {
        def interest(amount: Double) = {

            if(amount < 20000) {
                println(amount * 0.02)
            }
            else if (amount < 200000) {
                println(amount * 0.04)
            }
            else if (amount < 2000000) {
                println(amount * 0.035)
            }
            else{
                println(amount * 0.065)
            }
        }
        interest(10000)
    }
}
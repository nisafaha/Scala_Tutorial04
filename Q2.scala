object pattern {

    def main(args: Array[String]) = {

        print("Insert an integer : ");
        var num = scala.io.StdIn.readInt();

        def FindNumber(number: Int) = number match {
            case number if number <= 0 => println("Negetive/Zero")
            case number if number % 2 == 0 => println("Even")
            case _ => println("Odd")
        }

        FindNumber(num);
    }
}
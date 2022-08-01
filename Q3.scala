object StringMethod {

    def toLower(str: String): String = str.toLowerCase();

    def toUpper(str: String): String = str.toUpperCase();

    def formatNames(name: String)(Index: Int*) (func: String => String): String = {
        
        var text = "";
        var index = 0;

        while(index < name.length()) {
            if(Index.contains(index)) {
                text = text + func(name.charAt(index).toString());
            }
            else {
                text = text + name.charAt(index).toString();
            }
            index = index + 1;
        }
        text;
    }

    def main(args: Array[String]) = {
        println(formatNames("Benny")(1,2,3,4)(toUpper));
        println(formatNames("Niroshan")(1)(toUpper));
        println(formatNames("Saman")(0)(toLower));
        println(formatNames("Kumara")(5)(toUpper));
    }
}
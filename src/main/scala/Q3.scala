object Q3 {
  def main(args: Array[String]): Unit = {
    println(formatNames("Benny", toUpper))
    println(formatNames("Niroshan", toUpper))
    println(formatNames("Saman", toLower))
    println(formatNames("Kumara", toUpper))
  }

  def toUpper(str: String): String = {
    str.toUpperCase()
  }

  def toLower(str: String): String = {
    str.toLowerCase()
  }

  def formatNames(name: String, formatFunction: String => String): String = {
    formatFunction(name)
  }

}

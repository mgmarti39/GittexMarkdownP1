package edu.towson.cosc.cosc455.mmarti39.Project1


/**
  * Created by Marqui on 10/11/2016.
  */
import scala.io.Source._
import scala.collection.mutable

object Compiler{

  var currentToken : String = ""
  var fileContents : String = ""
  var location: Int = 0
  val Scanner = new MyLexicalAnalyzer
  val Parser = new MySyntaxAnalyzer
  val SemanticAnalyzer = new MySyntaxAnalyzer

  def main(args: Array[String]): Unit = {
    checkFile(args)
    readFile(args(0))

    Scanner.getNextToken()

  }

  def readFile(file : String) = {
    val source = scala.io.Source.fromFile(file)
    fileContents = try source.mkString finally source.close()
  }

  def checkFile(args : Array[String]) = {
    if (args.length != 1) {
      println("USAGE ERROR: wrong number of args fool!")
      System.exit(1)
    }
    else if (! args(0).endsWith(".mkd")) {
      println("USAGE ERROR: wrong extension fool!")
      System.exit(1)
    }
  }
}

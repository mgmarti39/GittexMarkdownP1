package edu.towson.cosc.cosc455.mmarti39.Project1

/**
  * Created by Marqui on 10/11/2016.
  */


trait LexicalAnalyzer {
  def addChar() : Unit
  def getChar() : Char
  def getNextToken() : Unit
  def lookup() : Boolean = {
    println("this is lookup implementation!")
  }
}
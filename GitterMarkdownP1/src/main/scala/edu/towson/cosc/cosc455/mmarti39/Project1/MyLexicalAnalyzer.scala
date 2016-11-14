package edu.towson.cosc.cosc455.mmarti39.Project1

/**
  * Created by Marqui on 10/11/2016.
  */
class MyLexicalAnalyzer extends LexicalAnalyzer{
  var index = 0
  var posit = 0
  var nextChar = ' '
  var fileCont = " "


  var lstFileCont = Array.empty[Char]
  var currentToken: Char = ' '
  var tokenStr= " "
  var nextTokenStr = " "
  var file= " "

  def start(fileContents:String): Unit = {
    fileCont= fileContents

  }
  val lexems: List[String]= List("\\BEGIN", "\\END","\\TITLE[","]","#","\\PARAB","PARAE","**","*","+","\\","[","(",")","![","\\DEF","=","\\USE[")


  override def addChar():Unit= {
  nextTokenStr = nextTokenStr + currentToken
  }


  override def getChar(): Char = {
    Compiler.location+=1
    Compiler.fileContents.charAt(Compiler.location)

  }


  override def getNextToken(): Unit = {

    // it calls everything
  while((space())&& (file < fileCont.length)) {
    currentToken = getChar()
  }
  }


  def lookup(nextToken : String): Boolean = {



  }

  def endChar():Boolean={
    currentToken match{
      case '\\'|'*'|'('|')'|'['|']'|'!'|'\r' | '\n'|' '|'\t'|':' => true
      case _=> false
    }
  }

  def special():Boolean={
  currentToken match{
  case '\\'|'#'|'+'|'*'|'('|'['|'!'|'=' => true
  case _=> false

  }
  }
  def space(): Boolean = {
    if(currentToken.equals('\r') || currentToken.equals('\n') || currentToken.equals(' ') || currentToken.equals('\t')){
      true
    }else
      false
  }
}

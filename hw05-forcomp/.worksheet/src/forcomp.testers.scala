package forcomp

import org.scalatest.FunSuite

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import Anagrams._

object testers {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(203); 
  println("Welcome to the Scala worksheet");$skip(35); 

  val x = List("Hello", "there");System.out.println("""x  : List[String] = """ + $show(x ));$skip(32); 
  val y = wordOccurrences("ll");System.out.println("""y  : forcomp.Anagrams.Occurrences = """ + $show(y ));$skip(39); val res$0 = 

  subtract(sentenceOccurrences(x), y);System.out.println("""res0: forcomp.Anagrams.Occurrences = """ + $show(res$0));$skip(41); 

  val sentence = List("Linux", "rulez");System.out.println("""sentence  : List[String] = """ + $show(sentence ));$skip(29); val res$1 = 
  sentenceAnagrams(sentence);System.out.println("""res1: List[forcomp.Anagrams.Sentence] = """ + $show(res$1))}



}

package forcomp

import org.scalatest.FunSuite

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import Anagrams._

object testers {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

  val x = List("Hello", "there")                  //> x  : List[String] = List(Hello, there)
  val y = wordOccurrences("ll")                   //> y  : forcomp.Anagrams.Occurrences = List((l,2))

  subtract(sentenceOccurrences(x), y)             //> res0: forcomp.Anagrams.Occurrences = List((e,3), (h,2), (o,1), (r,1), (t,1))
                                                  //| 

  val sentence = List("Linux", "rulez")           //> sentence  : List[String] = List(Linux, rulez)
  sentenceAnagrams(sentence)                      //> res1: List[forcomp.Anagrams.Sentence] = List(List(Uzi, null, Rex), List(Uzi,
                                                  //|  Rex, null), List(Rex, Uzi, null))



}
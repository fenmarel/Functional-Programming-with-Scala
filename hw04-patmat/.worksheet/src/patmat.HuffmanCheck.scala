package patmat


import org.scalatest.FunSuite

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import patmat.Huffman._

object HuffmanCheck {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(210); 
  println("Welcome to the Scala worksheet");$skip(59); 

val t1 = Fork(Leaf('a',2), Leaf('b',3), List('a','b'), 5);System.out.println("""t1  : patmat.Huffman.Fork = """ + $show(t1 ));$skip(99); 
val t2 = Fork(Fork(Leaf('a',2), Leaf('b',3), List('a','b'), 5), Leaf('d',4), List('a','b','d'), 9);System.out.println("""t2  : patmat.Huffman.Fork = """ + $show(t2 ));$skip(41); 

 
val x = List(1, 2, 3):::List(4, 5, 6);System.out.println("""x  : List[Int] = """ + $show(x ));$skip(39); 
val bhfejhl = List("a", "b", "c", "d");System.out.println("""bhfejhl  : List[String] = """ + $show(bhfejhl ));$skip(41); 


 

val stests = ("abcde" contains "b");System.out.println("""stests  : Boolean = """ + $show(stests ));$skip(34); 
 
val grr = Huffman.decodedSecret;System.out.println("""grr  : List[Char] = """ + $show(grr ))}
}

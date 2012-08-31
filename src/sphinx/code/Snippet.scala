package com.typesafe.docexample.doc

//#imports
// Import our business object
import com.typesafe.docexample.Foo
//#imports

//#usage
object Snippet extends App {
  val i = 5
  val j = Foo.inc(i)
//#usage
  println(i)
  println(j)
//#usage
}
//#usage

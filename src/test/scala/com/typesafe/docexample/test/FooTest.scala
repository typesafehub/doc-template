package com.typesafe.docexample.test

import org.junit.Assert._
import org.junit.Test
import com.typesafe.docexample.Foo

/** A standard unit test */
class FooTest {

  @Test def test {
    assertEquals(3, Foo.inc(2))
  }
}

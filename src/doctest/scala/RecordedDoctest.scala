package com.typesafe.docexample.doc.test

abstract class RecordedDoctest extends RecordedTest {

  def basename = "src/doctest/resources/" + getClass.getName.replaceAll("^.*\\.", "")
}

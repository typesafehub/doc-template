# Typesafe Documentation Template Project

This template project should help you get started with adding documentation to
your own project. It contains Scala code, unit tests, buildable documentation,
included compiled code snippets and automated tests for those snippets.

You need to have Python and ``easy_install`` installed to install 
[Sphinx](http://sphinx.pocoo.org/). This works out of the box without any further
configuration outside the sbt build.

Check out ``project/Build.scala`` and ``project/build.sbt``, then run
``sbt make-site`` to generate the docs and read them under ``target/site``.

# Typesafe Documentation Template Project

This template project should help you get started with adding documentation to
your own project. It contains Scala code, unit tests, buildable documentation,
included compiled code snippets and automated tests for those snippets.

This is for example the way documentation is managed and generated in 
[Akka](http://doc.akka.io/docs/akka/snapshot/), [Slick](http://slick.typesafe.com/docs/) 
and [sbt](http://www.scala-sbt.org/). Browse to these sites for examples of how 
the generated site can look and feel (with a nice CSS applied).

You need to have Python and ``easy_install`` installed to install 
[Sphinx](http://sphinx.pocoo.org/). This works out of the box without any further
configuration outside the sbt build.

Check out ``project/Build.scala`` and ``project/build.sbt``, then run
``sbt make-site`` to generate the docs and read them under ``target/site``.

# Licence

The code is licensed under Apache 2 license:

    This software is licensed under the Apache 2 license, quoted below.

    Copyright 2011-2013 Typesafe (http://www.typesafe.com).

    Licensed under the Apache License, Version 2.0 (the "License"); you 
    may not use this project except in compliance with the License. You 
    may obtain a copy of the License at 
    http://www.apache.org/licenses/LICENSE-2.0.

    Unless required by applicable law or agreed to in writing, software 
    distributed under the License is distributed on an "AS IS" BASIS, 
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or 
    implied. See the License for the specific language governing 
    permissions and limitations under the License.

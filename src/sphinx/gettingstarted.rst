Getting Started
===============

This documentation is built with `Sphinx`_, the standard Python documentation
processing tool.

Links
-----

The doc config fily ``conf.py`` adds the content of ``links.txt`` to every
page so you can refer to links (like `Sphinx`_) from this file everywhere.

The config also adds some dynamic links and parameterized external refs which
can include, for example, a version number, so you can link to the correct
version |examples-version| of :ex:`lifted/FirstExample` in the
`Slick Examples`_ project (note the version number in this text and in both
links).

Code
----

You can add Scala code snippets to your documentation. Here are the imports
from our own *Snippet* app under ``src/sphinx/code``:

.. includecode:: code/Snippet.scala#imports

And here's some more code from the same file, concatenating two sections with
the same name:

.. includecode:: code/Snippet.scala#usage

Code snippets can be tested by adding unit tests for them under ``src/doctest``.
You can run them in sbt with ``doctest:test``. For convenience, this project
uses its own ``RecordedTest`` class to compare the console output of a unit
test to a previously recorded log (like *partest* does).

Other parameterized links
-------------------------

You can also set up ``conf.py`` for easy linking to various bug trackers
(as in :issue:`41` or :ticket:`1`).

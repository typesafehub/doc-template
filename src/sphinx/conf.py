# -*- coding: utf-8 -*-
#
# Documentation config
#

import sys, os

sys.path.append(os.path.abspath('exts'))
highlight_language = 'scala'
extensions = ['sphinx.ext.extlinks', 'includecode']
templates_path = ['_templates']
source_suffix = '.rst'
master_doc = 'index'
exclude_patterns = []
pygments_style = 'sphinx'
html_theme = 'sphinxdoc'
html_static_path = ['static']


# These settings should ideally come from sbt so that we don't have to duplicate them here

project = u'Doc-Example'
copyright = u'2011-2012 Typesafe, Inc.'
version = '0.1-SNAPSHOT'
release = '0.1-SNAPSHOT'
htmlhelp_basename = "doc-example"


# Custom set-up

#slick_examples_version = version
slick_examples_version = "0.11.0"

# e.g. :issue:`36` :ticket:`8`
extlinks = {
  'issue': ('https://github.com/slick/slick/issues/%s', 'issue #'),
  'ticket': ('https://www.assembla.com/spaces/typesafe-slick/tickets/%s', 'ticket #'),
  'ex': ('https://github.com/slick/slick-examples/blob/'+slick_examples_version+'/src/main/scala/scala/slick/examples/%s.scala', 'Slick example ')
}

rst_epilog = '''
.. include:: %(links)s
.. _Slick Examples: https://github.com/slick/slick-examples/tree/%(examples-version)s
.. |examples-version| replace:: %(examples-version)s
''' % {
  'links': os.path.abspath('links.txt'),
  'examples-version': slick_examples_version
}

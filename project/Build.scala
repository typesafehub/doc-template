import sbt._
import Keys._
import Tests._
import com.jsuereth.sbtsite.SphinxSupport.Sphinx
import com.jsuereth.sbtsite.SitePlugin.site

object DocExampleBuild extends Build {

  /* Project Definition */
  lazy val root = Project(id = "doc-example", base = file("."),
    settings = Project.defaultSettings ++ site.settings ++ site.sphinxSupport() ++ Seq(
      scalacOptions in doc <++= (version).map(v => Seq("-doc-title", "Doc Example", "-doc-version", v)),
      includeFilter in Sphinx := ("*.html" | "*.png" | "*.js" | "*.css" | "*.gif" | "*.txt"),

      // Workaround for sbt bug: Without a testGrouping for all test configs,
      // the wrong tests are run
      testGrouping <<= definedTests in Test map partitionTests,
      testGrouping in DocTest <<= definedTests in DocTest map partitionTests

    )).configs(DocTest).settings(inConfig(DocTest)(Defaults.testSettings): _*).settings(
    unmanagedSourceDirectories in DocTest <+= baseDirectory { _ / "src/sphinx/code" }
    //resourceDirectory in DocTest <<= baseDirectory { _ / "src/test/resources" }

    // Make the "test" command run both, test and doctest:test
    //test <<= Seq(test in Test, test in DocTest).dependOn
  )

  /* Test Configuration for running tests on doc sources */
  lazy val DocTest = config("doctest") extend(Test)

  // A dummy partitioning scheme for tests
  def partitionTests(tests: Seq[TestDefinition]) = {
    Seq(new Group("inProcess", tests, InProcess))
  }
}

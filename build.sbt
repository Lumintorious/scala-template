name := "simple-app"
version := "0.0.0"
scalaVersion := "3.0.0-RC1"

def root = baseDirectory
def libs = libraryDependencies
def args = scalacOptions

Compile / scalaSource := root.value / "source"
Test    / scalaSource := root.value / "source-test"

Compile / resourceDirectory := root.value / "resources"
Test    / resourceDirectory := root.value / "resources"

args += "-language:implicitConversions"
args += "-Yindent-colons"
args += "-Yexplicit-nulls"

libs += ModuleID("com.github.pathikrit", "better-files_2.13", "3.9.1")
libs += ModuleID("org.scala-lang.modules", "scala-swing_2.13", "3.0.0")
libs += ModuleID("org.typelevel", "cats-core_2.13", "2.3.0-M2")
libs += ModuleID("org.typelevel", "cats-effect_2.13", "3.0-8096649")

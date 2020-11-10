name := "socketapp"
version := "0.1.0"
scalaVersion := "3.0.0-M2-bin-20201108-3938388-NIGHTLY"

Compile / scalaSource := baseDirectory.value / "source-scala"
Test    / scalaSource := baseDirectory.value / "source-scala-test"

scalacOptions ++= List(
	"-language:implicitConversions",
	"-Yindent-colons",
	"-Yexplicit-nulls"
)

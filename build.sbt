name := "simple-app"
version := "0.0.0"
scalaVersion := "3.0.0-M2-bin-20201108-3938388-NIGHTLY"

Compile / scalaSource := baseDirectory.value / "source"
Test    / scalaSource := baseDirectory.value / "source-test"

scalacOptions ++= Seq(
	"-language:implicitConversions",
	"-Yindent-colons",
	"-Yexplicit-nulls"
)

libraryDependencies ++= Seq(
	ModuleID("com.github.pathikrit", "better-files_2.13", "3.9.1"), // Scala Files
	ModuleID("org.typelevel", "cats-core_2.13", "2.3.0-M2"), // Cats Core
	ModuleID("org.typelevel", "cats-effect_2.13", "3.0-8096649") // Cats Effect
)

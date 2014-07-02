import android.Keys._

name := "$name$"

scalaVersion := "$scala_version$"

versionCode := Some(0)

versionName := Some("0.1")

android.Plugin.androidBuild

libraryDependencies ++= Seq(
//  "com.netflix.rxjava" % "rxjava-core" % "latest.integration",
//  "com.netflix.rxjava" % "rxjava-scala" % "latest.integration" intransitive(),
//  "com.netflix.rxjava" % "rxjava-android" % "latest.integration" intransitive(),
  "org.macroid" %% "macroid" % "2.0.0-M1"
)
name := "cstring_experiment_1"
enablePlugins(ScalaNativePlugin)

scalaVersion := "2.11.12"
scalacOptions ++= Seq("-feature")
nativeMode := "debug"
nativeGC := "immix"

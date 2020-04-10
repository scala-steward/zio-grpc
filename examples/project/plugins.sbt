resolvers += "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"

addSbtPlugin("com.thesamet" % "sbt-protoc" % "0.99.31")

addSbtPlugin("org.scalameta" % "sbt-scalafmt" % "2.3.3")

libraryDependencies += "com.thesamet.scalapb" %% "compilerplugin" % "0.10.2"

libraryDependencies += "com.thesamet.scalapb.zio-grpc" %% "zio-grpc-codegen" % "0.2.0"

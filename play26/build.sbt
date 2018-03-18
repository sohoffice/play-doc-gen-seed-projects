resolvers += Resolver.bintrayIvyRepo("sohoffice", "sbt-plugins")

name := """play26"""
organization := "com.example"

version := "1.0-SNAPSHOT"

lazy val root = (project in file("."))
  .enablePlugins(PlayScala, DocExtractPlugin, SwaggerPlugin)

scalaVersion := "2.12.3"

libraryDependencies ++= Dependencies.ALL

// Adds additional packages into Twirl
//TwirlKeys.templateImports += "com.example.controllers._"

// Adds additional packages into conf/routes
// play.sbt.routes.RoutesKeys.routesImport += "com.example.binders._"

swaggerDomainNameSpaces := Seq("io")
swaggerDescriptionFile := docExtractTargetFile.value.right.toOption
swagger := swagger.dependsOn(docExtract).value

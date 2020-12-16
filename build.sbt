name := "SparkMX"

version := "0.1"

scalaVersion := "2.11.12"


libraryDependencies ++= {
  val sparkV = "2.4.7"
  Seq(
    "org.apache.spark" %% "spark-core" % sparkV,
    "org.apache.spark" %% "spark-sql" % sparkV
  )
}
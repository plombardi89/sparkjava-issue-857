package io.datawire.example


import spark.Spark.*

fun main(args: Array<String>) {
  port(5001)

  post("/") { req, res ->
    val body = req.body()
    println("BODY (Kotlin) => " + body)

    throw Error("A very bad error has occurred.")

    res.header("Content-Type", "text/plain")
    body
  }

  println("Kotlin version running on: ${port()}")
}
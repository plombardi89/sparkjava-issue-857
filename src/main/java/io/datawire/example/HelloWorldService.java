package io.datawire.example;


import static spark.Spark.*;

public class HelloWorldService {

  public static void main(String... args) throws Exception {
    port(5000);

    post("/", (req, res) -> {
      String body = req.body();
      System.out.println("BODY (Java) => " + body);

      if (true) { // wrapped because can't compile due to later unreachable statements
        throw new Error("A very bad error has occurred.");
      }

      res.header("Content-Type", "text/plain");
      return body;
    });

    System.out.println("Java version running on: " + port());
  }
}

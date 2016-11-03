package com.abased.example
import doobie.imports._
/**
  * Created by nickdeyoung on 11/3/16.
  */
case class myClass(myval:Int)

class IntellijExample extends App {
  /**
    * Intellij 2016.2.* shows 'sql' as 'red' i.e. it cannot infer sql from doobie.imports._
    * Intellij EAP 2016.3 fixes this and sql is not red
    */
  val s = sql"""Hello from Doobie"""

  /**
    * Intellij EAP 2016.3 shows 'query' as red, because the 'type' of s is 'Any'
    * if you run the scala worksheet IntellijDoobie.sc in this same package
    * the REPL shows the class as:
    *
    * s: doobie.syntax.string.Builder[shapeless.HNil] = doobie.syntax.string$Builder@5b263a42
    *
    */
  s.query[myClass].list

}

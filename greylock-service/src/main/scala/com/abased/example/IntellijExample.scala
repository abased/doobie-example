package com.abased.example

/**
  * Created by nickdeyoung on 11/3/16.
  */

case class Node(id:String, label:String, edges:List[Edge])
case class Edge(from:Node, to:Node, label:String)
case class Graph(nodes:List[Node], edges:List[Edge])
case class MyGraphConfig(graph: Graph)


object IntellijExample extends App {


  import classy.generic._

  import classy.config._
  import com.typesafe.config.{ Config, ConfigFactory }


  // can I make a decoder for my graph?
  val decoder1: ConfigDecoder[MyGraphConfig] = deriveDecoder[Config, MyGraphConfig]

//
//  val stringXwhichLookslikeJSONButIsnt = "mine = [ { myval:0, neighbor: { myval: 9, neighbor: null }} ]"
//  val rawConfig = ConfigFactory.parseString(stringXwhichLookslikeJSONButIsnt)
//  val decoded = decoder1(rawConfig)
//
//  decoded match {
//    case Left(err) =>
//      println(err)
//    case Right(MyConfig(mines)) =>
//      println(mines)
//  }


  ()






}

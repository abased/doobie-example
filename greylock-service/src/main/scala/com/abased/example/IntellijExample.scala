package com.abased.example

import classy.generic._
import classy.config._
import com.typesafe.config.{ Config, ConfigFactory }

case class Node(id:String, label:String, edges:List[Edge])
case class Edge(from:Node, to:Node, label:String)
case class Graph(nodes:List[Node], edges:List[Edge])
case class MyGraphConfig(graph: Graph)

/**
  * Created by nickdeyoung on 11/3/16.
*/
object IntellijExample extends App {

  // can I make a decoder for my graph, which has self referencing classes?
  val decoder1: ConfigDecoder[MyGraphConfig] = deriveDecoder[Config, MyGraphConfig]

}

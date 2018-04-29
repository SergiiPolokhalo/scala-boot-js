package com.example.demo

case class SomeClass(name:String)

object Fabric {
  def apply() = SomeClass("Empty")
  def apply(name:String) = SomeClass(name)
  def apply(id:Int) = SomeClass(id.toString)
} 

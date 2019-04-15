package org.crashstar.scala

import org.junit.runner.RunWith

import collection.mutable.Stack
import org.scalatest._
import org.scalatest.junit.JUnitRunner
import org.slf4j.{Logger, LoggerFactory}

import scala.collection.mutable


class StackSpec extends FlatSpec {

  val log : Logger = LoggerFactory.getLogger(classOf[StackSpec])

  log.info("#################### BEGIN TEST: StackSpec ####################")

  "A Stack" should "pop values in last-in-first-out order" in {
    log.debug("Begin method")
    var list = List.empty[Int]
    list = 1 :: list
    list = 2 :: list
    //stack.push(1)
    //stack.push(2)
    assert(list.head === 2)
    list = list.tail
    assert(list.head === 1)
    log.debug("First logging with logback")
  }

  it should "throw NoSuchElementException if an empty stack is popped" in {
    val emptyList = List.empty[Int]
    assertThrows[NoSuchElementException] {
      emptyList.head
    }
  }
}
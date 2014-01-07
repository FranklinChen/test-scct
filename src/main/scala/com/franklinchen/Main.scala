package com.franklinchen

object Main extends App {
  def isEven(i: Int) = {
    if (i % 2 == 0) {
      true
    } else {
      false
    }
  }

  println(s"hello, ${isEven(args.length)}")
}

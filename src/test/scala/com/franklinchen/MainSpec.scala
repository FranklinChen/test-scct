package com.franklinchen

import org.specs2._

class MainSpec extends Specification { def is = s2"""
  Main

    ${Main.isEven(5) must beFalse}
  """
}

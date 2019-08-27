package object random {
  private var seed: Int = 0
  private val a = 1664525
  private val b = 1013904223
  private val n = 32

  def nextInt(): Int = {
    seed = (seed * a + b % (1L << 32)).toInt
    if (seed <  0) ~seed else seed
  }

  def nextDouble(): Double = {
    nextInt() / Double.MaxValue
  }

  def setSeed(seed: Int): Unit = {
    this.seed = seed
  }
}

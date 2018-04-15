class Point(var x: Int, var y: Int = 0) {

  def move(dx: Int, dy: Int): Unit = {
    x = x + dx
    y = y + dy
  }

  override def toString: String = {
    s"($x, $y)"
  }

  //  基本コンストラクタ以外のコンストラクタを定義する場合は、 def this(...) で定義する。
  //  補助コンストラクタは、必ず始めに基本コンストラクタを呼ばないといけない。
  def this(str:String) {
    this(x = 1)
    println("after basic constructor" + x)
  }


}


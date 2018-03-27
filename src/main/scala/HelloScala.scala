class HelloScala {

  def hoge: String = ""

  // デフォルトコンストラクタでの処理はクラス内に直接記載すればよい。
  // インスタンス化のタイミングで実行される。
  println("create SimpleClass")

  //  基本コンストラクタ以外のコンストラクタを定義する場合は、 def this(...) で定義する。
  //  補助コンストラクタは、必ず始めに基本コンストラクタを呼ばないといけない。
  def this(str: String) {
    this()
    println("after basic constructor" + hoge)
  }

  // method definition
  def sayHello(something: String): Unit = {
    println("hello, " + something + "!!");
  }

}

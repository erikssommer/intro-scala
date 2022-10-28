object Foo {
  lazy val initialState = 42
  lazy val start: Int = Bar.initialState
}

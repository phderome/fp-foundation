package toimpl.types

import exercises.types.{Cardinality, IntOrBoolean, Iso, IntAndBoolean}

trait TypeToImpl {

  val boolean: Cardinality[Boolean]

  val unit: Cardinality[Unit]

  val byte: Cardinality[Byte]

  val int: Cardinality[Int]

  val optUnit: Cardinality[Option[Unit]]

  val optBoolean: Cardinality[Option[Boolean]]

  val intOrBoolean: Cardinality[IntOrBoolean]

  val boolUnit: Cardinality[(Boolean, Unit)]

  val boolByte: Cardinality[(Boolean, Byte)]

  val intAndBoolean: Cardinality[IntAndBoolean]

  val listUnit: Cardinality[List[Unit]]

  val string: Cardinality[String]

  val nothing: Cardinality[Nothing]

  val optNothing: Cardinality[Option[Nothing]]

  val boolNothing: Cardinality[(Boolean, Nothing)]

  val any: Cardinality[Any]

  def option[A](a: Cardinality[A]): Cardinality[Option[A]]

  def list[A](a: Cardinality[A]): Cardinality[List[A]]

  def either[A, B](a: Cardinality[A], b: Cardinality[B]): Cardinality[Either[A, B]]

  def tuple2[A, B](a: Cardinality[A], b: Cardinality[B]): Cardinality[(A, B)]

  def func[A, B](a: Cardinality[A], b: Cardinality[B]): Cardinality[A => B]

  def aUnitToA[A]: Iso[(A, Unit), A]

  def aOrNothingToA[A]: Iso[Either[A, Nothing], A]

  def optionToEitherUnit[A]: Iso[Option[A], Either[Unit, A]]

  def power1[A]: Iso[Unit => A, A]

  def distributeTuple[A, B, C]: Iso[(A, Either[B, C]), Either[(A, B), (A, C)]]

}


object pouringTests {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(66); 
  println("Welcome to the Scala worksheet");$skip(41); 
  val problem = new Pouring(Vector(4,6));System.out.println("""problem  : Pouring = """ + $show(problem ));$skip(16); val res$0 = 
  problem.moves;System.out.println("""res0: scala.collection.immutable.IndexedSeq[Product with Serializable with pouringTests.problem.Move] = """ + $show(res$0));$skip(22); val res$1 = 
  problem.solution(3);System.out.println("""res1: Stream[pouringTests.problem.Path] = """ + $show(res$1))}
}

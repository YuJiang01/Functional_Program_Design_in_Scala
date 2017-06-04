package streams

/*object BloxorzTest{

println("hello")

val level =
        """ST
          |oo
          |oo""".stripMargin
  val vector: Vector[Vector[Char]] =
    Vector(level.split("\n").map(str => Vector(str: _*)): _*)


	
   //val terrain: Terrain = terrainFunction(vector)
   /*val startPos: Pos = findChar('S', vector)
   val goal: Pos = findChar('T', vector)*/

}*/

class test1 extends StringParserTerrain{

}

object test3 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(507); 
	val level =
        """ST
          |oo
          |oo""".stripMargin;System.out.println("""level  : String = """ + $show(level ));$skip(98); 
	val vector: Vector[Vector[Char]] =
    Vector(level.split("\n").map(str => Vector(str: _*)): _*);System.out.println("""vector  : Vector[Vector[Char]] = """ + $show(vector ));$skip(23); 
	val test2 = new test1;System.out.println("""test2  : streams.test1 = """ + $show(test2 ));$skip(45); 
	val terrain = test2.terrainFunction(vector);System.out.println("""terrain  : streams.test3.test2.Pos => Boolean = """ + $show(terrain ));$skip(44); 
	val startPos = test2.findChar('S', vector);System.out.println("""startPos  : streams.test3.test2.Pos = """ + $show(startPos ));$skip(40); 
	val goal = test2.findChar('T', vector);System.out.println("""goal  : streams.test3.test2.Pos = """ + $show(goal ))}
}

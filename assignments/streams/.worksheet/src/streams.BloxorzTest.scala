package streams

object BloxorzTest {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(56); 

	println("hello")
	
/* object InfiniteLevel extends Solver with StringParserTerrain{
    val level =
      """------
        |--ST--
        |--oo--
        |--oo--
        |------""".stripMargin
          
    //val startBlock = Block(Pos(1,1),Pos(1,1))
    val secondBlock = Block(Pos(2,2),Pos(3,2))
    val thirdBlock = Block(Pos(2,3),Pos(3,3))
    val history = List[Move](Down,Right)
    
  }


import InfiniteLevel._

InfiniteLevel.startBlock.legalNeighbors
InfiniteLevel.terrain(InfiniteLevel.startPos)

InfiniteLevel.goal

InfiniteLevel.neighborsWithHistory(InfiniteLevel.startBlock,InfiniteLevel.history).head

val nei = InfiniteLevel.neighborsWithHistory(InfiniteLevel.thirdBlock,InfiniteLevel.history)


val newNei = InfiniteLevel.newNeighborsOnly(nei,Set(InfiniteLevel.startBlock,InfiniteLevel.secondBlock))


//val allPath = InfiniteLevel.pathsFromStart

//allPath.tail

val initial = Stream((startBlock,List[Move]()))
  initial.tail
                                                  
val explored = Set(startBlock)

newNeighborsOnly(neighborsWithHistory(initial.head._1,initial.head._2),explored)
val newExplored = explored ++ initial.head._1.legalNeighbors.map(x=>x._1)




val newPaths = initial #::: newNeighborsOnly(neighborsWithHistory(initial.head._1,initial.head._2),explored)


 newPaths.tail

newPaths.tail.tail

//from(initial #::: newPaths,newExplored)


from(initial,explored)


    




InfiniteLevel.solution
*/

/**
   * A level constructed using the `InfiniteTerrain` trait which defines
   * the terrain to be valid at every position.
   */
  object InfiniteLevel extends Solver with InfiniteTerrain {
    val startPos = Pos(1,3)
    val goal = Pos(5,8)
  };$skip(1701); val res$0 = 

InfiniteLevel.pathsFromStart;System.out.println("""res0: Stream[(streams.BloxorzTest.InfiniteLevel.Block, List[streams.BloxorzTest.InfiniteLevel.Move])] = """ + $show(res$0));$skip(35); 

  println(InfiniteLevel.solution)

  /**
   * A simple level constructed using the StringParserTerrain
   */
  abstract class Level extends Solver with StringParserTerrain

  object Level0 extends Level {
    val level =
      """------
        |--ST--
        |--oo--
        |--oo--
        |------""".stripMargin
  };$skip(314); 

  println(Level0.solution)

  /**
   * Level 1 of the official Bloxorz game
   */
  object Level1 extends Level {
    val level =
      """ooo-------
        |oSoooo----
        |ooooooooo-
        |-ooooooooo
        |-----ooToo
        |------ooo-""".stripMargin
  };$skip(270); 

  println(Level1.solution)}
}

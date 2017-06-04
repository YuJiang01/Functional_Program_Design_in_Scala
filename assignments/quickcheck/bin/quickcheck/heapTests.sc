package quickcheck

object heapTests {
	
	println("test")                           //> test
	class tests extends BinomialHeap with IntHeap{
	}
	object heapTest1 extends tests {
	
	}
	
	import heapTest1._
	
	heapTest1.empty                           //> res0: scala.collection.immutable.Nil.type = List()
	val h1 = insert(5,empty)                  //> h1  : quickcheck.heapTests.heapTest1.H = List(Node(5,0,List()))
	
	val h2 = insert(4,h1)                     //> h2  : quickcheck.heapTests.heapTest1.H = List(Node(4,1,List(Node(5,0,List())
                                                  //| )))
  val h3 = insert(8,h2)                           //> h3  : quickcheck.heapTests.heapTest1.H = List(Node(8,0,List()), Node(4,1,Lis
                                                  //| t(Node(5,0,List()))))
                                                  
 findMin(h2)                                      //> res1: quickcheck.heapTests.heapTest1.A = 4
 
 findMin(h3)                                      //> res2: quickcheck.heapTests.heapTest1.A = 4
 
 
 val test2 = new QuickCheckHeap with quickcheck.test.Bogus1BinomialHeap
                                                  //> test2  : quickcheck.QuickCheckHeap with quickcheck.test.Bogus1BinomialHeap =
                                                  //|  Prop

}
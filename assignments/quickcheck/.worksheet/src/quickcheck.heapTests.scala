package quickcheck

object heapTests {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(57); 
	
	println("test")
	class tests extends BinomialHeap with IntHeap{
	}
	object heapTest1 extends tests {
	
	}
	
	import heapTest1._;$skip(131); val res$0 = 
	
	heapTest1.empty;System.out.println("""res0: scala.collection.immutable.Nil.type = """ + $show(res$0));$skip(26); 
	val h1 = insert(5,empty);System.out.println("""h1  : quickcheck.heapTests.heapTest1.H = """ + $show(h1 ));$skip(25); 
	
	val h2 = insert(4,h1);System.out.println("""h2  : quickcheck.heapTests.heapTest1.H = """ + $show(h2 ));$skip(24); 
  val h3 = insert(8,h2);System.out.println("""h3  : quickcheck.heapTests.heapTest1.H = """ + $show(h3 ));$skip(64); val res$1 = 
                                                  
 findMin(h2);System.out.println("""res1: quickcheck.heapTests.heapTest1.A = """ + $show(res$1));$skip(15); val res$2 = 
 
 findMin(h3);System.out.println("""res2: quickcheck.heapTests.heapTest1.A = """ + $show(res$2));$skip(76); 
 
 
 val test2 = new QuickCheckHeap with quickcheck.test.Bogus1BinomialHeap;System.out.println("""test2  : quickcheck.QuickCheckHeap with quickcheck.test.Bogus1BinomialHeap = """ + $show(test2 ))}

}

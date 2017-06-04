package quickcheck

import common._

import org.scalacheck._
import Arbitrary._
import Gen._
import Prop._

abstract class QuickCheckHeap extends Properties("Heap") with IntHeap {

  lazy val genHeap: Gen[H] = oneOf(
    const(empty),
    for{
        v<-arbitrary[Int]    
        m<-genHeap
      } yield insert(v,m)
 )
  
  implicit lazy val arbHeap: Arbitrary[H] = Arbitrary(genHeap)

  
  property("gen1") = forAll { (h: H) =>
    val m = if (isEmpty(h)) 0 else findMin(h)
    findMin(insert(m, h)) == m
  }
  
  
     
property("gen3") =  forAll { (h1: H,h2:H) =>
    if(!isEmpty(h1) && !isEmpty(h2)) {
      val m = findMin(h1)
      val n = findMin(h2)
      val res = if(ord.lteq(n,m)) n else m
      val res2 = if(ord.lteq(res,1)) res else 1
      val res3 = if(ord.lteq(res-1,0)) res-1 else 0
      val dat = meld(meld(insert(res2,empty),h1),insert(res3,h2))
      findMin(deleteMin(dat)) == res2
    }else true
      
  }


}

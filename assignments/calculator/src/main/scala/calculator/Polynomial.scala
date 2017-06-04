package calculator

object Polynomial {
  def computeDelta(a: Signal[Double], b: Signal[Double],
      c: Signal[Double]): Signal[Double] = {
    Signal(
     b() *b() - 4*a()*c() 
    )
    }
  

  def computeSolutions(a: Signal[Double], b: Signal[Double],
      c: Signal[Double], delta: Signal[Double]): Signal[Set[Double]] = {
    Signal{
      if(delta() <0 ) Set.empty
      else{
        val v2 = math.sqrt(delta())/(2*a())
        val v1 = 0 - b()/(2*a())
        Set(v1-v2,v1+v2)
      }
      
      
    
    }
  }
}

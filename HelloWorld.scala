

object HelloWorld {
     val str1 : String = "baceb";
     
     val arr: Array[Int] = new Array[Int](str1.length());
     val brr: Array[Int] = new Array[Int](str1.length());
     
     
  
  def main(args: Array[String])  {
        
    for( i <- 0 to str1.length()-1)
    {
      if( i==0 )
      {
        arr(i) = str1.length();
      }
       
      else
      {
        
        arr(i) = (str1.length()-i)+ arr(i-1)-i;
      }
      
      
    }
    
    var sum = 0;
    for( i <- 0 to str1.length()-1)
    {
      val ch = str1.charAt(i);
      if (ch == 'a' || ch == 'e' || ch == 'i'
                || ch == 'o' || ch == 'u') 
         
        
                sum += arr(i);
      
     }
    
    println(sum);
    
    
    
    
}}
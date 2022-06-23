class Solution {
    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        Set <Integer > set = new HashSet<>();
        // if one of the method return false then not of false will be true and it will return false 
        if(!helpeMe(p1,p2,set) || !helpeMe(p1,p3,set) || !helpeMe(p1,p4,set) || !helpeMe(p2,p3,set) || !helpeMe(p2,p4,set) || !helpeMe(p3,p4,set)){
            return false ;
        }
         return set.size()== 2 ? true:false;
        
        
    }
      boolean helpeMe( int[]s , int[]e , Set<Integer> set ){
            if((s[0] == e[0]) && ( s[1] == e[1])){
                return false ;
            }
            int dx = s[0] - e[0];// to get the difference of x coordinates 
            int dy = s[1] - e[1]; //to get difference of y coordinates 
            int dist = dx*dx + dy*dy ; // dist*dist= (x2 - x1)(x2 - x1) + (y2 - y1)(y2 - y1)
            set.add(dist*dist);
            return true ;
        }
}

//   p1  .-------. p2
//       | +
//       |   +  
//       |     +        two point can only have two distance one diagonally or side by size so set will only have 
//   p3  .       . p4   two values as all sides and diagonals of square are equal 
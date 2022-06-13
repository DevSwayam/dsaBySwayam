class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
      List< Integer > res = new ArrayList(); // intialising list
        
        if(matrix.length == 0){ 
            return res ;
        }
        int rowBegin = 0 ; // intialising 
        int rowEnd = matrix.length -1 ; // intialising 
        int columnBegin = 0 ; // intialising 
        int columnEnd = matrix[0].length - 1; // intialising 
        while(rowBegin <= rowEnd && columnBegin <= columnEnd){ // intialising 
            
            for(int i = columnBegin ; i <= columnEnd ; i++){ // for adding first row in list 
                res.add(matrix[rowBegin][i]);
            }
            rowBegin ++ ; // move to 2nd row 
            
            for(int i=  rowBegin ; i <= rowEnd ; i++ ){ // adding last column in list 
                res.add(matrix[i][columnEnd]);
            }
            columnEnd -- ; // move to 2nd column 
            if(rowBegin <= rowEnd){
                for(int i = columnEnd ; i >= columnBegin ; i--){ // for adding last row elements 
                    res.add(matrix[rowEnd][i]);
                }
            }
            rowEnd -- ; // for adding 1st column elent of second row 
            if(columnBegin <= columnEnd){
                for(int i = rowEnd ; i >= rowBegin ; i--){
                    res.add(matrix[i][columnBegin]);
                }
            }
            columnBegin++; // middle ekement will be same 
        }
        return res;
    }
}
class Solution {
public:
    void setZeroes(vector<vector<int>>& matrix) {
        int m = matrix.size(); // get the size of row
        int n = matrix[0].size();// get the size of column 
        int x = 1; // to convert the 1st row 
        int y = 1 ; // to convert 1st column 
        for( int j = 0 ;  j < n ; j++ ){ // for loop to iterate for 0th row and all columns 
            if(matrix[0][j] == 0){ // if i found a zero in 0th row i will use x as a mark for letter use 
                x = 0 ;
            }
        }
          for( int i = 0 ;  i < m ; i++ ){ // for loop to iterate for 0th column and all rows  
            if(matrix[i][0] == 0){ // if i found a zero in 0th column i will use y as a mark for letter use
                y = 0 ;
            }
          }
         // then as th method we will solve the [m-1][n-1] matrix means for 4 by4 we will solve 3 by 3 matrx 
              for(int i = 1; i < n ; i++ ){ // start from 1st row till end 
                  for (int j = 1 ; j < m ; j++ ){ // start from 1st column till end 
                      if(matrix[i][j] == 0){ // if we found any 0 we just have to mark
                          matrix [0][j] = 0; // marking on 1st row 
                          matrix [i][0] = 0; // marking on 1st column 
                      }
                  }
              }
        // then with the help of markings we just have to update 3 by 3 matrix for rows 
              for( int j = 1 ; j <n ; j++){ 
                  if (matrix [0][j] == 0 ){ // if their is mark on any element on 0th row 
                      for (int i = 1 ; i < m; i++){ 
                          matrix[i][j] = 0 ; // then all the columns and rown of that index will be marked zero 
                      }
                  }
              }
        // then with the help of markings we just have to update 3 by 3 matrix for columns 
               for(int i= 1 ; i< m ;i++){
                  if (matrix [i][0] == 0 ){ // if their is mark on any element on 0th column  
                      for (int j = 1 ; j < n; j++){
                          matrix[i][j] = 0 ;  // then all the columns and rown of that index will be marked zero
                      }
                  }
              }
         // and with the help of x and y we will update our referrence array 
              if(x == 0){
                  for(int j = 0 ; j< n ; j++){
                      matrix[0][j] = 0;
                  }
              }
          if(y == 0){
                  for(int i = 0 ; i< m ; i++){
                      matrix[i][0] = 0;
                  }
              }
        }
    };

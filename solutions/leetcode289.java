class Solution {
     
    public void gameOfLife(int[][] board) {
        int [][] dir = new int [][]{{-1,-1} , {-1,0} , {-1,1} , {0,-1} ,{0,1} , {1,-1} , {1,0} , {1,1}}; // [ -1,-1  -1,0  -1,1  ]
        int m =  board.length , n = board[0].length;                                                     // [ 0,-1     x    0,1  ]
                                                                                                         // [ 1,-1    1,0   1,1  ]           
        for(int i = 0 ; i < m; i++){                                                                    //for refernce to x we have to acces all elements 
            for(int j = 0 ; j < n ; j++){                                                               // to get to those points we will use this matrix 
                int count = 0;                                                                          // after  adding we will get to  that index
                for(int[] d:dir){ // for every element in direction array                               
                    int p = i + d[0]; // we will get all directions 
                    int q = j + d[1]; 
                    if(p >= 0 && p<m && q>= 0 && q<n && (board[p][q] == 1 || board[p][q] == 2)){ // if p or q is out of bonds of matrix and if it is alue then  count ++ 
                        count++ ;
                    }
                }
                // 2 alive -> dead 
                if(board[i][j] == 1){ // make alive dead according to conition 
                    if(count < 2 || count >3){ 
                        board[i][j] = 2 ;
                    }
                }
                // 3 dead -> alive 
                else{ // make dead alive according to condition 
                    if(count == 3){
                        board[i][j] = 3 ;
                    }
                }
            }
        }
        
        for(int i = 0; i< m ; i++){ 
            for(int j = 0 ; j< n ; j++){
                board[i][j] %= 2 ; // by modular operator 3 means dead -> to alive 3%2 1 means alive 
                                   //by modular operator 2 eans alive t dead 2%2 is 0 means dead 

            }
        }
    }
}

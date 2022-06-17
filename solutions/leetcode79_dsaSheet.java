class Solution {
    static boolean[][] visited;
    public boolean exist(char[][] board, String word) {
        int rows = board.length ;  
        int columns = board[0].length ;
        visited = new boolean[rows][columns]; // to check whether we have already visited this chaRACTER OR NOT  
        for(int i = 0; i< rows ; i++){ // to visit rows 
            for( int j = 0; j<columns ; j++){ // to visit columns 
                if(word.charAt(0) == board[i][j] && searchWord(i , j , 0 , word , board)){ //if we gEt our first character then call searching method form remaining chARACTERS 
                    return true ;
                }
            }
        }
        return false;
    }
    
    public boolean searchWord(int i , int j ,  int index , String word , char[][] board){
        
        if(index == word.length()){ // if we have already traversed the whole array then return true 
            return true ;
        }
        
        if( i < 0 || i >= board.length || j < 0 || j >= board[i].length || word.charAt(index) != board[i][j] || visited[i][j]){
            return false ; // condition check 
        }
        
        visited[i][j] = true ; // after checking set it to true 
        if(searchWord(i+1 , j , index+1 , word , board ) || // if we get the next character in adjecent elements above or below then return true 
           searchWord(i-1 , j , index+1 , word , board ) ||
           searchWord(i , j+1 , index+1 , word , board ) ||
           searchWord(i , j-1 , index+1 , word , board ) ){
            return true ; 
        }
        visited[i][j] = false ; // if we didnt get the character then make it false so that we can check it again 
        return false ; // return false that we didnt get the character 
    }
}
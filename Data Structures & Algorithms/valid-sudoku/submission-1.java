class Solution {
  public boolean isValidSudoku(char[][] board) {
        HashSet numsHash1= new HashSet();
         for(int i=0 ; i<9 ; i++){
              for(int j=0 ; j<9 ; j++){
                    if(board[i][j]=='.') continue;
                    if(numsHash1.add(board[i][j])==false ){
                    return false;
              }
                   
         }
          numsHash1.clear();
         }
            for(int i=0 ; i<9 ; i++){
                   for(int j=0 ; j<9 ; j++){
                    if(board[j][i]=='.') continue;
                    if(numsHash1.add(board[j][i])==false ){
                    return false;
                    }
                    }
                                        numsHash1.clear();
              }
              for(int k=0; k<9; k++){
                int a = (k / 3) * 3;  
                int b = (k % 3) * 3;  
    
                  for(int i=a ; i<a+3 ; i++){
                   for(int j=b ; j<b+3 ; j++){ 
                    if(board[i][j]=='.') continue;
                    if(numsHash1.add(board[i][j])==false ){
                    return false;
                    }
                    }
                                       
                  } 
                numsHash1.clear();
              }
         return true; 
    }
}

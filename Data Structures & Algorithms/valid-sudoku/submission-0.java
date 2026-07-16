class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character>[] rows=new HashSet[9];
        HashSet<Character>[] columns=new HashSet[9];
        HashSet<Character>[] boxes=new HashSet[9];
        for(int i=0;i<9;i++){
            rows[i]=new HashSet<Character>();
            columns[i]=new HashSet<Character>();
            boxes[i]=new HashSet<Character>();
        }
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                int box = (i / 3) * 3 + (j / 3);
                if(board[i][j]=='.')continue;
                char value=board[i][j];
                if(rows[i].contains(value)) return false;
                if(columns[j].contains(value)) return false;
                if(boxes[box].contains(value)) return false;
                rows[i].add(value);
                columns[j].add(value);
                boxes[box].add(value);
            }
        }
        
        
    return true;}
}

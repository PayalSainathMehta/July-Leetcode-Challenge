
public class WordSearch {
	static boolean[][] visited;
    public static boolean exist(char[][] board, String word) {
    	if(board.length == 0)
    		return false;
        int rows = board.length;
        int cols = board[0].length;
        visited = new boolean[rows][cols];
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(word.charAt(0) == board[i][j] && search(board, i, j, word, 0))
                    return true;
            }
        }
        return false;
    }
    
    public static boolean search(char[][] board, int i, int j, String word, int index){
        if(index == word.length())
            return true;
        if(i < 0 || j < 0 || i == board.length || j == board[0].length || board[i][j] != word.charAt(index) || visited[i][j])
            return false;
        
        visited[i][j] = true;
        
        if(search(board, i, j + 1, word, index + 1) || 
          search(board, i + 1, j , word, index + 1) || 
          search(board, i, j - 1, word, index + 1) || 
          search(board, i - 1, j, word, index + 1))
            return true;
        visited[i][j] = false;
        return false;
    }
    
    public static void main(String[] args) {
    	char[][] board = {{'A','B','C','E'},{'A','C','D','E'}};
    	String word = "ABCD";
		System.out.println(exist(board, word));
	}
}

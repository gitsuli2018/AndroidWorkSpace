package app.sziva.com.aknakereso;


public class MyGame
{
    private int row             ;
    private int column          ;
    private int[][]  game       ;
    private boolean[][]  visible    ;
    public MyGame(int row, int column)
    {
        init();
    }
    private void init()
    {
        this.row        = row                       ;
        this.column     = column                    ;
        game            = new int[row][column]      ;
        visible         = new boolean[row][column]  ;
        for (int i = 0 ; i < row ; i++)
        {
            for (int j = 0 ; j < column ; j++)
            {
                game[i][j] = 0 ;
                visible[i][j] = false ;
            }
        }
    }
    public int getGame(int _row, int _column)
    {
        return game[_row][_column] ;
    }
    public boolean getVisible(int _row, int _column)
    {
        return visible[_row][_column] ;
    }
}

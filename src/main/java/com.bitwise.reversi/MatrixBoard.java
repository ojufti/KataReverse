/**
 * Created by niteshs on 7/22/2016.
 */
public class MatrixBoard {
    private final int length;
    private final int breadth;
    String [][]array;


    public MatrixBoard(int length, int breadth)
    {
        this.length=length;
        this.breadth=breadth;
        array= new String[length][breadth]  ;
    }

    public void boardSize()
    {   if(length>2 && breadth>2)
    {
        if (length % 2 == 0 && breadth % 2 == 0)
        {
            System.out.println("Appropriate Board size is "+length+" * "+breadth );
            //createBoard();

        }
        else {
            throw new BoardSizeNotPossibleException();
        }
    }

    }

    public boolean createBoard()
    {
        if(length==breadth)
            createSquareBoard();
        else
            createRectangleBoard();
        return true;
    }
    public boolean createSquareBoard()
    {
        initialize_array();
        array[length/2][breadth/2]="B";
        array[length/2][(breadth/2)+1]="W";
        array[(length/2)+1][breadth/2]="W";
        array[(length/2)+1][(breadth/2)+1]="B";
        return true;
    }

    private void initialize_array() {
        int i,j;

        for( i=0;i<length;i++)
        {
            for (j = 0; j < breadth; j++) {
                array[i][j] ="0";
            }
        }
    }

    public boolean createRectangleBoard()
    {
        initialize_array();
        array[(length/2)][(breadth/2)]="B";
        array[length/2][(breadth/2)+1]="W";
        array[(length/2)+1][breadth/2]="W";
        array[(length/2)+1][(breadth/2)+1]="B";
        return true;
    }

    public class BoardSizeNotPossibleException extends RuntimeException
    {

    }
}

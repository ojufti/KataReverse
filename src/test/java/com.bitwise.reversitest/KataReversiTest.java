import org.junit.Assert;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

/**
 * Created by niteshs on 7/22/2016.
 */
public class KataReversiTest {
    Reversi game = new Reversi();

    @Test(expected = MatrixBoard.BoardSizeNotPossibleException.class)
    public void itShouldHaveAppropriateBoardSize() {
        //given

        MatrixBoard board = new MatrixBoard(5, 8);
        //when
        board.boardSize();
        //then

    }


    @Test
    public void itShouldCreateBoard() {
        //given

        MatrixBoard board = new MatrixBoard(6, 4);
        //when
        board.createBoard();
        //then
        Assert.assertTrue(String.valueOf(true), true);

    }

    @Test
    public void itShouldPassInAllFourDirections() {
        //given
        String[][] inputArray = {   {"-", "-", "-", "-", "-", "-"},
                                    {"-", "-", "-", "-", "-", "-"},
                                    {"-", "-", "B", "W", "-", "-"},
                                    {"-", "-", "W", "B", "-", "-"},
                                    {"-", "-", "-", "-", "-", "-"},
                                    {"-", "-", "-", "-", "-", "-"}};

        String[][] outputArray = {  {"-", "-", "-", "-", "-", "-"},
                                    {"-", "-", "-", "1", "-", "-"},
                                    {"-", "-", "B", "W", "1", "-"},
                                    {"-", "1", "W", "B", "-", "-"},
                                    {"-", "-", "1", "-", "-", "-"},
                                    {"-", "-", "-", "-", "-", "-"}};
        //when
        String turn = "B";

        //then
        Assert.assertEquals(true, this.game.printLegalMoves(inputArray, turn, 6, 6, outputArray));

    }

    @Test
    public void shouldSuccessOnDirectionAntiSlashUp() {
        String[][] inputArray={
                {"-", "-", "-", "-", "-", "-"},
                {"-", "-", "-", "-", "-", "-"},
                {"-", "-", "B", "W", "-", "-"},
                {"-", "-", "W", "B", "-", "-"},
                {"-", "-", "-", "-", "-", "-"},
                {"-", "-", "-", "-", "-", "-"}};

        String[][] outputArray={{"-", "-", "-", "-", "-", "-"},
                            {"-", "-", "-", "-", "-", "-"},
                            {"-", "-", "B", "W", "1", "-"},
                            {"-", "-", "W", "W", "-", "-"},
                            {"-", "-", "1", "-", "1", "-"},
                            {"-", "-", "-", "-", "-", "-"}};
        //when
                        String turn=  "B";
        //then

        Assert.assertEquals(true, this.game.printLegalMoves(inputArray, turn, 6, 6, outputArray));
    }
    @Test
    public void shouldSuccessOnDirectionAntiSlashDown() {
       //given
        String[][] inputArray={
                {"-","-","-","-","-","-","-","-"},
                {"-","-","-","-","-","-","-","-"},
                {"-","-","-","-","-","-","-","-"},
                {"-","-","-","W","B","-","-","-"},
                {"-","-","-","W","B","-","-","-"},
                {"-","-","-","W","B","-","-","-"},
                {"-","-","-","-","-","-","-","-"},
                {"-","-","-","-","-","-","-","-"}};


        String[][] outputArray={{"-","-","-","-","-","-","-","-"},
                                {"-","-","-","-","-","-","-","-"},
                                {"-","-","1","-","-","-","-","-"},
                                {"-","-","1","W","B","-","-","-"},
                                {"-","-","1","W","B","-","-","-"},
                                {"-","-","1","W","B","-","-","-"},
                                {"-","-","1","-","-","-","-","-"},
                                {"-","-","-","-","-","-","-","-"}};
             //when
               String turn= "B";
        //then
        Assert.assertEquals(true, this.game.printLegalMoves(inputArray, turn, 8,8, outputArray));
    }
    @Test
    public void shouldSuccessOnTestAntislashDown() {
        //given
        String[][] inputArray={
                {"-","-","-","-","-","-","-","-"},
                {"-","-","-","-","-","-","-","-"},
                {"-","-","-","-","-","-","-","-"},
                {"-","-","-","W","B","-","-","-"},
                {"-","-","-","W","B","-","-","-"},
                {"-","-","-","W","B","-","-","-"},
                {"-","-","-","-","-","-","-","-"},
                {"-","-","-","-","-","-","-","-"}};


        String[][] outputArray={{"-","-","-","-","-","-","-","-"},
                                {"-","-","-","-","-","-","-","-"},
                                {"-","-","1","-","-","-","-","-"},
                                {"-","-","1","W","B","-","-","-"},
                                {"-","-","1","W","B","-","-","-"},
                                {"-","-","1","-","-","-","-","-"},
                                {"-","-","-","-","-","-","-","-"},
                                {"-","-","-","-","-","-","-","-"}};
        //when
        String turn= "B";
        //then
        Assert.assertEquals(true, this.game.printLegalMoves(inputArray, turn, 8, 8, outputArray));
    }
}


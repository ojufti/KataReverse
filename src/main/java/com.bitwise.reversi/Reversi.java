/**
 * Created by niteshs on 7/22/2016.
 */
public class Reversi {
    Direction direct;
    private int countNearby;
    String[][] array= new String[10][];
    Integer[][] foeAtPosition=new Integer[6][2];

    public  boolean printLegalMoves(String[][] inputa,String turn, int length, int breadth,String[][] output) {
        direct=new Direction(inputa);
        direct=new Direction(output);
        array=inputa;
        String [][]out=output;
        int l=length-1, b=breadth-1;
        for(int i=1;i<l;i++){
            for(int j=1;j<b;j++){
                if(array[i][j].equals("-")){
                    this.scanNearby(i, j);
                }
            }
        }
        return checkArray(out, l, b);
    }

    private boolean checkArray(String[][] out, int l, int b) {
        for(int i=0;i<l+1;l++)
        {
            for(int j=0;j<b+1;b++)
            {
                if(out[i][j].equals(array[i][j]))
                     return true;
                else
                    return false;
            }
        }
        return true;
    }

    private void scanNearby(int i, int j)
    {
        if(isEnemyNearby("B",i,j)){
            this.addPossibleMove(i, j);
            this.countNearby=0;
        }
    }

    private void addPossibleMove(int i, int j)
    {
        for(int m=0;m<this.countNearby;m++){
            direct.getDirection(i,j,this.foeAtPosition[m][0],this.foeAtPosition[m][1]);
            if(direct.isFriendInDirection(this.foeAtPosition[m][0],this.foeAtPosition[m][1])){
                this.array[i][j]="1";
            }
        }
    }

    public boolean isEnemyNearby(String WorB,int ligne,int colonne){
        countEnemyNearby(ligne,colonne);
        if(this.countNearby>0)
            return true;
        return false;
    }

    public void countEnemyNearby(int ligne,int colonne){
        for(int i=-1;i<2;i++){
            for(int j=-1;j<2;j++){
                if(array[ligne+i][colonne+j].equals("W")){
                    this.foeAtPosition[this.countNearby][0]=ligne+i;
                    this.foeAtPosition[this.countNearby][1]=colonne+j;
                    this.countNearby++;
                }
            }
        }
    }

}

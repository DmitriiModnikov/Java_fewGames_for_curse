import java.util.Random;
class Field 
{
    boolean canGo (int x,int y)
    {
        if(x<0||x>=w||y<0||y>=h)
        return false;
        return matrix[y][x]!='0';
    }
    int w; int h;
        char [][] matrix;
        Field (int w, int h){
        this.w = w;
        this.h = h;
        matrix = new char[h][w];
    }

    void fill() {
        Random rng = new Random();
        for (int i = 0; i < h; i++)
            for (int j = 0; j < w; j++) {
                int dice = rng.nextInt(250);
                if (dice < 200)
                    matrix[i][j] = '_';
                else if (dice < 150)
                    matrix[i][j] = '*';
                else if (dice < 100)
                    matrix[i][j] = 0;
                else
                    matrix[i][j] = '!';
            }
    }

    void output(Unit unit) {
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++)
                if(unit.x == j && unit.y == i)
                System.out.print("&");
                else {
                    System.out.print(matrix[i][j]);
                }
            System.out.println();
        }
                System.out.println("tip: "+unit.tip+"  Score: "+unit.score);
    }
}
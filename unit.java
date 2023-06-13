abstract class Unit 
{
    int tip,score;
    int x,y;
    Field field;
    
    Unit(Field field, int x, int y){
        this.field=field;
        this.x=x;
        this.y=y;
        tip=10;
        score=1;
    }
        abstract void move(char key);
}
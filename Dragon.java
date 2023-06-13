class Dragon extends Unit{
    Dragon (Field field, int x, int y){
        super(field, x, y);
    }
    void move(char key) 
    {
        int nx = x;
        int ny = y;
        switch (key) {
            case 'w':
                ny-=5;
                break;
            case 's':
                ny+=5;
                break;
            case 'a':
                nx-=5;
                break;
            case 'd':
                nx+=5;
                break;

            default:
                System.out.println("W A S D");
                return;
        }
        if (!field.canGo(nx, ny)) {
            System.out.println("Cant Go!");
            return;
        }
        x = nx;
        y = ny;
    }
}
class Giant extends Unit{
    Giant(Field field, int x, int y){
        super(field, x, y);
    }
    void move(char key) 
    {
        int nx = x;
        int ny = y;
        switch (key) {
            case 'w':
                ny-=3;
                break;
            case 's':
                ny+=3;
                break;
            case 'a':
                nx-=3;
                break;
            case 'd':
                nx+=3;
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
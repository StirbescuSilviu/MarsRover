public class Rover {

    public static final char CHAR_N = 'N';
    public static final char CHAR_L = 'L';
    public static final char CHAR_R = 'R';
    public static final char CHAR_M = 'M';
    public static final char CHAR_S = 'S';
    public static final char CHAR_E = 'E';
    public static final char CHAR_W = 'W';
    public int x;
    public int y;
    public int direction= CHAR_N;

    public int Xmax;
    public int Ymax;

    public Rover() {
    }

    public Rover(int x, int y, int direction,int X,int Y) {
        this.x = x;
        this.y = y;
        this.direction = direction;
        this.Xmax=X;
        this.Ymax=Y;

    }

    public void input(char c){
        if (c==CHAR_L)
            turnL();
        else
            if(c== CHAR_R)
                turnR();
            else
                if(c== CHAR_M)
                    move();
                else
                    System.out.println("Invalide input! It shoud be either L,R or M");

    }

    public void comenzi(String s){
        for( int i=0; i<s.length(); i++)
            input(s.charAt(i));
    }

    public void move() {

        switch (direction) {
            case CHAR_N:
                if (y < Ymax)
                    y++;
                break;
            case CHAR_S:
                if (y >= 1)
                    y--;
                break;
            case CHAR_E:
                if (x < Xmax)
                    x++;
                break;
            case CHAR_W:
                if (x >= 1)
                    x--;
                break;
        }
    }

    public void turnL(){
        switch (direction){
            case CHAR_N:
                direction=CHAR_W;

                break;
            case CHAR_W:
                direction=CHAR_S;

                break;
            case CHAR_S:
                direction=CHAR_E;

                break;
            case CHAR_E:
                direction=CHAR_N;
                break;
        }
    }

    public void turnR(){
        switch (direction){
            case CHAR_N:
                direction=CHAR_E;
                break;
            case CHAR_W:
                direction=CHAR_N;
                break;
            case CHAR_S:
                direction=CHAR_W;
                break;
            case CHAR_E:
                direction=CHAR_S;
                break;
        }
    }
    public void printPos(){

        switch (direction){
            case CHAR_N:
                System.out.println(x +" "+y+" N");
                break;
            case CHAR_E:
                System.out.println(x +" "+y+" E");
                break;
            case CHAR_W:
                System.out.println(x +" "+y+" W");
                break;
            case CHAR_S:
                System.out.println(x +" "+y+" S");
                break;
        }
    }

}

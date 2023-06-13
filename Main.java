import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Field field = new Field(25,25);
        
        Scanner reader = new Scanner(System.in);
        
            Unit unit;
        if(reader.nextInt()==0)
            unit = new Giant (field,5,5);
        else 
            unit = new Dragon(field,10,10);
            
        field.fill();
        field.output(unit);
        char key;
        do {
            key = reader.next().charAt(0);
            unit.move(key);
            field.output(unit);
        }
        while(key!='e'&&unit.tip>0);
        }
}
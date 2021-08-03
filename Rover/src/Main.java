public class Main {
    public static void main(String[] args){

        Map map= new Map(5,5);

        map.lista.add(new Rover(1,2,'N',map.X,map.Y));
        map.lista.get(0).comenzi("LMLMLMLMM");
        map.lista.get(0).printPos();

        map.lista.add(new Rover(3,3,'E',map.X,map.Y));
        map.lista.get(1).comenzi("MMRMMRMRRM");
        map.lista.get(1).printPos();


    }
}

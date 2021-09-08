public class Calcu {
    int x;
    int y;

    public void suma(int x, int y){
        this.x = x;
        this.y = y;
        System.out.println(x + y);
    }

    public void resta(int x, int y){
        this.x = x;
        this.y = y;
        System.out.println(x - y);
    }
    public void multiplicar(int x, int y){
        this.x = x;
        this.y = y;
        System.out.println(x * y);
    }

    public void dividir(int x, int y){
        this.x = x;
        this.y = y;
        if (y == 0){
            System.out.println("Imnposible dividir entre cero");
        }
        else{
        System.out.println(x / y);
    }
    }

}

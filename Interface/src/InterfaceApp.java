
interface Calculable{
    int sum(int v1, int v2);
}

interface Printebal{
    void print();
}

class  Realcal implements Calculable,Printebal{
    public int sum(int v1, int v2) {
        return v1;
    }
    public void print() {
        System.out.println("This is Realcal !!");

    }
}

class Dummycal{
    public int sum(int v1, int v2){
        return 3;
    }
}

public class InterfaceApp {
    public static void main(String[] args) {
        Realcal c = new Realcal();
        System.out.println(c.sum(1,2));
        c.print();



    }
}

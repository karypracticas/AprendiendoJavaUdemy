package This;

public class This extends This2 {

    int variable = 5;
    Clase2 obj2 = new Clase2();

    public void metodo(int variable){
        System.out.println("El valor de variable es: " + this.variable);
        System.out.println("El valor de la variable es: " + variable);

    }

    public void metodo2(){
        //Invocar el metodo de la clase2
        obj2.metodo(10);
        //Invocar el metodo de mi propia clase
        this.metodo(10);
    }

    public void metodo3(This2 obj){

    }

    public void metodo4(){
        this.metodo3(this);
    }

    public static void main(String[] args) {
        This obj = new This();
        obj.metodo2();
    }
}



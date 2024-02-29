public class Calculadora {
    public static void main(String[] args){
        operaciones op=new operaciones();
        op.leerNumeros();
        op.sumar();
        op.restar();
        op.multiplicar();
        op.dividir();
        op.mostrarResultados();

    }
}
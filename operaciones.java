import javax.swing.JOptionPane;
public class operaciones {

    //atributos
    int numero1;
    int numero2;
    int suma;
    int resta;
    int multiplicacion;
    int division;

    //metodos
public void leerNumeros(){
    numero1=Integer.parseInt(JOptionPane.showInputDialog("Coloca el número 1"));
    numero2=Integer.parseInt(JOptionPane.showInputDialog("coloca el número 2"));

}
public void sumar(){
    suma=numero1+numero2;
}
public void restar(){
    resta=numero1-numero2;
}
public void multiplicar(){
    multiplicacion=numero1*numero2;
    }
public void dividir(){
    division=numero1/numero2;
}
public void mostrarResultados(){
    System.out.println("La suma es "+suma);
    System.out.println("La resta es "+resta);
    System.out.println("La multiplicacion es "+multiplicacion);
    System.out.println("La division es "+division);
}
}

package ColaDeClientes;
public class ColaDeClientes {
    private int max;
    private int ini;
    private int fin;
    private Cliente[] Clientes ;
    public ColaDeClientes(){
        this.max = 100;
        this.ini = 0;
        this.fin = 0;
        this.Clientes = new Cliente[this.max + 1];
    }
    public boolean esVacio(){
        if (ini == 0 && fin == 0){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean esLlena(){
        if ( fin == max){
            return true;
        }
        else{
            return false;
        }
    }
    public void adicionar(Cliente nuevoCliente){

        if(esLlena()){
            System.out.println("LA COLA DE CLIENTES ESTA LLENA!");
        }else{
            fin = fin +1;
            Clientes[fin] = nuevoCliente;
        }
    }

    public Cliente eliminar (){
        Cliente elemento = null;
        if(esVacio()){
            System.out.println("LA COLA DE CLIENTES ESTA VACIA!!");
        }
        else{
            ini = ini+1;
            elemento = Clientes[ini];

        }
        if (ini == fin){
            ini = fin = 0;
        }
        return elemento;
    }
    public int nroClientes(){
        return fin - ini;
    }
    public int getIni() {
        return ini;
    }

    public int getFin() {
        return fin;
    }
    public void vaciar (ColaDeClientes cola){
        while(!cola.esVacio()){
            adicionar(cola.eliminar());
        }
    }
    public void mostrar(){
        if(esVacio()){
            System.out.println("No hay CLIENTES que mostrar");
        }
        else{
            Cliente elemEliminado;
            System.out.println("Mostrando la COLA DE CLIENTES:");
            ColaDeClientes aux = new ColaDeClientes();
            while (!esVacio()){
                elemEliminado = eliminar();
                elemEliminado.mostrar();
                aux.adicionar(elemEliminado);
            }
            vaciar(aux);
        }
    }

}

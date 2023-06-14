package ColaDeClientes;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Juan","Mamani",24,"Bolivia","masculino","SILVER");
        Cliente cliente2 = new Cliente("Alfredo","Limachi",54,"Argentina","masculino","SILVER");
        Cliente cliente3 = new Cliente("CArlos","Paucara",76,"Brazil","masculino","GOLD");
        Cliente cliente4 = new Cliente("Roberto","Torres",16,"Bolivia","masculino","SILVER");
        Cliente cliente5 = new Cliente("Maria","Callisaya",67,"Chile","femenino","GOLD");

        ColaDeClientes colaClientesA = new ColaDeClientes();
        colaClientesA.adicionar(cliente1);
        colaClientesA.adicionar(cliente2);
        colaClientesA.adicionar(cliente3);
        colaClientesA.adicionar(cliente4);
        colaClientesA.adicionar(cliente5);

        Cliente cliente6 = new Cliente("Luis","Sierra",34,"Mexico","masculino","SILVER");
        Cliente cliente7 = new Cliente("Mario","Limachi",54,"Argentina","masculino","SILVER");
        Cliente cliente8 = new Cliente("Luck","Manzaneda",45,"Brazil","masculino","GOLD");
        Cliente cliente9 = new Cliente("Esteban","Torres",29,"Argentina","masculino","SILVER");
        Cliente cliente10 = new Cliente("Estefania","CAstillo",18,"Chile","femenino","GOLD");

        ColaDeClientes colaClientesB = new ColaDeClientes();
        colaClientesB.adicionar(cliente6);
        colaClientesB.adicionar(cliente7);
        colaClientesB.adicionar(cliente8);
        colaClientesB.adicionar(cliente9);
        colaClientesB.adicionar(cliente10);

        colaClientesA.mostrar();
        colaClientesB.mostrar();

        //promocionDeUsuarios(colaClientes, "GOLD", "Bolivia");
        //moviendoClientes(colaClientes, 60);
        moviendoClientesEnDosColas(colaClientesA,colaClientesB,"Saul");
    }

    public static void promocionDeUsuarios(ColaDeClientes cola, String tipoCliente, String nacionalidadCliente){
        Cliente elemento = null;
        int nroClientes  = cola.nroClientes();
        int contador = 0;

        for (int i = 1; i <= nroClientes; i++){
            elemento = cola.eliminar();
            if(elemento.tipo.equals(tipoCliente) && elemento.pais.equals(nacionalidadCliente)){
                elemento.setTipo("VIP");
                contador++;
            }
            cola.adicionar(elemento);
        }
        if(contador == 0){
            System.out.println("NO HAY CLIENTES QUE SEAN DE NACIONALIDAD BOLIVIANA Y DE TIPO GOLD A LA VEZ!!");
        }else{
            cola.mostrar();
        }
    }

    public static void moviendoClientes(ColaDeClientes cola, int edadClientes){
        ColaDeClientes aux = new ColaDeClientes();
        Cliente elemento = null;
        int nroClientes = cola.nroClientes();

        for(int i =1 ; i<= nroClientes; i++){
            elemento = cola.eliminar();
            if(elemento.getEdad() > edadClientes){
                aux.adicionar(elemento);
            }
            else {
                cola.adicionar(elemento);
            }
        }

        aux.vaciar(cola);
        cola.vaciar(aux);

        cola.mostrar();
    }

    public static boolean buscaNombres(ColaDeClientes cola, String nombre){
        int nroClientes = cola.nroClientes();
        Cliente elemento =  null;
        boolean booleano = false;

        for(int i =1; i<= nroClientes; i++){
            elemento = cola.eliminar();
            if(elemento.nombres.equals(nombre)){
                booleano = true;
            }
            cola.adicionar(elemento);
        }
        return booleano;
    }
    public static void moviendoClientesEnDosColas(ColaDeClientes colaA, ColaDeClientes colaB, String nombre ){
        Cliente elemento = null;
        ColaDeClientes aux = new ColaDeClientes();
        int nroClientes;

        if (buscaNombres(colaA,nombre)){
             nroClientes = colaA.nroClientes();
            for ( int i =1 ; i <= nroClientes; i++){
                elemento = colaA.eliminar();
                if(elemento.nombres.equals(nombre)){
                    colaB.adicionar(elemento);
                }
                else {
                    colaA.adicionar(elemento);
                }
            }
        }
        else {
            System.out.println("NO HAY  CLIENTES CON EL NOMBRE DE "+nombre+"EN LA COLA A");
        }

        if(buscaNombres(colaA, nombre)){
            nroClientes = colaB.nroClientes();
            for (int i =1 ; i <= nroClientes; i++){
                elemento = colaB.eliminar();
                if(elemento.nombres.equals(nombre)){
                    aux.adicionar(elemento);
                }
                else {
                    colaB.adicionar(elemento);
                }
            }
            aux.vaciar(colaB);
            colaB.vaciar(aux);
        }
        else{
            System.out.println("NO HAY CLIENTES CON EL NOMBRE DE "+nombre+" EN LA COLA B");
        }
        
        colaA.mostrar();
        colaB.mostrar();
    }
}

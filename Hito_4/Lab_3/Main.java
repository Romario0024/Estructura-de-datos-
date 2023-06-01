package colas.Objetos;

import colas.ColaDeNumeros;

public class Main {
    public static void main(String[] args) {
        ColaDeLibros colaLibros1 = new ColaDeLibros();

        Libro libro1 = new Libro(1,"Juan","masculino","MANGA",80);
        Libro libro2 = new Libro(2,"Saul","masculino","MANGA",100);
        Libro libro3 = new Libro(3,"Ana","femenino","HISTORIA",40);
        Libro libro4 = new Libro(4,"Micaela","femenino","HISTORIA",30);
        Libro libro5 = new Libro(5,"Pepito","otro","NOVELA",20);
        Libro libro6 = new Libro(6,"Pep","otro","NOVELA",20);
        Libro libro7 = new Libro(7,"Carlos","masculino","ARTE",200);

        colaLibros1.adicionar(libro1);
        colaLibros1.adicionar(libro2);
        colaLibros1.adicionar(libro3);
        colaLibros1.adicionar(libro4);
        colaLibros1.adicionar(libro5);
        colaLibros1.adicionar(libro6);
        colaLibros1.adicionar(libro7);

       // colaDeLibros.mostrar();

        //Ejercicio 1: Crear un metodo extaico que muestree el libro con menor paginas ------------------------------------------------------------
       // libroConMenorPaginas(colaLibros1);
        //Ejercicio 1 (Hecho por el ingeniero): Crear un metodo extaico que muestree el libro con menor paginas
        //determinaLibroMenorPagina(colaLibros1).mostrar();

        //Ejercicio2: Ordenar la COLA por generos segunel siguiente orden: Femenino, masculino, otro ---------------------------------------------
        //ordenarPorGenero(colaLibros1);

        //Ejercicio3: Ordenar acendentemente los libros de la cola por pagina
        //ordenarPorPagina(colaLibros1);

        //Ejercicio3: (Hecho por el ingeniero)
        ordenaPorPagina(colaLibros1);


    }

    public static void ordenaPorPagina(ColaDeLibros colaLibros){
        ColaDeLibros ordenado = new ColaDeLibros();
        ColaDeLibros aux = new ColaDeLibros();
       int nroElem = colaLibros.nroElem();

       for (int i = 1; i <= nroElem; i++){
           Libro libro = determinaLibroMenorPagina(colaLibros);
           while(colaLibros.esVacio()){
               Libro item  = colaLibros.eliminar();
               if (item.getCodigoLibro() == libro.getCodigoLibro()){
                   ordenado.adicionar(item);

               }else {
                   aux.adicionar(item);
               }
           }
           colaLibros.vaciar(aux);
       }

        colaLibros.vaciar(ordenado);
        colaLibros.mostrar();
    }
    public static void ordenarPorPagina(ColaDeLibros ColaLibros){
        ColaDeLibros aux = new ColaDeLibros();
        ColaDeLibros aux2 = new ColaDeLibros();
        ColaDeLibros aux3 = new ColaDeLibros();

        int numeroMayor;
        Libro item = null;

        while(!ColaLibros.esVacio()){
            numeroMayor = Integer.MAX_VALUE;
            while(!ColaLibros.esVacio()){
                item = ColaLibros.eliminar();
                if (item.getPaginas() < numeroMayor){
                    numeroMayor = item.getPaginas();
                }
                aux.adicionar(item);
            }

            while(!aux.esVacio()){
                item = aux.eliminar();
                if (item.getPaginas() == numeroMayor){
                    aux3.adicionar(item);

                }else {
                    aux2.adicionar(item);
                }

            }
            ColaLibros.vaciar(aux2);
        }


        ColaLibros.vaciar(aux3);
        ColaLibros.mostrar();
    }

    public static void ordenarPorGenero(ColaDeLibros ColaLibros){
        ColaDeLibros auxFemenino = new ColaDeLibros();
        ColaDeLibros auxMasculino = new ColaDeLibros();
        ColaDeLibros auxOtro = new ColaDeLibros();

        int numeroMayor = Integer.MAX_VALUE;
        Libro item = null;

        while(!ColaLibros.esVacio()){
            item = ColaLibros.eliminar();
            if (item.getGenero().equals("femenino")){
                auxFemenino.adicionar(item);
            }
            else if (item.getGenero().equals("masculino")){
                auxMasculino.adicionar(item);
            }
            else if (item.getGenero().equals("otro")){
                auxOtro.adicionar(item);
            }

        }
        ColaLibros.vaciar(auxFemenino);
        ColaLibros.vaciar(auxMasculino);
        ColaLibros.vaciar(auxOtro);

        ColaLibros.mostrar();

    }
    public static Libro determinaLibroMenorPagina(ColaDeLibros colaDeLibros) {
        ColaDeLibros aux = new ColaDeLibros();
        Libro libroMenor = null;
        int paginasMenor = Integer.MAX_VALUE;

        while(!colaDeLibros.esVacio()){
            Libro item = colaDeLibros.eliminar();
            if(item.getPaginas()<paginasMenor){
                paginasMenor = item.getPaginas();
                libroMenor = item;
            }
            aux.adicionar(item);
        }
        colaDeLibros.vaciar(aux);
        return libroMenor;

    }
    public static void libroConMenorPaginas(ColaDeLibros ColaLibros){
            ColaDeLibros aux = new ColaDeLibros();
            int numeroMayor = Integer.MAX_VALUE;
            Libro item = null;

        while(!ColaLibros.esVacio()){
            item = ColaLibros.eliminar();
            if (item.getPaginas() < numeroMayor){
                numeroMayor = item.getPaginas();
            }
            aux.adicionar(item);
        }


        while(!aux.esVacio()){
            item = aux.eliminar();
            if (item.getPaginas() == numeroMayor){
                ColaLibros.adicionar(item);
            }
        }


        ColaLibros.mostrar();

        ColaLibros.vaciar(aux);
    }

}

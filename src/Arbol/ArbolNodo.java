package Arbol;

import Nodo.Nodo_Arbol;

public class ArbolNodo {
    private Nodo_Arbol raiz;

    //construir un arbol vacio
    public ArbolNodo()
    {
        raiz = null;
    }

    //insertar un nuevo ndo en el arbol de busqueda binaria
    public synchronized void insertarNodo(int valorInsertar)
    {
        if(raiz == null)
            raiz = new Nodo_Arbol(valorInsertar); //crea nodo raiz
        else
            raiz.insertar(valorInsertar); //llama al metodo insertar
    }

    // EMPIEZA EL RECORRIDO EN PREORDEN
    public synchronized void recorridoPreorden()
    {
        ayudantePreorden(raiz);
    }
    //meoto recursivo para recorrido en preorden

    private void ayudantePreorden(Nodo_Arbol nodo)
    {
        if(nodo == null)
            return;

        System.out.print(nodo.datos + " ");     //mostrar datos del nodo
        ayudantePreorden(nodo.nodoizquierdo);   //recorre subarbol izquierdo
        ayudantePreorden(nodo.nododerecho);     //recorre subarbol derecho
    }

    //EMPEZAR RECORRIDO INORDEN
    public synchronized void recorridoInorden()
    {
        ayudanteInorden(raiz);
    }

    //meoto recursivo para recorrido inorden
    private void ayudanteInorden( Nodo_Arbol nodo)
    {
        if(nodo == null)
            return;

        ayudanteInorden(nodo.nodoizquierdo);
        System.out.print(nodo.datos + " ");
        ayudanteInorden(nodo.nododerecho);
    }

    //EMPEZAR RECORRIDO PORORDEN
    public synchronized void recorridoPosorden()
    {
        ayudantePosorden(raiz);
    }

    //meotod recursivo para recorrido posorden
    private void ayudantePosorden(Nodo_Arbol nodo)
    {
        if( nodo == null )
            return;

        ayudantePosorden(nodo.nodoizquierdo);
        ayudantePosorden(nodo.nododerecho);
        System.out.print(nodo.datos + " ");
    }
}

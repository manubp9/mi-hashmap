import java.util.ArrayList;
/**
 * Write a description of class MiHashMap here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MiHashMap
{
    // instance variables - replace the example below with your own
    private String[] letras;
    //
    private int[] numeros;

    /**
     * Constructor for objects of class MiHashMap
     */
    public MiHashMap()
    {
        letras = new String[0];
        numeros = new int[0];
    }

    /**
     * Asocia el valor especificado con la clave especificada. 
     * Si la clave existía, entonces sobreescribe su valor y devuelve el valor antiguo. 
     * Si no existía devuelve -1. 
     */
    public int put(String clave, int valor)
    {
        boolean encontrado= false;//interruptor logico para devolver si hay ese elemento en la lista 
        int valorAntiguo = -1;
        int index = 0;
        int indexEncontrado = 0;
        while(index < letras.length && !(encontrado))//
        {
            if(letras[index]==clave)
            {
                encontrado = true;
                indexEncontrado = index;

            }
            index++;

        }
        if(encontrado)
        {
            valorAntiguo = numeros[index];
            numeros[index]= valor;

        }
        return valorAntiguo;

    }

    /**
     * Devuelve el valor asociado con la clave especificada o -1 en caso de que la clave no exista.
     */
    public int get(String clave)
    {
        boolean encontrado= false;//interruptor logico para devolver si hay ese elemento en la lista 
        int valorAntiguo = -1;
        int index = 0;
        int indexEncontrado = 0;
        while(index < letras.length && !(encontrado))//
        {
            if(letras[index]==clave)
            {
                encontrado = true;
                indexEncontrado = index;

            }
            index++;

        }
        if(encontrado)
        {
            valorAntiguo = numeros[index];

        }
        return valorAntiguo;
    }

    /**
     * devuelve true si el mapa no contiene elementos.
     */
    public boolean isEmpty()
    {
        boolean vacio = false;
        if(letras.length == 0 && numeros.length == 0 )
        {
            vacio =true;
        }
        return vacio;
    }
    /**
     * Devuelve el nuemro de elementos del mapa
     */
    public int size()
    {
        return letras.length;
    }
}

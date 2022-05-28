package com.company;


import java.util.ArrayList;


        public class Colecciones {


            public static void main(String[] args) {


        /*Creamos la coleccion*/

                ArrayList <Integer> coleccion = new ArrayList<Integer>();


                // Añadimos elementos a la colección con el método add().

                coleccion.add(12);
                coleccion.add(10);
                coleccion.add(16);
                coleccion.add(11);
                coleccion.add(14);
                coleccion.add(11);


                // Devuelve el numero de elementos del ArrayList
                coleccion.size();

                // Devuelve el elemento que esta en la posición '2' del ArrayList
                coleccion.get(2);

                // Comprueba si existe el elemento
                coleccion.contains(14);

                // Devuelve la posición del elemento
                coleccion.indexOf(11);


                // Borra el elemento de la posición '5'
                coleccion.remove(5);

                // Borra la primera posicion donde encuentra el elemento
                coleccion.remove(2);

                // Copiar un ArrayList
                ArrayList arrayListCopia = (ArrayList) coleccion.clone();

                //Borra todos los elementos de ArrayList
                coleccion.clear();

               // Indica si el ArrayList esta vacio(true/false).
                coleccion.isEmpty();



                // Mostramos los elementos

                System.out.println(coleccion.toString());
                System.out.println(arrayListCopia.toString());

            }
        }

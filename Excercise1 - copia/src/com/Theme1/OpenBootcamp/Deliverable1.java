package com.Theme1.OpenBootcamp;

/*
Para este primer ejercicio tendréis que realizar lo siguiente:
In this first deliverable we will complete: 1-Create a class, 2- create a package, 3-Create a main method.

    -  Crea un proyecto de Java desde 0

    - Dentro del proyecto tenéis que crear un paquete. En el paquete tendréis que crear una clase.

    - Dentro de la clase tenéis que crear el método main e imprimir todos los datos que se han visto en las sesiones.

Recordatorio: Los tipos de datos más comunes son int, long, double, boolean, String.

 */

// Para crear las clases se requieren: Atributos, Constructores y Comportamientos
// To create a class we need to define: Attributes, constructors and Methods


// Atributos - Attributes

public class Deliverable1 {

    String name;
    String lastname;
    String email;
    Integer age = 0;
    Double weight = (double) 0;
    Boolean affiliated = true;




    // Constructores - Constructors
    public Deliverable1(String name, String lastname, String email, Integer age, Double weight, Boolean affiliated, long timestamp) {
        this.name = name;
        this.lastname = lastname;
        this.email = email;
        this.age = age;
        this.weight = weight;
        this.affiliated = affiliated;

    }

    public Deliverable1() {

    }

    public String getName() { return name;}
    public String getLastname() { return lastname;}
    public String getEmail() { return email;}
    public Integer getAge() { return age;}
    public Double getWeight() { return weight;}

    public Boolean getAffiliated() {
        return affiliated;
    }

    @Override
    public String toString() {
        return "Deliverable1{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", affiliated=" + affiliated +
                '}';
    }
}





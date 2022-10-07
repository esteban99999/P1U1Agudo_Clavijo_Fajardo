/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.p1u1agudo_clavijo_fajardo;

/**
 *
 * @author esteb
 */
public class P1U1Agudo_Clavijo_Fajardo {
    

    public static void main(String[] args) {
        
        //perro
        
        Perro perro1 = new Perro();
        
        perro1.nombrePerro = "Cok";
        perro1.razaPerro= "shitzu";
        perro1.edadPerro= 6;
        perro1.sexoPerro= "macho";
        
        Perro perro2 = new Perro();
        
        perro2.nombrePerro = "Mia";
        perro2.razaPerro= "pitbull";
        perro2.edadPerro= 4;
        perro2.sexoPerro= "hembra";
        
        Perro perro3 = new Perro();
        
        perro3.nombrePerro = "Alex";
        perro3.razaPerro= "chihuahua";
        perro3.edadPerro= 1;
        perro3.sexoPerro= "macho";
        
        System.out.println("El perro se llama: "+perro1.nombrePerro+", el perro es raza: "+perro1.razaPerro+",su edad en años es: "+
                perro1.edadPerro+"y es de sexo: "+perro1.sexoPerro);
        
        System.out.println("El perro se llama: "+perro2.nombrePerro+", el perro es raza: "+perro2.razaPerro+",su edad en años es: "+
                perro2.edadPerro+"y es de sexo: "+perro2.sexoPerro);
        
        System.out.println("El perro se llama: "+perro3.nombrePerro+", el perro es raza: "+perro3.razaPerro+",su edad en años es: "+
                perro3.edadPerro+"y es de sexo: "+perro3.sexoPerro);
        
        //Personas
        
        Persona persona1 = new Persona();
        
        persona1.nombrePersona = "Alex";
        persona1.tallaPiePersona = 12;
        persona1.edadPersona= 17;
        persona1.estaturaPersona = 1.80;
        
        Persona persona2 = new Persona();
        
        persona2.nombrePersona = "Mia";
        persona2.tallaPiePersona = 10 ;
        persona2.edadPersona= 35;
        persona2.estaturaPersona = 1.72;
        
        Persona persona3 = new Persona();
        
        persona3.nombrePersona = "carlos";
        persona3.tallaPiePersona = 8 ;
        persona3.edadPersona = 18;
        persona3.estaturaPersona = 1.56;
        
        System.out.println("La persona se llama: "+persona1.nombrePersona+", su talla de pie es: "+persona1.tallaPiePersona+",su edad en años es: "+
                persona1.edadPersona+"y mide: "+persona1.estaturaPersona);
        
        System.out.println("La persona se llama: "+persona2.nombrePersona+", su talla de pie es: "+persona2.tallaPiePersona+",su edad en años es: "+
                persona2.edadPersona+"y mide: "+persona2.estaturaPersona);
        
        System.out.println("La persona se llama: "+persona3.nombrePersona+", su talla de pie es: "+persona3.tallaPiePersona+",su edad en años es: "+
                persona3.edadPersona+"y mide: "+persona3.estaturaPersona);
        
        //computador
        
        Computador Computador1 = new Computador(); 
        
        Computador1.capacidadComputador = 512;
        Computador1.marcaComputador = "hp"; 
        Computador1.ramComputador = 16 ;
        Computador1.procesadorComputador = "Intel";

        Computador Computador2 = new Computador(); 
        Computador2.capacidadComputador = 256; 
        Computador2.marcaComputador = "Intel"; 
        Computador2.ramComputador = 12 ;
        Computador2.procesadorComputador = "Intel";

        Computador Computador3 = new Computador(); 
        Computador3.capacidadComputador = 512; 
        Computador3.marcaComputador = "Lenovo"; 
        Computador3.ramComputador = 16 ;
        Computador3.procesadorComputador = "Ryzen";
        
        System.out.println("La capacidad del computador es: "+Computador1.capacidadComputador+", la marca del computador es: "+
                Computador1.marcaComputador+",su ram es: "+ Computador1.ramComputador+"y tiene de procesador una: "+Computador1.procesadorComputador);

        System.out.println("La capacidad del computador es: "+Computador2.capacidadComputador+", la marca del computador es: "+
                Computador2.marcaComputador+",su ram es: "+ Computador2.ramComputador+"y tiene de procesador una: "+Computador2.procesadorComputador);

        System.out.println("La capacidad del computador es: "+Computador3.capacidadComputador+", la marca del computador es: "+
                Computador3.marcaComputador+",su ram es: "+ Computador3.ramComputador+"y tiene de procesador una: "+Computador3.procesadorComputador);
        
        //Autos
        
        Auto Auto1 = new Auto();

        Auto1.marcaAuto = "Kia";
        Auto1.añoAuto = 2022;
        Auto1.puertasAuto = 4;
        Auto1.tipoAuto = "Manual";

        Auto Auto2 = new Auto();

        Auto2.marcaAuto = "Toyota";
        Auto2.añoAuto = 2021;
        Auto2.puertasAuto = 2;
        Auto2.tipoAuto = "Standard";

        Auto Auto3 = new Auto();

        Auto3.marcaAuto = "Chevrolet";
        Auto3.añoAuto = 2005;
        Auto3.puertasAuto = 5;
        Auto3.tipoAuto = "Manual";
        
        System.out.println("La marca del auto es: "+Auto1.marcaAuto+", el año del auto es: "+Auto1.añoAuto+",la cantidad de puertas que tiene es: "+
                Auto1.puertasAuto+"y el tipo de auto es: "+Auto1.tipoAuto);

        System.out.println("La marca del auto es: "+Auto2.marcaAuto+", el año del auto es: "+Auto2.añoAuto+",la cantidad de puertas que tiene es: "+
                Auto2.puertasAuto+"y el tipo de auto es: "+Auto2.tipoAuto);

        System.out.println("La marca del auto es: "+Auto3.marcaAuto+", el año del auto es: "+Auto3.añoAuto+",la cantidad de puertas que tiene es: "+
                Auto3.puertasAuto+"y el tipo de auto es: "+Auto3.tipoAuto);
        
        //Asignatura
        
        Asignatura asignatura1=new Asignatura();
        
        asignatura1.nombreAsignatura="Calculo Integral";
        asignatura1.horasAsignatura=130;
        asignatura1.profesorAsignatura="Juan Arias";
        asignatura1.jornadaAsignatura="Nocturna";

        Asignatura asignatura2=new Asignatura();
        
        asignatura2.nombreAsignatura="Quimica";
        asignatura2.horasAsignatura=120;
        asignatura2.profesorAsignatura="Gustavo Lopez";
        asignatura2.jornadaAsignatura="Diurna";


        Asignatura asignatura3=new Asignatura();
        
        asignatura3.nombreAsignatura="Antropologia";
        asignatura3.horasAsignatura=100;
        asignatura3.profesorAsignatura="Andres Muñoz";
        asignatura3.jornadaAsignatura="Nocturna";

        System.out.println("La asignatura se denomina"+asignatura1.nombreAsignatura+
                "el numero de horas es de: "+asignatura1.horasAsignatura+ ", el profesor encargado de la clase es: "+
                asignatura1.profesorAsignatura+"y la jornada es: "+asignatura1.jornadaAsignatura);

        System.out.println("La asignatura se denomina"+asignatura2.nombreAsignatura+
                "el numero de horas es de: "+asignatura2.horasAsignatura+ ", el profesor encargado de la clase es: "+
                asignatura2.profesorAsignatura+"y la jornada es: "+asignatura1.jornadaAsignatura);

        System.out.println("La asignatura se denomina"+asignatura3.nombreAsignatura+
                "el numero de horas es de: "+asignatura3.horasAsignatura+ ", el profesor encargado de la clase es: "+
                asignatura3.profesorAsignatura+"y la jornada es: "+asignatura3.jornadaAsignatura);
        
        //Habitacion
        
        Habitacion habitacion1=new Habitacion();
        habitacion1.dueñoHabitacion="Carla";
        habitacion1.estantesHabitacion=2;
        habitacion1.habitantesHabitacion=1;
        habitacion1.camasHabitacion=1;

        Habitacion habitacion2=new Habitacion();
        habitacion2.dueñoHabitacion="Alejandro";
        habitacion2.estantesHabitacion=1;
        habitacion2.habitantesHabitacion=2;
        habitacion2.camasHabitacion=2;


        Habitacion habitacion3=new Habitacion();
        habitacion3.dueñoHabitacion="Alberto";
        habitacion3.estantesHabitacion=2;
        habitacion3.habitantesHabitacion=3;
        habitacion3.camasHabitacion=3;

        System.out.println("El dueño de la hbitacion se llama"+habitacion1.dueñoHabitacion+
                "la habitacion tiene: "+habitacion1.estantesHabitacion+ "estantes, "+"viven "+
                habitacion1.habitantesHabitacion+"personas "+ "y la habitacion cuenta con: "+
                habitacion1.camasHabitacion + "camas");

        System.out.println("El dueño de la hbitacion se llama"+habitacion2.dueñoHabitacion+
                "la habitacion tiene: "+habitacion2.estantesHabitacion+ "estantes, "+"viven "+
                habitacion2.habitantesHabitacion+"personas "+ "y la habitacion cuenta con: "+
                habitacion2.camasHabitacion + "camas");

        System.out.println("El dueño de la hbitacion se llama"+habitacion3.dueñoHabitacion+
                "la habitacion tiene: "+habitacion3.estantesHabitacion+ "estantes, "+"viven "+
                habitacion3.habitantesHabitacion+"personas "+ "y la habitacion cuenta con: "+
                habitacion3.camasHabitacion + "camas");

   
    }
    
}

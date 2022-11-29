package ar.edu.uade.model.ejercicio;

import ar.edu.uade.enums.ExigenciaMuscular;
import ar.edu.uade.enums.GrupoMuscular;

import java.util.List;

public class TotalEjercicios {

    private List<Ejercicio> totalEjercicios;


    public List<Ejercicio> getTotalEjercicios() {
        return totalEjercicios;
    }

    public void cargarEjercicios(){

        // Ejercicios Pecho
        Ejercicio ej11 = new Ejercicio(11L,"Banco plano", GrupoMuscular.PECHO, 3, 10,
                20,2, ExigenciaMuscular.ALTO,"");
        totalEjercicios.add(ej11);

        Ejercicio ej12 = new Ejercicio(12L,"Banco inclinado", GrupoMuscular.PECHO, 3, 8,
                10,2,ExigenciaMuscular.ALTO,"");
        totalEjercicios.add(ej12);

        Ejercicio ej13 = new Ejercicio(13L,"Banco declinado", GrupoMuscular.PECHO, 3, 10,
                15,2,ExigenciaMuscular.ALTO,"");
        totalEjercicios.add(ej13);

        Ejercicio ej14 = new Ejercicio(14L,"Flexion pecho", GrupoMuscular.PECHO, 3, 5,
                0,5,ExigenciaMuscular.MEDIO,"");
        totalEjercicios.add(ej14);

        Ejercicio ej15 = new Ejercicio(15L,"Burpees", GrupoMuscular.PECHO, 3, 10,
                0,10,ExigenciaMuscular.BAJO,"");
        totalEjercicios.add(ej15);

        //-----------------------------------------------------------------------

        //Ejercicios Espalda
        Ejercicio ej21 = new Ejercicio(21L,"Dominadas asistidas", GrupoMuscular.ESPALDA, 3, 10,
                0,6,ExigenciaMuscular.BAJO,"");
        totalEjercicios.add(ej21);

        Ejercicio ej22 = new Ejercicio(22L,"Dominadas libres", GrupoMuscular.ESPALDA, 3, 5,
                0,5,ExigenciaMuscular.MEDIO,"");
        totalEjercicios.add(ej22);

        Ejercicio ej23 = new Ejercicio(23L,"Remo alto", GrupoMuscular.ESPALDA, 3, 10,
                15,2,ExigenciaMuscular.ALTO,"");
        totalEjercicios.add(ej23);

        Ejercicio ej24 = new Ejercicio(24L,"Peso Muerto", GrupoMuscular.ESPALDA, 3, 10,
                15,3,ExigenciaMuscular.ALTO,"");
        totalEjercicios.add(ej24);

        Ejercicio ej25 = new Ejercicio(25L,"Remo bajo", GrupoMuscular.ESPALDA, 3, 10,
                20,1,ExigenciaMuscular.MEDIO,"");
        totalEjercicios.add(ej25);

        //-----------------------------------------------------------------------

        //Ejercicios Hombros
        Ejercicio ej31 = new Ejercicio(31L,"Press Arnold", GrupoMuscular.HOMBROS, 3, 10,
                10,2,ExigenciaMuscular.ALTO,"");
        totalEjercicios.add(ej31);

        Ejercicio ej32 = new Ejercicio(32L,"Parada de manos", GrupoMuscular.HOMBROS, 3, 3,
                0,8,ExigenciaMuscular.MEDIO,"");
        totalEjercicios.add(ej32);

        Ejercicio ej33 = new Ejercicio(33L,"Vuelos laterales", GrupoMuscular.HOMBROS, 3, 10,
                8,3,ExigenciaMuscular.MEDIO,"");
        totalEjercicios.add(ej33);

        Ejercicio ej34 = new Ejercicio(34L,"Barra al menton", GrupoMuscular.HOMBROS, 3, 8,
                10,2,ExigenciaMuscular.BAJO,"");
        totalEjercicios.add(ej34);

        Ejercicio ej35 = new Ejercicio(35L,"Vertical dinamica", GrupoMuscular.HOMBROS, 3, 5,
                0,8,ExigenciaMuscular.BAJO,"");
        totalEjercicios.add(ej35);

        //-----------------------------------------------------------------------

        //Ejercicios Pierna
        Ejercicio ej41 = new Ejercicio(41L,"Sentadilla", GrupoMuscular.PIERNAS, 3, 10,
                0,3,ExigenciaMuscular.ALTO,"");
        totalEjercicios.add(ej41);

        Ejercicio ej42 = new Ejercicio(42L,"Saltos a plataforma", GrupoMuscular.PIERNAS, 3, 10,
                0,8,ExigenciaMuscular.BAJO,"");
        totalEjercicios.add(ej42);

        Ejercicio ej43 = new Ejercicio(43L,"Zancadas", GrupoMuscular.PIERNAS, 3, 10,
                0,5,ExigenciaMuscular.ALTO,"");
        totalEjercicios.add(ej43);

        Ejercicio ej44 = new Ejercicio(41L,"Salto de cuerda", GrupoMuscular.PIERNAS, 3, 30,
                0,10,ExigenciaMuscular.BAJO,"");
        totalEjercicios.add(ej44);

        Ejercicio ej45 = new Ejercicio(45L,"Prensa", GrupoMuscular.PIERNAS, 3, 10,
                20,2,ExigenciaMuscular.ALTO,"");
        totalEjercicios.add(ej45);

        //-----------------------------------------------------------------------

        //Ejercicios Brazos
        Ejercicio ej51 = new Ejercicio(51L,"Curl Biceps con barra", GrupoMuscular.BRAZOS, 3, 10,
                10,2,ExigenciaMuscular.ALTO,"");
        totalEjercicios.add(ej51);

        Ejercicio ej52 = new Ejercicio(52L,"Flexiones Diamante", GrupoMuscular.BRAZOS, 3, 7,
                0,5,ExigenciaMuscular.MEDIO,"");
        totalEjercicios.add(ej52);

        Ejercicio ej53 = new Ejercicio(53L,"Triceps por la pared", GrupoMuscular.BRAZOS, 3, 10,
                0,6,ExigenciaMuscular.BAJO,"");
        totalEjercicios.add(ej53);

        Ejercicio ej54 = new Ejercicio(54L,"Curl Biceps con mancuernas", GrupoMuscular.BRAZOS, 3, 10,
                5,2,ExigenciaMuscular.ALTO,"");
        totalEjercicios.add(ej54);

        Ejercicio ej55 = new Ejercicio(55L,"Antebrazos", GrupoMuscular.BRAZOS, 3, 10,
                3,2,ExigenciaMuscular.MEDIO,"");
        totalEjercicios.add(ej55);

    }
}

import com.keatnis.screenmantch.mod.Pelicula;

public class Principal {
    public static void main(String[] args) {
        Pelicula pelicula = new Pelicula();

        pelicula.setNombre("Wall-e");
        pelicula.setFechaDeLanzamiento( 2013);
        pelicula.setDuracionMinutos( 20);
        pelicula.setIncluidoEnELPlan(true);
        pelicula.muestraFichaTecnica();
        pelicula.evalua(9.8);
        pelicula.evalua(8);
        System.out.println(pelicula.getTotalDeEvaluaciones());
        Pelicula nuevaPelicula = new Pelicula();
        nuevaPelicula.setNombre("Matrix");
        nuevaPelicula.setFechaDeLanzamiento (1998);
        nuevaPelicula.setDuracionMinutos( 180);
        nuevaPelicula.evalua(9);
        nuevaPelicula.evalua(10);
        System.out.println("Media de las evaluaciones "+  nuevaPelicula.calcularMedia());



        nuevaPelicula.muestraFichaTecnica();

    }

}

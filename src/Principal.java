import com.keatnis.screenmatch.calculos.FiltroRecomendacion;
import com.keatnis.screenmatch.mod.Episodio;
import com.keatnis.screenmatch.mod.Pelicula;
import com.keatnis.screenmatch.mod.Serie;
import com.keatnis.screenmatch.calculos.CalculadoraDeTiempo;

public class Principal {
    public static void main(String[] args) {
        Pelicula pelicula = new Pelicula();

        pelicula.setNombre("Wall-e");
        pelicula.setFechaDeLanzamiento(2013);
        pelicula.setDuracionMinutos(20);
        pelicula.setIncluidoEnELPlan(true);
        pelicula.mostrarFichaTecnica();
        pelicula.evalua(9.8);
        pelicula.evalua(8);
        System.out.println(pelicula.getTotalDeEvaluaciones());
        System.out.println("Media de las evaluaciones " + pelicula.calcularMedia());


        Serie casaDragron = new Serie();
        casaDragron.setNombre("La casa del Dragon");
        casaDragron.setFechaDeLanzamiento(2022);
        casaDragron.setTemporadas(1);
        casaDragron.setEpisodiosPorTemporada(10);
        casaDragron.setMinutosPorEpisodio(50);
        casaDragron.setDuracionMinutos(casaDragron.getMinutosPorEpisodio() * casaDragron.getEpisodiosPorTemporada());


        Pelicula nuevaPelicula = new Pelicula();
        nuevaPelicula.setNombre("Matrix");
        nuevaPelicula.setFechaDeLanzamiento(1998);
        nuevaPelicula.setDuracionMinutos(180);
        nuevaPelicula.evalua(9);
        nuevaPelicula.evalua(10);
//        nuevaPelicula.mostrarFichaTecnica();

        CalculadoraDeTiempo calculadoraDeTiempo = new CalculadoraDeTiempo();
        calculadoraDeTiempo.incluye(pelicula);
        calculadoraDeTiempo.incluye(casaDragron);
        calculadoraDeTiempo.incluye(nuevaPelicula);
        System.out.println("Tiempo necesario para ver tus titulos favoritos en estas vacaciones: " +
                calculadoraDeTiempo.getTiempoTotal());

        FiltroRecomendacion filtroRecomendacion = new FiltroRecomendacion();
        filtroRecomendacion.filtra(nuevaPelicula);

        Episodio episodio = new Episodio();
        episodio.setNombre("La casa targaryen");
        episodio.setSerie(casaDragron);
        episodio.setTotalVisualizaciones(50);
        filtroRecomendacion.filtra(episodio);
    }

}

package hello.resource;

import hello.model.Movie;
import hello.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class MovieResource {

    @Autowired
    MovieService movieService;

    @GetMapping("/getMovies")
    public Collection<Movie> getAllMovies() {
        return movieService.getAllMovies();
    }

}

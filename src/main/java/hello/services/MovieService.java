package hello.services;

import hello.model.Movie;
import hello.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class MovieService {

    @Autowired
    MovieRepository movieRepository;

    public Collection<Movie> getAllMovies(){
        return movieRepository.getAllMovies();
    }

}

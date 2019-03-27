package hello.services;

import hello.model.Movie;
import hello.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
@EntityScan
public class MovieService {

    @Autowired
    MovieRepository movieRepository;

    public Collection<Movie> getAllMovies(){
        return movieRepository.findAll();
    }

    public void addMovie(Movie movie){
        movieRepository.save(movie);
    }

    public Movie getMovieByTitle(String name){
        return movieRepository.findByTitle(name);
    }

}

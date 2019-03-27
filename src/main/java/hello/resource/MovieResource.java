package hello.resource;

import hello.model.Movie;
import hello.model.User;
import hello.services.MovieService;
import hello.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Optional;

@RestController
@EntityScan
public class MovieResource {

    @Autowired
    MovieService movieService;

    @Autowired
    UserService userService;


    @GetMapping("/getMovies")
    public Collection<Movie> getAllMovies() {
        return movieService.getAllMovies();
    }

    @PostMapping("/addMovie")
    public String addMovie(@RequestBody Movie movie){
        movieService.addMovie(movie);
        return "added movie";
    }

    @GetMapping("/getMovie/{name}")
    public Movie getMovie(@PathVariable("name") String name){
        System.out.println(name);
        return movieService.getMovieByTitle(name);
    }


    @GetMapping("/{user}/rate/{movie}/with/{rating}")
    public String setRatings(@PathVariable("user") String userName, @PathVariable("movie") String movieName, @PathVariable("rating") String ratings){
        User user = userService.getUserByName(userName);
        Movie movie = movieService.getMovieByTitle(movieName);
        user.setRatingMovie(movie);
        userService.save(user);
        // have to save !!!!! omg!!!!!
        return "i love wqf";
    }


}

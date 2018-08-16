package com.nagarjuna.start;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nagarjuna.start.simple.model.Movie;
import com.nagarjuna.start.simple.model.Theatre;
import com.nagarjuna.start.simple.service.MovieService;

@RestController
public class MovieController {
	
	@Autowired
	private MovieService movieService;
	
	@RequestMapping("/hello")	
	public String sayHi() {
		return "hi";
	}

	@RequestMapping(value = "/addMovie",method = RequestMethod.POST)
	public void addMovies(@RequestBody Movie movie) {
		movieService.addMovie(movie);
	}
	
	@RequestMapping("/getAllMovies")
	public List<Movie> getAllMovies(){
		return movieService.getAllMovies();
	}
	
	@RequestMapping("/getMovie/{id}")
	public Movie getMovie(@PathVariable Integer id) {
		return movieService.getMovie(id);
	}
	
	@RequestMapping(value = "/selectSeats",method = RequestMethod.POST)
	public List<String> selectSeats(@RequestBody Theatre seats) {
		return movieService.selectSeats(seats);
	}
}

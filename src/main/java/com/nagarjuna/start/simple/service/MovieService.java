/**
 * 
 */
package com.nagarjuna.start.simple.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.nagarjuna.start.simple.model.Movie;
import com.nagarjuna.start.simple.model.Theatre;



/**
 * @author nagarjun1
 *
 */
@Service
public class MovieService {

	private List<Movie> movies = new ArrayList<>(Arrays.asList(new Movie(1,"Stalin","Muragdas"),
											new Movie(2,"Indra","gopal"),
											new Movie(3,"Anji","RamaKrishna")));
	public List<Movie> getAllMovies(){
		return movies;
	}
	
	public Movie getMovie(Integer id) {
		return movies.stream().filter(t-> t.getId().equals(id)).findFirst().get();
	}
	
	public void addMovie(Movie movie) {
		movies.add(movie);
	}

	public List<String> selectSeats(Theatre seats) {
		
		List<Integer> seatNumbers = seats.getSeatNumber();
		List<String> messages = new ArrayList<String>();
		for(Integer seatNumber:seatNumbers) {
			if(seatNumber > 100) {
				try {
					throw new RuntimeException("seat Number "+seatNumber+" does not Exist");
				}
				catch(RuntimeException re) {
					messages.add(re.getMessage());
				}
				
			}
//			else {
//				String seatFound = "seat Number "+seatNumber+" Exist";
//				messages.add(seatFound);
//			}
		}
		if(!messages.isEmpty()) {
			
		}
		return messages;
	}
			
}

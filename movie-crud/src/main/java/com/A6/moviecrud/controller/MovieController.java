package com.A6.moviecrud.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.A6.moviecrud.entity.Movie;
import com.A6.moviecrud.repository.MovieRepository;

@Controller
public class MovieController {

	@Autowired
	MovieRepository repository;

	@GetMapping("/")
	public String loadMain() {
		return "main.html";
	}

	@GetMapping("/insert")
	public String loadInsertForm() {
		return "insert.html";
	}

	@PostMapping("/insert")
	public String saveRecord(Movie movie, ModelMap map) {
		repository.save(movie);
		map.put("message", "Movie Added Success");
		return "main.html";
	}

	@GetMapping("/fetch")
	public String fetch(ModelMap map) {
		List<Movie> movies = repository.findAll();
		if (movies.isEmpty()) {
			map.put("message", "No Records Present");
			return "main.html";
		}
		map.put("movies", movies);
		return "fetch.html";
	}
	
	@GetMapping("/delet")
	public String deleteById(@RequestParam long id,ModelMap map) {
		repository.deleteById(id);
		map.put("message", "Movie deleted sucessfully");
		return "main.html";
		
	}
	
	@GetMapping("/update")
	public String loadUpdateForm(@RequestParam long id, ModelMap map) {
	   
	    Movie movie = repository.findById(id).orElseThrow(() -> new RuntimeException("Movie not found with id: " + id));
	                            
	    map.put("movie", movie);   
	    return "update.html";     

	}
	
	@PostMapping("/update")
	public String updateMovie(Movie movie, ModelMap map) {
	   
	    repository.save(movie);
	    map.put("message", "Movie updated successfully");
	    return "main.html";
	}

	
	
}

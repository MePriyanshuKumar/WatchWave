package com.priyanshu.watchwave;

import java.util.List;
import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/v1/movies")
public class MovieController {
	@Autowired
	private MovieService service;

	@GetMapping
	public ResponseEntity<List<Movie>> getAllMovies() {
		return new ResponseEntity<List<Movie>>(service.findAllMovies(), HttpStatus.OK);
	}

	@GetMapping("/{imdbId}")
	public ResponseEntity<Optional<Movie>> getSingleMovie(@PathVariable String imdbId) {
		return new ResponseEntity<Optional<Movie>>(service.findMovieByImdbId(imdbId), HttpStatus.OK);
	}

}

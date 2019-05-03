package com.jps;

import java.sql.Array;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/ratingsdata")
public class RatingsResource {

	@RequestMapping("/{movieId}")
    public Rating getMovieRating(@PathVariable("movieId") String movieId) {
        return new Rating(movieId, 4);

    }
    //take user id and return list of movie user has rated 
    @RequestMapping("/user/{userId}")
    public UserRating getUserRatings(@PathVariable("userId") String userId) {
    	List<Rating> ratings=
    	 Arrays.asList(
    	new Rating("1111", 4),
		new Rating("2222", 3)

		);
    	UserRating userRating=new UserRating();
    	userRating.setRatings(ratings);
    	return userRating;
    	
    
//        UserRating userRating = new UserRating();
//        userRating.initData(userId);
//        return userRating;



    }



}
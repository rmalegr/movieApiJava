package dev.rmalegre.movies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReviewService {
    @Autowired
    private ReviewRepository reviewRepository;
    public Review createReview(String imbdId, String reviewBody) {
        Review review = new Review( reviewBody);
        reviewRepository.insert(review);

        return review;

    }
}

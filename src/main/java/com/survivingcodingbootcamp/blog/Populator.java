package com.survivingcodingbootcamp.blog;

import com.survivingcodingbootcamp.blog.model.Hashtag;
import com.survivingcodingbootcamp.blog.model.Post;
import com.survivingcodingbootcamp.blog.model.Topic;
import com.survivingcodingbootcamp.blog.repository.HashtagRepository;
import com.survivingcodingbootcamp.blog.repository.PostRepository;
import com.survivingcodingbootcamp.blog.repository.TopicRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Populator implements CommandLineRunner {

    private TopicRepository topicRepo;
    private PostRepository postRepo;
    private HashtagRepository hashtagRepo;

    public Populator(TopicRepository topicRepo, PostRepository postRepo, HashtagRepository hashtagRepo) {
        this.topicRepo = topicRepo;
        this.postRepo = postRepo;
        this.hashtagRepo = hashtagRepo;
    }

    @Override
    public void run(String... args) throws Exception {

        Topic topic1 = new Topic("Learning TDD");
        topicRepo.save(topic1);
        Hashtag hashtag1 = new Hashtag("#fun");
        hashtagRepo.save(hashtag1);
        Hashtag hashtag2 = new Hashtag("#hard");
        hashtagRepo.save(hashtag2);
        Hashtag hashtag3 = new Hashtag("#learning");
        hashtagRepo.save(hashtag3);

        Post post1 = new Post("TDD For Fun and Profit", topic1, "Lorem ipsum dolor sit amet, consectetur " +
                "adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim" +
                " veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis " +
                "aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. " +
                "Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id " +
                "est laborum.","lok",hashtag1,hashtag2,hashtag3);
        postRepo.save(post1);
        Post post2 = new Post("Test the Fear Away", topic1, "Lorem ipsum dolor sit amet, consectetur " +
                "adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim" +
                " veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis " +
                "aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. " +
                "Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id " +
                "est laborum.","lok2",hashtag1);
        postRepo.save(post2);
        Post post3 = new Post("Unit Tests and You", topic1, "Lorem ipsum dolor sit amet, consectetur " +
                "adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim" +
                " veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis " +
                "aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. " +
                "Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id " +
                "est laborum.","lok3",hashtag2,hashtag3);
        postRepo.save(post3);
        Topic topic2 = new Topic("Battling Imposter Syndrome");
        topicRepo.save(topic2);
        Topic topic3 = new Topic("Introductory Java");
        topicRepo.save(topic3);
        Topic topic4 = new Topic("Object Oriented Programming and You");
        topicRepo.save(topic4);

    }

}

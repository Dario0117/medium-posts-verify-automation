package medium.posts.verify.automation.utils;

import java.util.ArrayList;
import java.util.List;

import medium.posts.verify.automation.models.Post;

/**
 * FileManagement
 */
public class FileManagement {

    public static List<Post> readExcel() {
        List<Post> list = new ArrayList<Post>();
        list.add(new Post(
            "Spring Boot + Spring MVC + Spring Security + MySQL", 
            "Gustavo Ponce", 
            "Nov 17, 2016", 
            "5")
        );
        list.add(new Post(
            "How to scale Microservices with Message Queues, Spring Boot, and Kubernetes", 
            "Daniele Polencic", 
            "Jul 24, 2018", 
            "16")
        );
        // list.add(new Post(
        //     "How to make responsiveness super simple with CSS Variables", 
        //     "Per Harald Borgen", 
        //     "Feb 26, 2018", 
        //     "5")
        // );
        return list;
    }
}
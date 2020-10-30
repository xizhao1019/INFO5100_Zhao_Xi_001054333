/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7.analytics;

/**
 *
 * @author harshalneelkamal
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import lab7.entities.Comment;
import lab7.entities.Post;


public class AnalysisHelper {
    //Find Average number of likes per comment.
    //TODO
    public void getAverageLikesPerCommets() {
        Map<Integer, Comment> comments = DataStore.getInstance().getComments();
        
        int likeNumber = 0;
        int commentNumber = comments.size();
        
        for (Comment c : comments.values()) {
            likeNumber += c.getLikes();
        }
        
        System.out.println("");
        System.out.println("1.Average of likes per comment: " + likeNumber / commentNumber);
        System.out.println("");
            
    }
    
    //Find the post with most liked comments
    public void getTheMostLikedComments(){
        Map<Integer, Comment> comments = DataStore.getInstance().getComments();
        
        Map<Comment,Integer> commentslike = new HashMap<>();
        
        for (Comment c : comments.values()) {
            commentslike.put(c,c.getLikes());
        }
        
        //sort map by likeNumber
        List<Map.Entry<Comment,Integer>> list = 
                new ArrayList<>(commentslike.entrySet());
        Collections.sort(list,new Comparator<Map.Entry<Comment,Integer>>() {
            @Override
            public int compare(Map.Entry<Comment, Integer> o1, Map.Entry<Comment, Integer> o2) {
                return -o1.getValue().compareTo(o2.getValue());
            }
        });
        
        boolean duplicated = false;
        
        if (list.get(0).getValue().equals(list.get(1).getValue())) {
            duplicated = true;
            }
        
        if (duplicated) {
            System.out.println("2.The most liked comments are:");
            for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getValue().equals(list.get(0).getValue())) {
                System.out.println(list.get(i).getKey() + " with " + list.get(i).getValue() + " likes.");
              }
            }
        }
        else {
            System.out.println("2.The most liked comment is:");
            System.out.println(list.get(0).getKey() + " with " + list.get(0).getValue() + " likes.");
        }
        System.out.println("");
        
        //print sorted list
//        System.out.println("The sorted list UserID,Likes:");
//        for(int i = 0; i < list.size(); i++){
//            System.out.println(list.get(i).getKey().getUserId()+" , "+ list.get(i).getValue());
//        }

        //print original comments
//        System.out.println("");
//        System.out.println("The original comments:");
//        for (Comment c : comments.values()) {
//           System.out.println(c.toString());
//        }
//        System.out.println("");
    }
    
    //Find the post with most comments
    public void getThePostWithMostComments(){
        Map<Integer,Post> posts = DataStore.getInstance().getPosts();
        
        Map<Post,Integer> postsWithComments = new HashMap<>();
        
        int commentNum = 0;
        
        for (Post p : posts.values()) {
            commentNum = p.getComments().size();
            postsWithComments.put(p,commentNum);
        }
          
        //sort map by comment number
        List<Map.Entry<Post,Integer>> list = 
                new ArrayList<>(postsWithComments.entrySet());
         Collections.sort(list,new Comparator<Map.Entry<Post,Integer>>(){
            @Override
            public int compare(Map.Entry< Post,Integer> o1, Map.Entry<Post,Integer> o2) {
                return -o1.getValue().compareTo(o2.getValue());
            }
         });
             
        boolean duplicated = false;
        if (list.get(1).getValue().equals(list.get(0).getValue())) {
            duplicated = true;
        }
        
        if (!duplicated) {
            System.out.println("3.The post with the most comments is PostID " + list.get(0).getKey().getPostId() + 
                " with " + list.get(0).getValue() + " comments.");
        }else{
                System.out.println("3.The posts with the most comments are:");
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getValue().equals(list.get(0).getValue())) {
                System.out.println("PostID " + list.get(i).getKey().getPostId() + " with " + list.get(i).getValue() + " comments.");        
                }
            }
        }
        System.out.println("");
        
        //print sorted list
//        System.out.println("The sorted lists UserID, PostID, CommentsNumber:");
//        for (int i = 0; i < list.size(); i++) {
//            
//            System.out.println(list.get(i).getKey().getUserId() +" , "+ list.get(i).getKey().getPostId() + 
//                    " , " + list.get(i).getValue());
//        }
        
        //print origin posts
//        System.out.println("");
//        System.out.println("The origin posts UserID, PostID, CommentsNumber:");
//        for (Post p : posts.values()) {
//            System.out.println(p.getUserId() + " , " + p.getPostId() + " , " + p.getComments().size());
//        }
//        System.out.println("");
        
    }
    
    public void inactiveUsersPosts(){
        Map<Integer,Post> posts = DataStore.getInstance().getPosts();
        
        Map<Integer,Integer> temp = new HashMap<>();
        
         Map<Integer,Integer> UserPost = new HashMap<>();
        
            for(Post p : posts.values()){
                temp.put(p.getUserId(),null);
            }
            
            for (int i = 0; i < temp.keySet().size(); i ++) {
                int totalPosts = 0;
                for (Post p : posts.values()) {
                   if(p.getUserId() == i) {
                       totalPosts ++;
                    }
                }
               UserPost.put(i, totalPosts);
            }
        
        //sort map by total posts number
        List<Map.Entry<Integer,Integer>> list = 
                new ArrayList<>(UserPost.entrySet());
         Collections.sort(list,new Comparator<Map.Entry<Integer,Integer>>(){
            @Override
            public int compare(Map.Entry< Integer,Integer> o1, Map.Entry<Integer,Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
         });
         
         System.out.println("4.The Top5 inactive users based on total posts are:");
         for (int i = 0; i < 5; i++) {
             System.out.println("UserID " + list.get(i).getKey() + " with " + list.get(i).getValue() + " posts in total.");
        }
         
        System.out.println("");
        
        //print sorted list
//        System.out.println("The sorted lists UserID, PostsNumber:");
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i).getKey()+" , "+ list.get(i).getValue());
//        }
//        System.out.println("");
        
        //print original posts
//        System.out.println("The original posts UserID, PostID:");
//        for (Integer i : posts.keySet()) {
//            System.out.println(posts.get(i).getUserId() + " , " + posts.get(i).getPostId());
//        }
//        System.out.println("");
        
    }
    
     public void inactiveUsersCommts(){
        Map<Integer,Comment> comments = DataStore.getInstance().getComments();
        
        Map<Integer,Integer> temp = new HashMap<>();
        
         Map<Integer,Integer> UserComments = new HashMap<>();
        
            for(Comment c : comments.values()){
                temp.put(c.getUserId(),null);
            }
            
            for (int i = 0; i < temp.keySet().size(); i ++) {
                int totalCommts = 0;
                for (Comment c : comments.values()) {
                   if(c.getUserId() == i) {
                       totalCommts ++;
                    }
                }
               UserComments.put(i, totalCommts);
            } 
            
         //sort map by total comments
         List<Map.Entry<Integer,Integer>> list = 
                new ArrayList<>(UserComments.entrySet());
         Collections.sort(list,new Comparator<Map.Entry<Integer,Integer>>(){
            @Override
            public int compare(Map.Entry< Integer,Integer> o1, Map.Entry<Integer,Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
         });
         
         System.out.println("5.The Top5 inactive users based on total comments are:");
         for (int i = 0; i < 5; i++) {
             System.out.println("UserID " + list.get(i).getKey() + " with " + list.get(i).getValue() + " comments in total.");
        }
         
        System.out.println("");
        
        //print sorted list
//        System.out.println("The sorted lists UserID, CommentsNumber:");
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i).getKey()+" , "+ list.get(i).getValue());
//        }
//        System.out.println("");
        
        //print origin comments  
//        System.out.println("The original comments UserID, CommentsNumber:");
//       for (Comment c : comments.values()) {
//           System.out.println(c.getUserId() + " , " + c.toString());
//        }
//       System.out.println("");
        
     }
    
    public void inactiveUsersOverall(){
        //map of total comments
        Map<Integer,Comment> comments = DataStore.getInstance().getComments();
        
        Map<Integer,Integer> temp = new HashMap<>();
        
        Map<Integer,Integer> UserComments = new HashMap<>();
        
            for(Comment c : comments.values()){
                temp.put(c.getUserId(),null);
            }
            
            for (int i = 0; i < temp.keySet().size(); i ++) {
                int totalCommts = 0;
                for (Comment c : comments.values()) {
                   if(c.getUserId() == i) {
                       totalCommts ++;
                    }
                }
               UserComments.put(i, totalCommts);
            } 
            
        //map of total likes
        Map<Integer,Integer> UserLikes = new HashMap<>();
        
        for (int i = 0; i < temp.keySet().size(); i ++) {
                int totalLikes = 0;
                for (Comment c : comments.values()) {
                   if(c.getUserId()== i) {
                       totalLikes = totalLikes + c.getLikes();
                   } 
                }
               UserLikes.put(i, totalLikes);
            }
            
        //map of total posts
        Map<Integer,Post> posts = DataStore.getInstance().getPosts();
        
        Map<Integer,Integer> UserPost = new HashMap<>();
        
            for(Post p : posts.values()){
                temp.put(p.getUserId(),null);
            }
            
            for (int i = 0; i < temp.keySet().size(); i ++) {
                int totalPosts = 0;
                for (Post p : posts.values()) {
                   if(p.getUserId() == i) {
                       totalPosts ++;
                    }
                }
               UserPost.put(i, totalPosts);
            }
            
        //map of overall (sum of comments, posts and likes)
        Map<Integer,Integer> UserOverall = new HashMap<>();
        for (int i = 0; i < temp.keySet().size(); i++) {
            int sum = UserComments.get(i)+ UserLikes.get(i) + UserPost.get(i);
            UserOverall.put(i, sum);
        }
        
        //sort map by sum
        List<Map.Entry<Integer,Integer>> list = 
                new ArrayList<>(UserOverall.entrySet());
         Collections.sort(list,new Comparator<Map.Entry<Integer,Integer>>(){
            @Override
            public int compare(Map.Entry< Integer,Integer> o1, Map.Entry<Integer,Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
         });
         
         System.out.println("6.The Top5 inactive users overall(sum of comments, posts and likes) are:");
         for (int i = 0; i < 5; i++) {
             System.out.println("UserID " + list.get(i).getKey() + " with " + list.get(i).getValue() + " sum in total. (" + 
                     UserComments.get(list.get(i).getKey()) + "comments + " + UserLikes.get(list.get(i).getKey()) + "likes + " + UserPost.get(list.get(i).getKey()) + "posts)");
        }
         
        System.out.println("");
        
        
        //print sorted UserOverall
//        System.out.println("Sorted: UserID, Sum");
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }
//        System.out.println("");
        
        //print original UserOverall
//        System.out.println("Original: UserID, Sum");
//        for (int i = 0; i < UserOverall.size(); i++) {
//            System.out.println(i + " , " + UserOverall.get(i));
//        }
//        System.out.println("");
        
        //print UserComments
//        System.out.println("UserID, CommentsNum");
//        for (int i = 0; i < UserComments.size(); i++) {
//            System.out.println(i + " , " + UserComments.get(i));
//        }
//        System.out.println("");
        
        //print UserLikes
//        System.out.println("UserID, LikesNum");
//        for (int i = 0; i < UserLikes.size(); i++) {
//            System.out.println(i + " , " + UserLikes.get(i));
//        }
//        System.out.println("");
        
        //print UserPost
//        System.out.println("UserID, PostsNum");
//        for (int i = 0; i < UserPost.size(); i++) {
//            System.out.println(i + " , " + UserPost.get(i));
//        }
//        System.out.println("");
        
        
        //print origin comments  
//        System.out.println("The original comments UserID, LikesNumber:");
//        for (Comment c : comments.values()) {
//           System.out.println(c.getUserId() + " , " + c.getLikes());
//        }
//        System.out.println("");
//        
//        //print original posts
//        System.out.println("The original posts UserID, PostID, CommentsNumber:");
//        for (Post p : posts.values()) {
//            System.out.println(p.getUserId() + " , " + p.getPostId() + " , " + p.getComments().size());
//        }
//        System.out.println("");
   
    }
    
    public void proactiveUsersOverall(){
        //map of total comments
        Map<Integer,Comment> comments = DataStore.getInstance().getComments();
        
        Map<Integer,Integer> temp = new HashMap<>();
        
        Map<Integer,Integer> UserComments = new HashMap<>();
        
            for(Comment c : comments.values()){
                temp.put(c.getUserId(),null);
            }
            
            for (int i = 0; i < temp.keySet().size(); i ++) {
                int totalCommts = 0;
                for (Comment c : comments.values()) {
                   if(c.getUserId() == i) {
                       totalCommts ++;
                    }
                }
               UserComments.put(i, totalCommts);
            } 
            
        //map of total likes
        Map<Integer,Integer> UserLikes = new HashMap<>();
        
        for (int i = 0; i < temp.keySet().size(); i ++) {
                int totalLikes = 0;
                for (Comment c : comments.values()) {
                   if(c.getUserId()== i) {
                       totalLikes = totalLikes + c.getLikes();
                   } 
                }
               UserLikes.put(i, totalLikes);
            }
            
        //map of total posts
        Map<Integer,Post> posts = DataStore.getInstance().getPosts();
        
        Map<Integer,Integer> UserPost = new HashMap<>();
        
            for(Post p : posts.values()){
                temp.put(p.getUserId(),null);
            }
            
            for (int i = 0; i < temp.keySet().size(); i ++) {
                int totalPosts = 0;
                for (Post p : posts.values()) {
                   if(p.getUserId() == i) {
                       totalPosts ++;
                    }
                }
               UserPost.put(i, totalPosts);
            }
            
        //map of overall (sum of comments, posts and likes)
        Map<Integer,Integer> UserOverall = new HashMap<>();
        for (int i = 0; i < temp.keySet().size(); i++) {
            int sum = UserComments.get(i)+ UserLikes.get(i) + UserPost.get(i);
            UserOverall.put(i, sum);
        }
        
        //sort map by sum
        List<Map.Entry<Integer,Integer>> list = 
                new ArrayList<>(UserOverall.entrySet());
         Collections.sort(list,new Comparator<Map.Entry<Integer,Integer>>(){
            @Override
            public int compare(Map.Entry< Integer,Integer> o1, Map.Entry<Integer,Integer> o2) {
                return -o1.getValue().compareTo(o2.getValue());
            }
         });
         
         System.out.println("7.The Top5 proactive users overall(sum of comments, posts and likes) are:");
         for (int i = 0; i < 5; i++) {
             System.out.println("UserID " + list.get(i).getKey() + " with " + list.get(i).getValue() + " sum in total. (" + 
                     UserComments.get(list.get(i).getKey()) + "comments + " + UserLikes.get(list.get(i).getKey()) + "likes + " + UserPost.get(list.get(i).getKey()) + "posts)");
        }
         
        System.out.println("");
        
        
        //print sorted UserOverall
//        System.out.println("Sorted: UserID, Sum");
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }
//        System.out.println("");
        
        //print original UserOverall
//        System.out.println("Original: UserID, Sum");
//        for (int i = 0; i < UserOverall.size(); i++) {
//            System.out.println(i + " , " + UserOverall.get(i));
//        }
//        System.out.println("");
        
        //print UserComments
//        System.out.println("UserID, CommentsNum");
//        for (int i = 0; i < UserComments.size(); i++) {
//            System.out.println(i + " , " + UserComments.get(i));
//        }
//        System.out.println("");
        
        //print UserLikes
//        System.out.println("UserID, LikesNum");
//        for (int i = 0; i < UserLikes.size(); i++) {
//            System.out.println(i + " , " + UserLikes.get(i));
//        }
//        System.out.println("");
        
        //print UserPost
//        System.out.println("UserID, PostsNum");
//        for (int i = 0; i < UserPost.size(); i++) {
//            System.out.println(i + " , " + UserPost.get(i));
//        }
//        System.out.println("");
        
        
        //print origin comments  
//        System.out.println("The original comments UserID, LikesNumber:");
//        for (Comment c : comments.values()) {
//           System.out.println(c.getUserId() + " , " + c.getLikes());
//        }
//        System.out.println("");
//        
//        //print original posts
//        System.out.println("The original posts UserID, PostID, CommentsNumber:");
//        for (Post p : posts.values()) {
//            System.out.println(p.getUserId() + " , " + p.getPostId() + " , " + p.getComments().size());
//        }
//        System.out.println("");
        
    }
   
    
    
    
    
    
}

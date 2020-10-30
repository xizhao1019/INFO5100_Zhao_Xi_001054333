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
        System.out.println("Average of likes per comment: " + likeNumber / commentNumber);
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
        
        boolean duplicated = true;
        for (int i = 1; i < list.size(); i++) {
            duplicated = list.get(i).getValue() == list.get(0).getValue();
            break;
        }
        
        if (!duplicated) {
            System.out.println("The most liked comment is: ");
            System.out.println(list.get(0).getKey() + 
            " with " + list.get(0).getValue() + " likes.");
            System.out.println("");
        }else{
            System.out.println("The most liked comments are: ");
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getValue() == list.get(0).getValue()) {
                System.out.println(list.get(i).getKey() + 
                " with " + list.get(i).getValue() + " likes.");
                }
            }
        }
        System.out.println("");
//        Iterator<Map.Entry<Comment,Integer>> iterator = list.iterator();
//        for(Map.Entry<Comment,Integer> m : list){
//            System.out.println(m.getKey()+" "+ m.getValue());
//        }
            
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
             
        boolean duplicated = true;
        for (int i = 1; i < list.size(); i++) {
            duplicated = list.get(i).getValue() == list.get(0).getValue();
            break;
        }
        
        if (!duplicated) {
            System.out.println("The post with the most comments is PostID " + list.get(0).getKey().getPostId() + 
                " with " + list.get(0).getValue() + " comments.");
        }else{
                System.out.println("The posts with the most comments are:");
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getValue() == list.get(0).getValue()) {
                System.out.println("PostID " + list.get(i).getKey().getPostId() + 
                " with " + list.get(i).getValue() + " comments.");        
                }
            }
        }
        System.out.println("");

//        for (int i = 0; i < list.size(); i++) {
//            
//            System.out.println(list.get(i).getKey().getPostId() +" "+ list.get(i).getKey().getUserId() + 
//                    " " + list.get(i).getValue());
//        }
        
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
                       UserPost.put(i, totalPosts);
                    }
                }
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
         
         System.out.println("The Top5 inactive users based on posts number are:");
         for (int i = 0; i < 5; i++) {
             System.out.println("UserID " + list.get(i).getKey() + " with " + list.get(i).getValue() + " posts in total.");
        }
         
        System.out.println("");
        
//        for (int i = 0; i < list.size(); i++) {
//            
//            System.out.println(list.get(i).getKey()+" "+ list.get(i).getValue());
//        }
        
        
//         System.out.println("");
//        for (Integer i : posts.keySet()) {
//           
//            System.out.println(posts.get(i).getUserId() + " " + posts.get(i).getComments().size());
//        }
        
    }
    
    
    
    
    
    
    
    
}

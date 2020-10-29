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
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.LinkedList;
import lab7.entities.Comment;


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
        
        System.out.println("Average of likes per comment: " + likeNumber / commentNumber);
            
    }
    
    //Find the post with most liked comments
    public void getTheMostLikedComments(){
        Map<Integer, Comment> comments = DataStore.getInstance().getComments();
        
        int likeNumber = 0;
        Map<Comment,Integer> commentslike = new HashMap<>();
        
        for (Comment c : comments.values()) {
            likeNumber += c.getLikes();
            commentslike.put(c,likeNumber);
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
        
        System.out.println(list.get(0));

//        Iterator<Map.Entry<Comment,Integer>> iterator = list.iterator();
//        for(Map.Entry<Comment,Integer> m : list){
//            System.out.println(m.getKey()+" "+ m.getValue());
//        }
            
    }
    
    
}

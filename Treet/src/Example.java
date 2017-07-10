/**
 * Created by kayla.flynn on 7/5/2017.
 */

import com.teamtreehouse.Treet;
import com.teamtreehouse.Treets;

import java.util.*;

public class Example {
    public static void main(String[] args) {
/*       Treet treet = new Treet(
                "craig",
                "Want to be famous? #nothing @isshowing",
                new Date(1421849732000L));
        Treet secondTreet = new Treet(
                "journeytocode",
                "@treehouse makes learning fun #treet",
                new Date(1421878768000L)
        );
        System.out.printf("This is a new Treet:  %s %n", treet);
        System.out.println("The words are:");
        for (String word: treet.getWords()){
            System.out.println(word);
        }
        Treet[] treets = {treet, secondTreet};
        Arrays.sort(treets);
        for (Treet exampleTreet : treets){
            System.out.println(exampleTreet);
        }
        Treets.save(treets);*/

// now the code has been generated and saved with the serial number
// so you don't have to keep running it
        // Treet[] reloadedTreets = Treets.load();


        Treet[] treets = Treets.load();
        System.out.printf("There are %d treets. %n", treets.length);
        Set<String> allHashTags = new HashSet<String>();
        Set<String> allMentions = new TreeSet<String>();
        for (Treet treet: treets){
            allHashTags.addAll(treet.getHashTags());
            allMentions.addAll(treet.getMentions());

        }
        System.out.printf("Hashtags: %s %n", allHashTags);
        System.out.printf("Mentions: %s %n", allMentions);

        // Integer is different than int
        Map<String, Integer> hashTagCounts = new HashMap<String,Integer>();
        for (Treet treet: treets) {
            for (String hashTag : treet.getHashTags()){
                Integer count = hashTagCounts.get(hashTag);
                if (count == null){
                    count = 0;
                }
                count++;
                hashTagCounts.put(hashTag, count);

            }

        }
        System.out.printf("Hashtag counts: %s %n", hashTagCounts);

        Map<String,List<Treet>> treetsByAuthor = new HashMap<String, List<Treet>>();
        for (Treet treet : treets) {
            List<Treet> authoredTreets = treetsByAuthor.get(treet.getAuthor());
            if (authoredTreets == null) {
                authoredTreets = new ArrayList<Treet>();
                treetsByAuthor.put(treet.getAuthor(),authoredTreets);
            }
            authoredTreets.add(treet);
        }
        System.out.printf("Treets by author: %s %n ", treetsByAuthor);
        System.out.printf("Treets by craig: %s %n ", treetsByAuthor.get("craig"));



/*        for (Treet reloaded : reloadedTreets) {
            System.out.println(reloaded);
        }*/

// To get the hashtags out...
/*
        Treet originalTreet = treets[1];
        System.out.println("Hastags:");
        for (String hashtag : originalTreet.getHashTags()){
            System.out.println(hashtag);
        }
*/

    }
}

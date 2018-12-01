/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package chapter5.makingDiffrence;

/**
 * (Global Warming Facts Quiz) The controversial issue of global warming has been widely
publicized by the film “An Inconvenient Truth,” featuring former Vice President Al Gore. Mr. Gore
and a U.N. network of scientists, the Intergovernmental Panel on Climate Change, shared the 2007
Nobel Peace Prize in recognition of “their efforts to build up and disseminate greater knowledge
about man-made climate change.” Research both sides of the global warming issue online (you
might want to search for phrases like “global warming skeptics”). Create a five-question multiple-
choice quiz on global warming, each question having four possible answers (numbered 1–4). Be ob-
jective and try to fairly represent both sides of the issue. Next, write an application that administers
the quiz, calculates the number of correct answers (zero through five) and returns a message to the
user. If the user correctly answers five questions, print “Excellent”; if four, print “Very good”; if
three or fewer, print “Time to brush up on your knowledge of global warming,” and include a list
of some of the websites where you found your facts.
 *
 * @author claude
 */
import java.util.Scanner;
public class GlobalWarmingFactsQuiz {

    public static void main(String[] args) {
        int answer;
        int score = 0;
        
        Scanner input = new Scanner (System.in);
        
        System.out.printf("%s%s%s%s%s","By how much have average temperatures risen since 1880?\n",
                 "1: 0.4 degrees F\n",
                "2: 1.4 degrees F\n",
                "3: 2.4 degrees F\n",
                "4: 3.4 degrees F\n");
        answer = input.nextInt();
        if(answer == 2){
            score++;
        }
        else{
            System.out.println("Incorrect answer,the answer is 2");
        }
        System.out.printf("%s","Montana's Glacier National Park had 150 glaciers in 1910.\n"
                + "How many does it have now?\n"
                +"1: 0\n"
                + "2: 7\n"
                + "3: 17\n"
                +"4: 27\n");
         answer = input.nextInt();
        if(answer == 4){
            score++;
        }
        else{
            System.out.println("Incorrect answer,the answer is 4");
        }
        System.out.printf("%s","What is the most abundant greenhouse gas?\n"
                + "1: water vapor\n"
                + "2: carbon dioxide\n"
                + "3: methane\n"
                + "4: carbon monoxide\n");
        
         answer = input.nextInt();
        if(answer == 1){
            score++;
        }
        else{
            System.out.println("Incorrect answer,the answer is 1");
        }
         System.out.printf("%s","Which of these should you NOT do to help stop global warming?\n"
                + "1: Use less hot water\n"
                + "2: Reuse your shopping bag\n"
                + "3: Plant a tree\n"
                + "4: Take a bath instead of a shower\n");
          answer = input.nextInt();
        if(answer == 4){
            score++;
        }
        else{
            System.out.println("Incorrect answer,the answer is 4");
        }
        System.out.printf("%s","Which of these should you NOT do to help stop global warming?\n"
                + "1: Buy more frozen foods\n"
                + "2: Fly less\n"
                + "3: Use a clothesline instead of a dryer\n"
                + "4: Cover pots while cooking\n");
         answer = input.nextInt();
        if(answer == 1){
            score++;
        }
        else{
            System.out.println("Incorrect answer,the answer is 1");
        }
        switch(score){
            case 5:
                System.out.println("Excellent");
                break;
            case 4:
                System.out.println("Very good");
                break;
                
            default:
               System.out.printf("%s","Time to brush up on your knowledge of global warming:\n"
                        +"http://news.nationalgeographic.com/news/2004/12/"
                        +"1206_041206_global_warming.html\n"
                        +"http://lwf.ncdc.noaa.gov/oa/climate/gases.html\n"
                        + "http://globalwarming-facts.info/50-tips.html\n");
               break;
        }

        
    }
    
}

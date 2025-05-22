package java8.streamTest;

import java.util.Arrays;

//Write a java program to find the percentage of uppercase letters, lowercase letters, digits and other
// special characters(including space) in the given string. For example, In “Tiger Runs @ The Speed Of 100 km/hour.”,
//Number of uppercase letters is 5. So percentage is 13.16%
//Number of lowercase letters is 20. So percentage is 52.63%
//Number of digits is 3. So percentage is 7.89%
//Number of other characters is 10. So percentage is 26.32%
//Feb batch 3rd program
public class FindPercentageOfCombination {
    public static void main(String[] args) {
       String s="Tiger Runs @ The Speed Of 100 km/hour.";

       long lowerCase=0;
       long upperCase=0;
       long digits=0;
       long otherCharacters=0;

       //normal way:-

       for(int i=0;i<s.length();i++) {

           if (s.charAt(i) >= 65 && s.charAt(i) < 90) {
               upperCase++;
           } else if (s.charAt(i) >= 97 && s.charAt(i) <= 122) {
               lowerCase++;
           } else if (s.charAt(i) >= 48 && s.charAt(i) <= 57) {
               digits++;
           } else {
               otherCharacters++;
           }
       }
           int totalChars=s.length();

           System.out.println("Number of uppercase letters is  "+upperCase+" percentage is "+(upperCase*100)/totalChars);
           System.out.println("Number of lowercase letters is  "+lowerCase+" percentage is "+(lowerCase*100)/totalChars);
           System.out.println("Number of digits is  "+digits+" percentage is "+(digits*100)/totalChars);
           System.out.println("Number of other characters is "+otherCharacters+" percentage is "+(otherCharacters*100)/totalChars);

       //Using streams:-

        upperCase= s.chars().filter(Character::isUpperCase).count();
        lowerCase= s.chars().filter(Character::isLowerCase).count();
        digits= s.chars().filter(Character::isDigit).count();
        otherCharacters= totalChars-(upperCase+lowerCase+digits);



    }
}

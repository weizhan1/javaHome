package javaHome;

public class MyHtmlTagRemover {
	 
    public static void main(String a[]){
        String text = "<B>I don't want this to be bold<\\B>";
        System.out.println(text);
        text = text.replaceAll("\\<.*?\\>", "");
        System.out.println(text);
    }
}

class MyStringComp {
	 
    public static void main(String a[]){
     
        String c = "We are comparing the content with a StringBuffer content";
        StringBuffer sb =
            new StringBuffer("We are comparing the content with a StringBuffer content");
        /**
         * We can use contentEquals() method to compare content with a StringBuffer.
         * It returns boolean value.
         */
        if(c.contentEquals(sb)){
            System.out.println("The content is equal");
        } else {
            System.out.println("The content is not equal");
        }
        StringBuffer asb =
            new StringBuffer("You cannot compare the content with a String content");
        if(c.contentEquals(asb)){
            System.out.println("The content is equal");
        } else {
            System.out.println("The content is not equal");
        }
    }
}

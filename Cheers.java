// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    String theWord=args[0];
            int countCherring=Integer.parseInt(args[1]);
            System.out.println(theWord +countCherring);
            for(int i=0;i<theWord.length();i++)
            {
                for(int j=0;j<12;j++)
                {
                String checkWord="AEFHILMNORSX";
                if(theWord.charAt(i)==checkWord.charAt(i))
                {
                 System.out.println("Give me an "+ theWord.charAt(i)+": "+ theWord.charAt(i)+"! ");     
                }
                else System.out.println("Give me a "+ theWord.charAt(i)+": "+ theWord.charAt(i)+"! ");
                }
            }
            /* 
            System.out.println("What does that spell?");
            for(int i=0;i<countCherring;i++)
            {
             System.out.println(theWord+" ! ! ! ");   
           }
            */
            
        }


}
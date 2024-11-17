// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    String theWord=args[0];
            int countCherring=Integer.parseInt(args[1]);
            String checkWord="AEFHILMNORSX";
            for(int i=0;i<theWord.length();i++)
            {
                int theChar=theWord.charAt(i);
                if(checkWord.indexOf(theChar)>=0)
                {
                 System.out.println("Give me an "+ theWord.charAt(i)+": "+ theWord.charAt(i)+"! ");     
                } else { System.out.println("Give me a  "+ theWord.charAt(i)+": "+ theWord.charAt(i)+"! ");
                }
            }
        //prith the part 2
            System.out.println("What does that spell?");
            for(int i=0;i<countCherring;i++)
             System.out.println(theWord+" ! ! !");   
          
        }


}
// Prints a crowd cheering output.
public class Cheers {
    public static void main(String[] args) {
        String word = args[0];
        int countCherring = Integer.parseInt(args[1]);
        String theWord="";

        for(int i=0;i<word.length();i++)
        {
        char charW=word.charAt(i);
        if(charW=='a'){
            charW='A';
        }else if(charW=='b'){
            charW='B';
         } else if(charW=='c'){
                charW='C';
         } else if(charW=='d'){
                charW='D';
         } else if(charW=='e'){
                charW='E';
        } else if(charW=='f'){
                charW='F';
         } else if(charW=='g'){
                charW='G';
         } else if(charW=='h'){
                charW='H';
         } else if(charW=='i'){
                charW='I';
         } else if(charW=='g'){
                charW='G';
        } else if(charW=='k'){
                charW='K';
        } else if(charW=='l'){
                charW='L';
         } else if(charW=='n'){
                charW='N';
         } else if(charW=='m'){
                charW='M';
         } else if(charW=='o'){
             charW='O';
        } else if(charW=='p'){
                charW='P';
         } else if(charW=='q'){
                charW='Q';
        } else if(charW=='r'){
                charW='R';
         } else if(charW=='s'){
                charW='S';
         } else if(charW=='t'){
                charW='T';
         } else if(charW=='u'){
                charW='U';
         } else if(charW=='v'){
                charW='V';
         } else if(charW=='w'){
                charW='W';
        } else if(charW=='x'){
                charW='X';
        } else if(charW=='y'){
                charW='Y';
        } else if(charW=='z'){
                charW='Z';
        }
        theWord= theWord+charW;
        }

        String checkWord = "AEFHILMNORSX";

        for (int i = 0; i < theWord.length(); i++) {
            int theChar = theWord.charAt(i);
            if (checkWord.indexOf(theChar) >= 0) {
                System.out.println("Give me an " + theWord.charAt(i) + ": " + theWord.charAt(i) + "!");
            } else {
                System.out.println("Give me a  " + theWord.charAt(i) + ": " + theWord.charAt(i) + "!");
            }
        }
        // prith the part 2
        System.out.println("What does that spell?");
        for (int i = 0; i < countCherring; i++)
            System.out.println(theWord + "!!!");
    }
}
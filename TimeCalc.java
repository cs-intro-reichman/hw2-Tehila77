public class TimeCalc {
    public static void main(String[] args) {
    int hours=Integer.parseInt(""+args[0].charAt(0)+ args[0].charAt(1));
    int minutes=Integer.parseInt(""+args[0].charAt(3)+args[0].charAt(4));
    int minutesToAdd=Integer.parseInt(args[1]);
    int totalMinutes=(hours*60)+minutes+minutesToAdd;
    int totalHours=totalMinutes/60;
    int newHours=totalHours%24;
    int newMinutes= totalMinutes-(totalHours*60);
    //if the mintes <10 add '0' to the print
    String finalMinutes=" ";
    if(newMinutes<10)finalMinutes="0"+newMinutes;
    else finalMinutes=""+newMinutes;
    //if the mintes <10 add '0' to the print
    String finalHours=" ";
    if(newHours<10)finalHours="0"+newHours;
    else finalHours=""+newHours;
     System.out.println(finalHours+":"+finalMinutes);
    }
}

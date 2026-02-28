package Day18;

public class Goal {
    static  String interpret(String command){
        String Goal=command;
        Goal=Goal.replace("()","o");
        Goal=Goal.replace("(al)", "al");
        return Goal;


    }
    public static void main(String[] args) {
       String command = "G()()()()(al)";
       String ans=interpret(command);
       System.out.println(ans);

    }
}

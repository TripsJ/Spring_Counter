import java.util.Scanner;

public class Phraser {
    public Phraser() {
    }

    public void setPhrase(String phrase) {
        this.phrase = phrase;
    }

    private String phrase;

    void count_words(){
        int len = phrase.split(" ").length;
        System.out.println("The phrase contains "+len+" words");
    }

    void run(){
        Scanner sc = new Scanner(System.in);
        String input;
        System.out.println("Enter a phrase: " );
        input = sc.nextLine();
        this.setPhrase(input);
        this.count_words();
        sc.close();
    }

}

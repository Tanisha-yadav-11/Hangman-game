    import java.io.BufferedReader;
    import java.io.FileReader;
    import java.io.IOException;
    import java.util.ArrayList;
    import java.util.Random;
    import java.util.Scanner;

    public class Hangman {
    
    public static void main(String[]args){

    String filePath = "C:\\Users\\admin\\Desktop\\test.txt";
    ArrayList<String>  words = new ArrayList<> ();

    try (BufferedReader reader = new BufferedReader(new FileReader(filePath))){
    String line;
    while((line = reader.readLine()) != null){
    words.add(line.trim());} }

    catch(IOException e){
    System.out.println("Sometthing went wrong !");}

    Random random = new Random();
    Scanner scanner = new Scanner(System.in);
boolean playAgain = true;

while(playAgain){
     String word = words.get(random.nextInt(words.size()));
ArrayList<Character> wordState = new ArrayList<>();
  int wrongGuesses = 0;

    for(int i = 0 ; i < word.length() ; i++){
    wordState.add('_');}
    System.out.println("WELCOME TO JAVA HANGMAN GAME!");
    System.out.println("HINT : Guess an edible item");

    while(wrongGuesses < 6){
    System.out.println(getHangmanArt(wrongGuesses));
    System.out.print("Word: ");

    for(char c : wordState){
    System.out.print(c + " ");}
    System.out.println();
    System.out.print("Guess a letter : ");
    char guess =  scanner.next().toLowerCase().charAt(0);

    if(word.indexOf(guess) >= 0){
    System.out.println("You are CORRECT!");

    for(int i = 0 ; i < word.length() ; i++ ){
    if(word.charAt(i)==guess){
    wordState.set(i,guess);} }

    if(!wordState.contains('_')){
    System.out.print(getHangmanArt(wrongGuesses));
    System.out.println("YOU WIN!");
    System.out.println("The word was: " + word);
    break;} }

     else{wrongGuesses ++;
    System.out.println("You are WRONG!");}
        
    if(wrongGuesses >=6){
    System.out.println(getHangmanArt(wrongGuesses));
    System.out.println("GAME OVER!");
    System.out.println("YOU LOOSE");}
}

System.out.print("Would u like to play the game again? (Y/N) : ");
char choice = scanner.next().toLowerCase().charAt(0);

if(choice != 'y'){
    playAgain = false;
}

    }
    scanner.close();
}
    static String getHangmanArt(int wrongGuesses){
    return switch(wrongGuesses){
    case 0 -> """
                


                """; 
    case 1 -> """
                    O

        
                """; 
    case 2 -> """
                    O
                    |
        
                """; 
    case 3 -> """
                    O
                    |\\
        
                """; 
    case 4 -> """
                    O
                   /|\\
        
                """; 
    case 5 -> """
                    O
                   /|\\
                     \\
                """; 
    case 6 -> """
                    O
                   /|\\
                   / \\
                """; 
 
    default -> "";
    };
       }
            }




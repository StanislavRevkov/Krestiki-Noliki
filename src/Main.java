public class Main {

    public static void main(String[] arg){

        Play play = new Play();

        play.player1.name = "Игрок 1";
        play.player2.name = "Игрок 2";

        play.clearField();
        play.createField();

        while (!play.checkWinner()){

            do{
                play.doubleSign = false;
                play.isCurrentPlayer1 = true;
                play.checkNoWinner();
                if(play.checkNoWinner()){
                    System.out.println("Ничья!");
                    System.out.println("-= GAME OVER =-");
                    return;
                }
                play.assignFieldInArray();
                play.checkWinner();
                play.createField();
                if(play.checkWinner()){
                    play.player1.winner();
                    return;
                }
            } while(play.doubleSign);

            if(!play.checkWinner()){
                do{
                    play.doubleSign = false;
                    play.isCurrentPlayer1 = false;

                    if(play.checkNoWinner()){
                        System.out.println("Ничья!");
                        System.out.println("-= GAME OVER =-");
                        return;
                    }
                    play.assignFieldInArray();
                    play.checkWinner();
                    play.createField();
                    if(play.checkWinner()){
                        play.player2.winner();
                        return;
                    }
                } while(play.doubleSign);
            }
        }
    }
}
public class Play {

    public static final int FIELD_SIZE = 3;
    public static char array[][] = new char[FIELD_SIZE][FIELD_SIZE];
    public static char array2[][] = new char[FIELD_SIZE][FIELD_SIZE];
    public boolean isCurrentPlayer1;
    public boolean doubleSign;
    public boolean noWinner;

    Player player1 = new Player();
    Player player2 = new Player();

    //создает игровое поле
    public void clearField() {

      for(int i = 0; i < FIELD_SIZE; i++){
          for(int j = 0; j < FIELD_SIZE; j++){
              array[i][j] = ' ';
          }
      }
    }

    //выводит на экран поле с учетом ходов
    public void createField(){

        for(int i = 0; i < FIELD_SIZE; i++){

            for(int j = 0; j < FIELD_SIZE; j++){
                System.out.print("[" + array[i][j] + "] ");
            }
            System.out.println();
        }
    }

    //в зависимости от того какую цифру на клаве нажал игрок присваивает значение соотвтетсвующему элементу в массиве
    public  boolean assignFieldInArray(){

        int numberFromKeyboard;

        if (isCurrentPlayer1){
            numberFromKeyboard = player1.inputNumber();
        }
        else{
            numberFromKeyboard = player2.inputNumber();
        }

        char theSign;  // переменная для присвоения полю Х или О

        if (isCurrentPlayer1){
            theSign = 'X';
        }
        else {
            theSign = 'O';
        }
            if ((numberFromKeyboard == 1) && (array[2][0]==' ')) {
            array[2][0] = theSign;
        }
            else if ((numberFromKeyboard == 2) && (array[2][1]==' ')){
            array[2][1] = theSign;
        }
            else if ((numberFromKeyboard == 3) && (array[2][2]==' ')){
            array[2][2] = theSign;
        }
            else if ((numberFromKeyboard == 4) && (array[1][0]==' ')){
            array[1][0] = theSign;
        }
            else if ((numberFromKeyboard == 5)&& (array[1][1]==' ')){
            array[1][1] = theSign;
        }
            else if ((numberFromKeyboard == 6) && (array[1][2]==' ')){
            array[1][2] = theSign;
        }
            else if ((numberFromKeyboard == 7) && (array[0][0]==' ')){
            array[0][0] = theSign;
        }
            else if ((numberFromKeyboard == 8)&& (array[0][1]==' ')){
            array[0][1] = theSign;
        }
            else if ((numberFromKeyboard == 9)&& (array[0][2]==' ')){
            array[0][2] = theSign;
        }
            else{
            System.out.println("Выберите пустую ячейку!");
                doubleSign = true;
        }
        return doubleSign;
    }

    //проверка есть ли победитель
    public boolean checkWinner(){
        boolean isWinner = false;

        if(((array[0][0] == 'X') && (array[0][1] == 'X') && (array[0][2] == 'X')) ||
                ((array[1][0] == 'X') && (array[1][1] == 'X') && (array[1][2] == 'X')) ||
                ((array[2][0] == 'X') && (array[2][1] == 'X') && (array[2][2] == 'X')) ||
                ((array[0][0] == 'X') && (array[1][0] == 'X') && (array[2][0] == 'X')) ||
                ((array[0][1] == 'X') && (array[1][1] == 'X') && (array[2][1] == 'X')) ||
                ((array[0][2] == 'X') && (array[1][2] == 'X') && (array[2][2] == 'X')) ||
                ((array[0][0] == 'X') && (array[1][1] == 'X') && (array[2][2] == 'X')) ||
                ((array[0][2] == 'X') && (array[1][1] == 'X') && (array[2][0] == 'X'))){
            isWinner = true;
        }
            if (!isWinner){
                 if (((array[0][0] == 'O') && (array[0][1] == 'O') && (array[0][2] == 'O')) ||
                ((array[1][0] == 'O') && (array[1][1] == 'O') && (array[1][2] == 'O')) ||
                ((array[2][0] == 'O') && (array[2][1] == 'O') && (array[2][2] == 'O')) ||
                ((array[0][0] == 'O') && (array[1][0] == 'O') && (array[2][0] == 'O')) ||
                ((array[0][1] == 'O') && (array[1][1] == 'O') && (array[2][1] == 'O')) ||
                ((array[0][2] == 'O') && (array[1][2] == 'O') && (array[2][2] == 'O')) ||
                ((array[0][0] == 'O') && (array[1][1] == 'O') && (array[2][2] == 'O')) ||
                ((array[0][2] == 'O') && (array[1][1] == 'O') && (array[2][0] == 'O'))){
            isWinner = true;
        }
            }
        return isWinner;
    }

    //проверка на ничью
    public boolean checkNoWinner(){
        for(int i = 0; i < FIELD_SIZE; i++){
            for(int j = 0; j < FIELD_SIZE; j++){
                if(array[i][j] == ' '){
                    return false;}
            }
        }
        return true;
    }

}

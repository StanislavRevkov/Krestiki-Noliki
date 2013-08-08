import java.util.Scanner;

public class Player {

    public String name;

    //приветствие победителя
    public void winner(){
        System.out.println(name + "! Поздравляем с победой!");
        System.out.println("-= GAME OVER =-");
    }

      //ход игрока
    public int inputNumber(){
        System.out.println(name + "! Ваш ход (ячейка поля соответствует клавишам 1-9 на доп панели цифр на клавиатуре): ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}

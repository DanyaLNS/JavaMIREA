import java.util.Scanner;
import java.util.ArrayDeque;
import java.util.Deque;

public class CardGame {
    public CardGame(){
        // Ввод строк 
        Scanner in = new Scanner(System.in);
        String f, s; 
        f = in.nextLine();
        s = in.nextLine();
        in.close();
        // Создаем символьные массивы для конертации строки в числа
        char[] fir = f.toCharArray();
        char[] sec = s.toCharArray();

        // Создаем коллекцию queue и вносим туда значения введенных данных
        Deque <Integer> fDeck = new ArrayDeque<>();
        Deque <Integer> sDeck = new ArrayDeque<>();
        for(int i = 0; i < 10; i++){
            if(fir[i]!= ' ' && sec[i]!= ' '){
                fDeck.push(fir[i]-'0');
                sDeck.push(sec[i]-'0');
            }
        }
        // Основной цикл игры 
        int count = 0;
        while(true){
            if ((fDeck.isEmpty() || sDeck.isEmpty()) && count!=106){
                break;
            }
            count++;
            Integer card1, card2;
            card1 = fDeck.getFirst();
            card2 = sDeck.getFirst();
            if(card1 > card2){
                // Сценарий, если номинал карты из первой колоды больше карты из второй 
                if((card1==9) && (card2==0)){
                    // Побеждает вторая колода
                    sDeck.addLast(card1);
                    sDeck.addLast(card2);
                    fDeck.removeFirst();
                }
                else{
                    // Побеждает первая колода
                    fDeck.addLast(card1);
                    fDeck.addLast(card2);
                    sDeck.removeFirst();
                }
            }
            else{
                // Сценарий, если номинал карты из второй колоды болье карты из первой
                if((card2==9) && (card1==0)){
                    // Побеждает первая колода
                    fDeck.addLast(card1);
                    fDeck.addLast(card2);
                    sDeck.removeFirst();
                }
                else{
                    // Побеждает вторая  колода
                    sDeck.addLast(card1);
                    sDeck.addLast(card2);
                    fDeck.removeFirst();
                }
            }
        }
        // Выводим победителя или слово, отвечающее за ничью 
        if(count == 106){
            System.out.println("botva");
        }
        else{
            if(fDeck.isEmpty()){
                System.out.println("second " + count);
            }
            else{
                System.out.println("first" + count);
            }
        }
    }
}

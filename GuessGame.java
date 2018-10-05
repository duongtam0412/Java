
package Class_and_Object.GuessGame;

class GuessGame {
    
    
    void startGame(){
        //Tao moi 3 doi tuong Player 
        Player p1=new Player();
        Player p2=new Player();
        Player p3=new Player();
        //Khai bao 3 bien luu 3 gia tri ma3 dau thu doan
        int guessp1=0,guessp2=0,guessp3=0;
        //khai bao 3 bien de luu gia tri dung sai
        boolean p1IsRight=false,p2IsRight=false,p3IsRight=false;
        //sinh mot so de 3 dau thu doan
        int targetNumber=(int)(Math.random()*10);
        System.out.println("I'm thinking of a number between 0 and 9...");
        while(true){
            System.out.println("Number to guess is "+targetNumber);
            //yeu cau trung dau thu doan(goi phuong thuc guess())
            p1.guess();
            p2.guess();
            p3.guess();
            //Lay ket qua doan cua tung dau thu
            guessp1=p1.number;
            System.out.println("Player one guessed "+guessp1);
            guessp2=p2.number;
            System.out.println("Player two guessed "+guessp2);
            guessp3=p3.number;
            System.out.println("Player three guessed "+guessp3);
            //Kiem tra ket qua tung nguoi xem dung->true, sai->false
            if(guessp1==targetNumber){
                p1IsRight=true;
            }
            if(guessp2==targetNumber){
                p2IsRight=true;
            }
            if(guessp3==targetNumber){
                p3IsRight=true;
            }
            ///neu co it nhat mot nguoi doan dung dung toan tu HOAC
            if(p1IsRight||p2IsRight||p3IsRight){
                System.out.println("We have a winner!");
                System.out.println("Player one got it right? "+p1IsRight);
                System.out.println("Player two got it right? "+p2IsRight);
                System.out.println("Player three got it right? "+p3IsRight);
            }else{//neu khong thi lap lai viec yeu cau doan so
                System.out.println("Player will have to try again.");
            }
            
        }
                
    }
}

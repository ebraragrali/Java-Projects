public class GuessingGame {
    public void startGame() {
        int randomNum = (int)(Math.random() * 101);  
        int tahmin = 0;
        int denemeSayisi = 0;
        
        System.out.println("1 - 100 arasında bir sayı tuttum, tahmin etmeye çalış");
        System.out.println("Oyunu durdurmak için 'q' yaz.");

        while (tahmin != randomNum) {
            System.out.print("Tahmininizi girin: ");
            String input = System.console().readLine();  

            if (input.equalsIgnoreCase("q")) {
                System.out.println("Oyunu sonlandırdınız.");
                break;
            }

            tahmin = Integer.parseInt(input);
            denemeSayisi++;
            
            if (tahmin < randomNum) {
                System.out.println("Daha büyük bir sayı girin.");
            } else if (tahmin > randomNum) {
                System.out.println("Daha küçük bir sayı girin.");
            } else {
                System.out.println("Tebriklerrrr! Doğru tahmin.");
                System.out.println("Toplam deneme sayısı: " + denemeSayisi);
            }
        }
    }
}

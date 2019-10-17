class T_2{
   public static void main(String[] args){
    int[] amount = {60,27,42,63,19,31};
    int[] number = amount;
    number[1] = 100;
    System.out.println(amount[1]);
  }
}
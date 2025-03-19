class Shortest {
    public static void main(String[] args) {
        System.out.println(findShort("How can mirrors be real if our eyes aren't real"));
    }

    public static int findShort(String s) {
      String[] wordsArray = s.split(" ");
      String shortest = wordsArray[0];
      for(int i = 1; i<wordsArray.length;i++ ){
        if(wordsArray[i].length()<shortest.length()){
          shortest = wordsArray[i];
        }
      }
      return shortest.length();
    }
}
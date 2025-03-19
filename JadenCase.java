class JadenCase {
    public static void main(String[] args) {
        System.out.println(toJadenCase("How can mirrors be real if our eyes aren't real"));
    }

    public static String toJadenCase(String phrase) {
    System.out.println(phrase);
    if (phrase == null || phrase.isEmpty()){
      return null;
    }
		String[] splitPhrase = phrase.split(" ");
    String result = "";
    for(String word:splitPhrase){
      result+=Character.toUpperCase(word.charAt(0))+word.substring(1,word.length())+" ";
    }
		return result.trim();
    }

}
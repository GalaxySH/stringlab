class Main {
  public static void main(String[] args) {
    longestStreak("AAAAAAAABBBBBBBBBBBBBBCCCC");
  }

  public static void longestStreak(String str) {
    String curr = "";
    String maxL = "";
    int max = 0;
    int streak = 0;
    for (int i = 0; i < str.length() - 1; i++) {
      curr = Character.toString(str.charAt(i));
      if (curr.equals(Character.toString(str.charAt(i + 1)))) {
        streak++;
      } else {
        if (streak > max) {
          max = streak;
          maxL = curr;
        }
        streak = 0;
      }
    }
    System.out.println(maxL + " " + max);
  }
}
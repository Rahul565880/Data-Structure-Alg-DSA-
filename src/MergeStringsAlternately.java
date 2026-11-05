import java.util.Scanner;
public class MergeStringsAlternately {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            String word1 = sc.nextLine();
            String word2 = sc.nextLine();

            StringBuilder result = new StringBuilder();

            int max = Math.max(word1.length(), word2.length());

            for (int i = 0; i < max; i++) {

                if (i < word1.length()) {
                    result.append(word1.charAt(i));
                }

                if (i < word2.length()) {
                    result.append(word2.charAt(i));
                }
            }

            System.out.println(result);
        }
    }
public class L1668 {
    public static void main(String[] args) {
        System.out.println(maxRepeating("ababc","ba"));
    }
    public static int maxRepeating(String sequence, String word) {
        int count = 0;
        String pat = word;
        while (sequence.contains(pat)) {
            count++;
            pat += word;
        }
        return count;
    }
}

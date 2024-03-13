public class oddcount {
    public static void main(String[] args) {
        String text = "type here to search";
        text = text.replaceAll(" ", ""); // Removing white spaces

        System.out.println("Characters at odd positions (1-indexed):");
        for (int i = 0; i < text.length(); i++) {
            if ((i + 1) % 2 != 0) {
                System.out.print(text.charAt(i) + " ");
            }
        }
    }
}
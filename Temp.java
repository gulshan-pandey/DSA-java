class Permutation {

    public static void findPermutations(String input, String output, boolean[] used) {
        if (input.length() == 0) {
            System.out.println(output);
            return;
        }

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (used[ch - 'a']) {
                continue;
            }

            used[ch - 'a'] = true;
            findPermutations(input.substring(0, i) + input.substring(i + 1), output + ch, used);
            used[ch - 'a'] = false;
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        findPermutations(str, "", new boolean[26]);
    }
}

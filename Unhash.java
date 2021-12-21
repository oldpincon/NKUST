class UnHash {

    public static void main(String[] args) {
        System.out.println(revHash(6933552791181934L));
    }

    public static String letters = "cdefghijlmnoqstuvxz";

    public static String revHash(long hash) {
        String result = "";
        String newResult = "";

        while (hash != 7) {
            result += letters.charAt((int) (hash % 23));
            hash = hash / 23;
        }

        for (int i = result.length(); i >= 1; i--) {
            newResult += result.charAt(i - 1);
        }
        return newResult;
    }
}


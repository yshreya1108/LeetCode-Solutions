class Solution {
    public static int firstUniqChar(String s)
    {
        
        int[] freq = new int[26];


        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

    
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        int index = firstUniqChar(s);
        if (index != -1) {
            System.out.println("First unique character is '" + s.charAt(index) +
                               "' at index " + index);
        } else {
            System.out.println("No unique character found.");
        }
        sc.close();
    }
}

    
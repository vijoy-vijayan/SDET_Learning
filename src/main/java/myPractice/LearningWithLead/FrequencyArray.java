package myPractice.LearningWithLead;

public class FrequencyArray {
    
    public boolean anagram()
    {
        String str1="suyog";
        String str2="yogus";

        int[] res=new int[26];

        for (int i = 0; i < str1.length(); i++) {
            res[str1.charAt(i)-'a']++;
            res[str2.charAt(i)-'a']--;
        }

        for (int i :res)
            if(res[i]!=0)return false;


        return true;

    }


}

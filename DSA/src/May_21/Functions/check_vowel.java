package May_21.Functions;

public class check_vowel {
    void isVowel(char x){
        String st = "aeiouAEIOU";
        boolean have = false;
        for(int i=0; i<st.length(); i++){
            if(x == st.charAt(i)){
                have = true;
                break;
            }
        }
        if(have){
            System.out.print("It's a vowel");
        } else{
            System.out.print("It's not a vowel");
        }
    }
    public static void main(String[] args){
        check_vowel obj = new check_vowel();
        obj.isVowel('a');
    }
}

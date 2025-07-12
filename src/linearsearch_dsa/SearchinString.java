package linearsearch_dsa;

public class SearchinString {
    public static void main(String[] args) {
        String name = "lavanya";
        char target = 'n';
        System.out.println(search(name,target));
    }
    static boolean search2(String str, char target){
        //instead of String str we can also use the String name and change all the theme into name
        if(str.length()==0){//it is a function so it is denoted by ()
            return false;
        }
        for(char ch : str.toCharArray()){//for each loop can only be used in the array so we are changing the char into array
            if(target==ch){
                return true;
            }

        }
        return false;
    }
    static boolean search(String str, char target){
        if(str.length()==0){//it is a function so it is denoted by ()
            return false;
        }
        for(int i = 0;i< str.length();i++){
            if(target==str.charAt(i)){
                return true;
            }

        }
        return false;
    }

}

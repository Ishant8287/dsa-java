package backtracking;
//Similar to subset question
public class PrintSubsequences {
    static void main() {
        String s = "ab";
        subsequences(" ", s, 0);
    }

    static void subsequences(String ans, String s, int index) {
        if (index == s.length()) {
            System.out.print(ans + " ");
            return;
        }
        char ch = s.charAt(index);
        subsequences(ans + ch, s, index + 1); //Include
        subsequences(ans, s, index + 1); //Exclude
    }
}
//abc ab ac a bc bc c ""
//dry run for abc
/*
* s= abc ans = "" and index = 0
* ss("",0) -> ch = a -> ss(a,1) -> ch = b -> ss(ab , 2) -> ch = c -> ss(abc , 3) now index == length
* print abc return ss(ab,2)
* Now exclude cuz ss(ab,2) include call already done so after exclude call ss(ab , 3) base case hit
* print ab return ss(a,1) and its include call is already done so after exclude ss(a,2)
* -> its include call will run ss(ac , 3) now base case hit print ac return ss(a,2) now its exclude call will run
* i.e. ss(a,3) base case hit print a now it will return ss(a,2) its include and exclude call already
* it returns ss(a,1) now its include and exclude call also done so it will return ss("",0) and its include call already run
* so it will now run its exclude call ss("" , 1) now ch = b and now its include call will run ss(b,2) then ss(bc,3)
* index == length print bc return ss(b,2) now its exclude call will run i.e. ss(b,3) base case hit print b return
* ss("",1) its include call already done so its exclude call will run that becomes ss("",2) and then ch = c its include call will run it becomes
* ss(c,3) print c return ss("",2) now its exclude call ss("",3) base case hit print "" return ??
*/

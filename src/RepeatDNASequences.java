import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * All DNA is composed of a series of nucleotides abbreviated as A, C, G, and T, for example: "ACGAATTCCG". When studying DNA, 
 * it is sometimes useful to identify repeated sequences within the DNA.

Write a function to find all the 10-letter-long sequences (substrings) that occur more than once in a DNA molecule.

For example,

Given s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT",

Return:
["AAAAACCCCC", "CCCCCAAAAA"].
 * @author 1qa
 *
 */
public class RepeatDNASequences {
	public static List<String> findRepeatedDnaSequences(String s) {
		List<String> list = new ArrayList<String>();
		Set<Integer> set = new HashSet<Integer>();
		Set<Integer> doubleWords = new HashSet<Integer>();
		char[] map = new char[26];
	    //map['A' - 'A'] = 0;
	    map['C' - 'A'] = 1;
	    map['G' - 'A'] = 2;
	    map['T' - 'A'] = 3;
	    
        for(int i = 0; i <= s.length() - 10;i++){
        	int key = 0;
        	for(int j = i; j < i + 10;j++){
        		key <<= 2;
        		key |= map[s.charAt(j) - 'A'];
        	}
        	
        	if(set.add(key)  && doubleWords.add(key) ){
        		list.add(s.substring(i, i + 10));
        	}
        }
        return list;
    }
	

	public static void main(String[] args) {
		List<String> list = findRepeatedDnaSequences("AAAAAAAAAAAA");
		for(String s : list){
			System.out.println(s);
		}
	}
}

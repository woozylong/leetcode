/**
 * Compare two version numbers version1 and version2.
If version1 > version2 return 1, if version1 < version2 return -1, otherwise return 0.

You may assume that the version strings are non-empty and contain only digits and the . character.
The . character does not represent a decimal point and is used to separate number sequences.
For instance, 2.5 is not "two and a half" or "half way to version three", it is the fifth second-level revision of the second first-level revision.

Here is an example of version numbers ordering:

0.1 < 1.1 < 1.2 < 13.37
 * @author 1qa
 *
 */
public class VersionComparison {
	public static int compareVersion(String version1, String version2) {
		String[] v1 = version1.split("\\.");
		String[] v2 = version2.split("\\.");
		int i = 0;
		int j = 0;
        while(i < v1.length && j < v2.length){
        	if(Integer.parseInt(v1[i]) > Integer.parseInt(v2[j])) 
        		return 1;
        	if(Integer.parseInt(v1[i]) < Integer.parseInt(v2[j]))
        		return -1;
        	i++;j++;
        }
        for(;i < v1.length;i++){
        	if(Integer.parseInt(v1[i]) > 0) 
        		return 1;
        }
        for(;i < v2.length;i++){
        	if(Integer.parseInt(v2[i]) > 0) 
        		return -1;
        }
        return 0;
    }
	
	public static void main(String[] args) {
		System.out.println(compareVersion("1.0","1.0.2"));
	}
}

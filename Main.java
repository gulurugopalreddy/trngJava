public class Main
{
static int is Vowel(char ch){
ch=Character.toUpperCase(ch);
if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
return 1;
else
return 0;
}
static int countVowels(String str,int n){
if(n==1)return is vowel
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
char[] c=s.toCharArray();
int vowel=0;
for(int i=0;i<=s.length()-1;i++){
if(s.charAt(i)=='a' ||s.charAt(i)=='e' ||s.charAt(i)=='i' ||s.charAt(i)=='o' ||s.charAt(i)=='u' ||s.charAt(i)=='A' ||s.charAt(i)=='E' ||s.charAt(i)=='I' ||s.charAt(i)=='O' ||s.charAt(i)=='U')
vowel++;
}
System.out.println("Vowels:"+vowel);
}
}

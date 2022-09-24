import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * step 1. read the number of adjs and the number of nouns.
		 * step 2. read in all adjs and all nouns.
		 * step 3. for each adj:
		 * 	step 3.1 for each noun :
		 * 		step 3.1.1 : pair the selected adj and the selected noun, and output.
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		// step 1.
		int nAdjs = sc.nextInt();
		int nNouns = sc.nextInt();
		sc.nextLine();
		
		String[] adjs = new String[nAdjs];
		String[] nouns = new String[nNouns];
		
		// setp 2
		
		for (int i=0;i<nAdjs;i++) {
			adjs[i] = sc.nextLine();
		}
		
		for (int i=0;i<nNouns;i++) {
			nouns[i] = sc.nextLine();
		}
		
		// step 3:
		
		for (String adj:adjs) {
			for (String noun:nouns) {
				System.out.println(adj+" as "+noun);
			}
		}
		
		/*for (int i=0;i<nAdjs;i++) {
			String adj = adjs[i]; // select an adj
			for (int j=0;j<nNouns;j++) {
				String noun = nouns[j]; // select a noun
				// step 3.1
				System.out.println(adj+" as "+noun);
			}
		}*/
	}

}

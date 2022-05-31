import java.util.*;
class Main{
	public static void main(String args[]){
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter The total number of teams");
		int n=ip.nextInt();
		Team[] teams=new Team[n];
		for(int i=0;i<n;i++){
			teams[i] = new Team();
			System.out.println("Enter the name of Team "+(i+1));
			
			teams[i].setTeamName();
			System.out.println("Enter the win or loose of last five matches that is 1 for win and 0 for loose");
			teams[i].setTeamPoints();
		}
		int k;
		while(true){
			System.out.println("Enter the number for consecutive loss or win between 1 to 5");
			k=ip.nextInt();
			if(k<1 || k>5){
				System.out.println("Invalid------- Exit from program");
				break;}
				System.out.println("The team which has "+ k +" consecutive win/loss is");
			for(int i=0;i<n;i++){
				teams[i].consecutive(k);
			}
			
		}
	}
}
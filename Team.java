import java.util.*;
class Team{
	private String teamName;
	private int[] teamPoints = new int[5];
	private double teamAvgPoints;
	Scanner ip=new Scanner(System.in);

	public void setTeamName(){
		teamName=ip.nextLine();
	}
	
	public void setTeamPoints(){
		for(int i=0;i<5 ;i++){
			System.out.println("Enter The result of Match "+(i+1));
			teamPoints[i]=ip.nextInt();
		}
	}
	public void consecutive(int n){
		int w=0,l=0;
		for(int i=0;i<5 ;i++){
			if(teamPoints[i]==0)w=0;
			if(teamPoints[i]==1)	w++;
			if(w==n) break;
		}
		for(int i=0;i<5 ;i++){
			if(teamPoints[i]==1)l=0;
			if(teamPoints[i]==0)	l++;
			if(l==n) break;
		}
		if(w==n || l==n){
			calculateAvgpoints(n);
		}	
	}
	public void calculateAvgpoints(int n){
		
		for(int i=0;i<5 ;i++)
		if(teamPoints[i]==1)teamAvgPoints++;
		
		teamAvgPoints/=5;
		
		System.out.println("Team Name is "+ teamName +" and average points is " + teamAvgPoints );
	}
	
}

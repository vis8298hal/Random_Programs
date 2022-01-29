//Help me making this program more working

import java.util.*;
class Player{
	String name;
	String country;
	int noOfMatches;
	int noOfWickets;
	int noOfRuns;
	public Player(String str1,String str2,int num1,int num2,int num3){
		this.name=str1;
		this.country=str2;
		this.noOfMatches=num1;
		this.noOfWickets=num2;
		this.noOfRuns=num3;
	}
	public void displayPlayer(){
		System.out.println("____________________________________________________________________");
		System.out.println("          Name: "+this.name);
		System.out.println("          Country:"+this.country);
		System.out.println("          No. Of Matches :"+this.noOfMatches);
		System.out.println("          No. Of Runs :"+this.noOfRuns);
		System.out.println("          No. Of Wickets :"+this.noOfWickets);
	}
}
class Team{
	Player[] playerList = new Player[3];
	public Team(int num){
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<num;i++){
			System.out.println("Enter Player Name : ");
			String name=sc.next();
			System.out.println("Enter the country : ");
			String country=sc.next();
			System.out.println("Enter no of Matches Played : ");
			int noMa = sc.nextInt();
			System.out.println("Enter no of wickets taken : ");
			int noWi = sc.nextInt();
			System.out.println("Enter no of Runs made : ");
			int noRu = sc.nextInt();
			this.playerList[i]=new Player(name,country,noMa,noWi,noRu);
		}
	}
	public void get_min_runs()
	{
		//To display Player Data of player having Minimum Runs in Team
	}
	public void get_max_wicks()
	{
		//To display Player Data of player having Maximum wickets in Team
	}

}
class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("How many Players are in the team ? : ");
		int num=sc.nextInt();
		Team obj1=new Team(num);
	}
}
//Question
// https://arena.siesgst.ac.in/contest/DEC22/problem/DEC22A

import java.util.*;
public class WorldCupWinner { 
	public static void main(String[] args){ 
        Scanner sc=new Scanner(System.in);
        int noOfQueries=sc.nextInt();
        for(int i=0;i<noOfQueries;i++){
            int maxTeam1=-1,maxTeam2=-1;
            int noOfPlayers=sc.nextInt();
            int team1[]=new int[noOfPlayers];
            int team2[]=new int[noOfPlayers];
            int team1Freq[]=new int[12]; //team number ranges from 1 to 11
            int team2Freq[]=new int[12];
            
            //Taking input and initialising the frequency array
            for(int j=0;j<noOfPlayers;j++){
                int elem=sc.nextInt();   
                team1[j]=elem;
                team1Freq[elem]+=1;
            }
            for(int j=0;j<noOfPlayers;j++){
                int elem=sc.nextInt();   
                team2[j]=elem;
                team2Freq[elem]+=1;
            }
            for(int j=0;j<=11;j++)
            {
                if(team1Freq[j]>maxTeam1)
                    maxTeam1=team1Freq[j];
                    
                if(team2Freq[j]>maxTeam2)
                    maxTeam2=team2Freq[j];
            }
        
            if(maxTeam1>maxTeam2)
                System.out.println("TEAM1");
            else if(maxTeam1<maxTeam2)
                System.out.println("TEAM2");
            else
                System.out.println("TIE");
                
        }
	}
}
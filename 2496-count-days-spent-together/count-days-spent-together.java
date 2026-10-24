class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int[] months={31,28,31,30,31,30,31,31,30,31,30,31};
        ArrayList<Integer> common_nos=new ArrayList<>();
        
        //Alice
        int aamonth=Integer.parseInt(arriveAlice.substring(0,2));
        int aaday=Integer.parseInt(arriveAlice.substring(3));
        int lamonth=Integer.parseInt(leaveAlice.substring(0,2));
        int laday=Integer.parseInt(leaveAlice.substring(3));
        //Bob
        int abmonth=Integer.parseInt(arriveBob.substring(0,2));
        int abday=Integer.parseInt(arriveBob.substring(3));
        int lbmonth=Integer.parseInt(leaveBob.substring(0,2));
        int lbday=Integer.parseInt(leaveBob.substring(3));

        //alice no of days
        int alicestartdays=0,aliceenddays=0,bobstartdays=0,bobenddays=0;
        for(int i=0;i<aamonth-1;i++){
            alicestartdays+=months[i];
        }
       alicestartdays+=aaday;
       for(int i=0;i<lamonth-1;i++){
            aliceenddays+=months[i];
       }
    aliceenddays+=laday;

    //Bob no of days
        for(int i=0;i<abmonth-1;i++){
            bobstartdays+=months[i];
        }
       bobstartdays+=abday;
       for(int i=0;i<lbmonth-1;i++){
            bobenddays+=months[i];
       }
    bobenddays+=lbday;

       for(int i=alicestartdays;i<=aliceenddays;i++){
        for(int j=bobstartdays;j<=bobenddays;j++){
            if(i==j){
                common_nos.add(i);
            }
        }
    }
    return common_nos.size();
    }
}
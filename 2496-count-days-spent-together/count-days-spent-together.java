class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int[] months={31,28,31,30,31,30,31,31,30,31,30,31};
        int alicearrive=getdays(arriveAlice, months);
        int aliceleave=getdays(leaveAlice, months);
        int bobarrive=getdays(arriveBob, months);
        int bobleave=getdays(leaveBob, months);
        int start=Math.max(alicearrive,bobarrive);
        int end=Math.min(aliceleave,bobleave);
        return Math.max(0,end-start+1);

    }
    private static int getdays(String date,int[] months){
        int day=Integer.parseInt(date.substring(3));
        int month=Integer.parseInt(date.substring(0,2));
        int totaldays=day;
        for(int i=0;i<month-1;i++){
            totaldays+=months[i];
        }
        return totaldays;
    }
}
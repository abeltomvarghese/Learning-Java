package com.company.Transport;

public class Passenger extends Person implements Comparable{

    private int memberLevel;
    private int memberDays;
    String name;

    public Passenger(String name) {
        super(name);

    }

    @Override
    public int compareTo(Object o) {
        int flag;
        Passenger p = (Passenger) o;

        if (memberLevel > p.memberLevel) {
            flag = -1;
        } else if (memberLevel < p.memberLevel) {
            flag = 1;
        } else {
            if (memberDays > p.memberDays) {
                flag = -1;
            } else if (memberDays > p.memberDays) {
                flag = 1;
            } else {
                flag = 0;

            }
        }
        return flag;
    }

    public void setLevelDays (int level, int days) {
        this.memberDays = days;
        this.memberLevel = level;
    }

    public String getInfo() {
        return String.join(" ", Integer.toString(this.memberLevel),":",Integer.toString(this.memberDays));
    }


    public static class RewardProgram {
        private int memberLevel;
        private int memberDays;
        public int getLevel() {return memberLevel;}
        public int getDays() {return memberDays;}
        public void setLevel(int level) {this.memberLevel = level;}
        public void setDays(int days) {this.memberDays = days;}
    }

    private RewardProgram rewardProgram = new RewardProgram();

    public RewardProgram getRewardProgram() {
        return rewardProgram;
    }

}

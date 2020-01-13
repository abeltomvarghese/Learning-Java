package com.company.Transport;

public class Passenger implements Comparable{

    private int memberLevel;
    private int memberDays;

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
}

package com.company;

import java.util.ArrayList;

public interface ITelephone {
    void powerOn();
    void dial(int phoneNumber);
    //public void answer();
    void answer();
    boolean callPhone(int phoneNumber);
    boolean isRinging();


}

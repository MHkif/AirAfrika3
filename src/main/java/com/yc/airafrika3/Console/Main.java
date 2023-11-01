package com.yc.airafrika3.Console;

import com.yc.airafrika3.Console.Controllers.Navigator;
import com.yc.airafrika3.Utils.Session;

public class Main {
    public  static Session SESSION = Session.getInstance();

    public static void main(String[] args) {
        Navigator.INSTANCE().index();
    }

}

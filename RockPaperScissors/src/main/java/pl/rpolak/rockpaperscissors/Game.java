package pl.rpolak.rockpaperscissors;

import pl.rpolak.rockpaperscissors.match.bo.LogicBO;

/**
 * Created by Rafal Polak on 03.05.2018.
 */
public class Game {

    public static void main (String args[]){


        LogicBO logicBO = new LogicBO();

        logicBO.whoWin(0,3);
        logicBO.whoWin(1,1);
        logicBO.whoWin(1,4);
        logicBO.whoWin(2,3);
        logicBO.whoWin(4,3);

    }

}

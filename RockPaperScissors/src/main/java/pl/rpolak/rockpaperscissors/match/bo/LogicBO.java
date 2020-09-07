package pl.rpolak.rockpaperscissors.match.bo;

/**
 * Created by Rafal Polak on 03.05.2018.
 */
public class LogicBO implements ILogicBO {


    //This is representation of logic for extended game
    /*
    Player A / Player B
          	 Paper 	 Rock 	Scissors Lizard Spock
    Paper 	 (0,0) 	 (1,–1) (–1,1)   (-1,1) (1,-1)
    Rock 	 (–1,1)  (0,0) 	(1,–1)   (1,-1) (-1,1)
    Scissors (1,–1)  (–1,1) (0,0)   (1,-1) (-1,1)
    Lizard   (1,-1)  (-1,1) (-1,1)  (0,0)  (1,-1)
    Spock	 (-1,1)  (1,-1)	(1,-1)   (-1,1) (0,0)
     */

    int[][] resultsArray = {{0,0,1,-1,-1,1,-1,1,1-1},
                            {-1,1,0,0,1,-1,1,-1,-1,1},
                            {1,-1,-1,1,0,0,1,-1,-1,1},
                            {1,-1,-1,1,-1,1,0,0,1,-1},
                            {-1,1,1,-1,1,-1,-1,1,0,0}};

    //paper have 0,1
    //rock have 2,3 etc.


    @Override
    public String whoWin(int playerOne, int playerTwo) {
        System.out.println("test");

        int chooseA = playerOne;
        int chooseB = playerTwo;
        int coordinateA;
        int coordinateB;

        int choosePlayerOne;
        int choosePlayerTwo;

        if(chooseB == 0){
            coordinateA = 0;
            coordinateB = 1;
        }
        else if(chooseB == 1){
            coordinateA = 2;
            coordinateB = 3;
        }else if(chooseB == 2){
            coordinateA = 4;
            coordinateB = 5;
        }else if(chooseB == 3){
            coordinateA = 6;
            coordinateB = 7;
        }else{
            coordinateA = 8;
            coordinateB = 9;
        }

        choosePlayerOne = resultsArray[chooseA][coordinateA];
        choosePlayerTwo = resultsArray[chooseA][coordinateB];

        System.out.println("Co tam mamy: "+choosePlayerOne+" "+choosePlayerTwo);

        return "test";
    }
}

grammar csce322a01part02;

@members{

int countRows = 0;
int countColumns = 0;
int countMoves = 0;
int countMoveSection = 0;
int countGameSection = 0;
int countPlayers = 0;
int countWhiteSpace = 0;
int countUMoves = 0;
int countDMoves = 0;
int countLMoves = 0;
int countRMoves = 0;
int countTotalSpace = 0;
int countGameSpace =0;
double fracWhiteSpace =0;
int errorFound = 0;
}

main: extremePegSolitaire EOF;


// rules
extremePegSolitaire : gameSection moveSection{
                                            countTotalSpace = countWhiteSpace + countGameSpace;
                                            fracWhiteSpace = (double)countWhiteSpace/(double)countTotalSpace;
                                            if(countPlayers < 2 | countPlayers > 4){
                                            System.out.println("SEMANTIC PROBLEM 1");
                                            errorFound = 1;
                                            }
                                            if(fracWhiteSpace > .4){
                                            System.out.println("SEMANTIC PROBLEM 2");
                                            errorFound = 1;
                                            }
                                            if(countUMoves < 1 | countDMoves < 1 | countLMoves < 1 | countRMoves < 1){
                                            System.out.println("SEMANTIC PROBLEM 3");
                                            errorFound = 1;
                                            }
                                            if(errorFound == 0){
                                            System.out.println("There are " + countWhiteSpace +" empty spaces on the board");
                                            }}
               | moveSection gameSection{
                                            countTotalSpace = countWhiteSpace + countGameSpace;
                                            fracWhiteSpace = (double)countWhiteSpace/(double)countTotalSpace;
                                            if(countPlayers < 2 | countPlayers > 4){
                                            System.out.println("SEMANTIC PROBLEM 1");
                                            errorFound = 1;
                                            }
                                            if(fracWhiteSpace > .4){
                                            System.out.println("SEMANTIC PROBLEM 2");
                                            errorFound = 1;
                                            }
                                            if(countUMoves < 1 | countDMoves < 1 | countLMoves < 1 | countRMoves < 1){
                                            System.out.println("SEMANTIC PROBLEM 3");
                                            errorFound = 1;
                                            }
                                            if(errorFound == 0){
                                            System.out.println("There are " + countWhiteSpace +" empty spaces on the board");
                                            }};

gameSection:   GAME_SECTION_TITLE
           SECTION_BEGINNING
           GAME_BEGINNING
           fullGame
           SECTION_ENDING
           ;

moveSection:   MOVES_SECTION_TITLE
           SECTION_BEGINNING
           MOVES_BEGGINING
            moveMove moveMove moveMove moveMove moveMove+
           MOVES_ENDING
           SECTION_ENDING
           ;

fullGame:   fullRowEnding
            fullRowEnding
            fullRowEnding
            fullRowEnding
            fullRowEnding
            fullRowEnding
            fullRowEnding
            fullRowEnding
            fullRowEnding+
            fullGameEnding;

fullRowEnding: gameMove gameMove gameMove gameMove gameMove gameMove gameMove gameMove gameMove gameMove+ ROW_ENDING;

fullGameEnding: gameMove gameMove gameMove gameMove gameMove gameMove gameMove gameMove gameMove gameMove+ GAME_ENDING;

gameMove: GAME_SYMBOL {  if($GAME_SYMBOL.text.equals("-")){
                                        countWhiteSpace++;
                                  }else{
                                         if(!$GAME_SYMBOL.text.equals("-") && !$GAME_SYMBOL.text.equals("x")){
                                             countPlayers++;
                                         }
                                        countGameSpace++;
                                       }
                              };

moveMove: MOVE_SYMBOL{
                                    countMoves++;
                                    if($MOVE_SYMBOL.text.equals("u")){
                                    countUMoves++;
                                    }else if($MOVE_SYMBOL.text.equals("d")){
                                    countDMoves++;
                                    }else if($MOVE_SYMBOL.text.equals("l")){
                                    countLMoves++;
                                    }else if($MOVE_SYMBOL.text.equals("r")){
                                    countRMoves++;
                                    }};

// tokens
SECTION_BEGINNING: '>>' ;
SECTION_ENDING: '<<' ;
MOVES_SECTION_TITLE:'!moves';
GAME_SECTION_TITLE: '!game';
MOVE_SYMBOL: 'u' | 'd' | 'l' | 'r';
GAME_SYMBOL: '-' | 'x' | NUMERICAL_SYMBOL+;
NUMERICAL_SYMBOL: [0-9];
ROW_ENDING: '*';
GAME_BEGINNING: '{';
GAME_ENDING: '}';
MOVES_BEGGINING: '^';
MOVES_ENDING: '$';
WHITE_SPACE: [ \t\r\n,]+ -> skip ;


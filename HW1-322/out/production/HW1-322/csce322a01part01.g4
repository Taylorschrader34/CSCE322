grammar csce322a01part01;




@member{

}
main: extremePegSolitaire  EOF;


// rules
extremePegSolitaire : gameSection moveSection{System.out.println("End the File");}
                   | moveSection gameSection{System.out.println("End the File");};

gameSection:   GAME_SECTION_TITLE{System.out.println("game Section");}
               SECTION_BEGINNING{System.out.println("Begin the Section");}
               GAME_BEGINNING{System.out.println("Start the Game");}
               fullGame
               SECTION_ENDING {System.out.println("End the Section");}
               ;

moveSection:   MOVES_SECTION_TITLE{System.out.println("moves Section");}
               SECTION_BEGINNING{System.out.println("Begin the Section");}
               MOVES_BEGGINING{System.out.println("Begin the List");}
               (MOVE_SYMBOL{System.out.println("Move: " + $MOVE_SYMBOL.text);})*
               MOVES_ENDING{System.out.println("End the List");}
               SECTION_ENDING{System.out.println("End the Section");}
               ;

fullGame:   fullRow+;

fullRow:    (GAME_SYMBOL{  if($GAME_SYMBOL.text.equals("-")){
                                System.out.println("Space: Empty");
                            }else{
                                System.out.println("Space: " + $GAME_SYMBOL.text);
                                 }
                        })* ROW_ENDING{System.out.println("End the Row");}

       |    (GAME_SYMBOL{  if($GAME_SYMBOL.text.equals("-")){
                                System.out.println("Space: Empty");
                            }else{
                                System.out.println("Space: " + $GAME_SYMBOL.text);
                                }
                        })* GAME_ENDING{System.out.println("End the Game");}
       ;


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


module.exports = {
    manyPlayersManyMoves: manyPlayersManyMoves
}

var helpers = require('./helpers');

function manyPlayersManyMoves(game) {

    function whatever(moves) {
        var currentPlayer = 1;
        var playerCount = helpers.findPlayers(game);
        var movesCounter = 0;

        while (movesCounter < moves.length) {
            for (var i = 0; i < game.length; i++) {
                for (var j = 0; j < game[0].length; j++) {
                    if (game[i][j] == currentPlayer) {
                        if (moves[movesCounter] == 'u' && i - 2 >= 0 && game[i - 1][j] == 'x' && game[i - 2][j] == 'x' ) {
                            game[i][j] = 'x';
                            game[i - 1][j] = '-';
                            game[i - 2][j] = currentPlayer.toString();
                           // console.log('Made move #' + movesCounter + ' of ' + moves[movesCounter] + ' for player #' + currentPlayer);
                            if (currentPlayer < playerCount) {
                                currentPlayer++;
                            } else {
                                currentPlayer = 1;
                            }
                            movesCounter++;
                        } else if (moves[movesCounter] == 'd' && i + 2 <= game.length - 1 && game[i + 1][j] == 'x' && game[i + 2][j] == 'x' ) {
                            game[i][j] = 'x';
                            game[i + 1][j] = '-';
                            game[i + 2][j] = currentPlayer.toString();
                           // console.log('Made move #' + movesCounter + ' of ' + moves[movesCounter] + ' for player #' + currentPlayer);
                            if (currentPlayer < playerCount) {
                                currentPlayer++;
                            } else {
                                currentPlayer = 1;
                            }
                            movesCounter++;
                        } else if (moves[movesCounter] == 'l' && j - 2 >= 0 && game[i][j - 1] == 'x' && game[i][j - 2] == 'x') {
                            game[i][j] = 'x';
                            game[i][j - 1] = '-';
                            game[i][j - 2] = currentPlayer.toString();
                           // console.log('Made move #' + movesCounter + ' of ' + moves[movesCounter] + ' for player #' + currentPlayer);
                            if (currentPlayer < playerCount) {
                                currentPlayer++;
                            } else {
                                currentPlayer = 1;
                            } movesCounter++;
                        } else if (moves[movesCounter] == 'r' && j + 2 <= game[0].length - 1 && game[i][j + 1] == 'x' && game[i][j + 2] == 'x' ) {
                            game[i][j] = 'x';
                            game[i][j + 1] = '-';
                            game[i][j + 2] = currentPlayer.toString();
                           // console.log('Made move #' + movesCounter + ' of ' + moves[movesCounter] + ' for player #' + currentPlayer);
                            if (currentPlayer < playerCount) {
                                currentPlayer++;
                            } else {
                                currentPlayer = 1;
                            } movesCounter++;
                        } else {
                           // console.log('Made move #' + movesCounter + ' of ' + moves[movesCounter] + ' for player #' + currentPlayer + ' ERROR ');
                            if (currentPlayer < playerCount) {
                                currentPlayer++;
                            } else {
                                currentPlayer = 1;
                            } movesCounter++;
                        }

                    }
                }
            }
        }
        return game;
    }

    return whatever;
}

module.exports = {
    manyPlayersOneMove: manyPlayersOneMove
}

var helpers = require('./helpers');

function manyPlayersOneMove(game) {

    function whatever(moves) {
        var currentPlayer = 1;
        var playerCount = helpers.findPlayers(game);
        var movesCounter = 0;


        while (currentPlayer <= playerCount) {
            for (var i = 0; i < game.length; i++) {
                for (var j = 0; j < game[0].length; j++) {
                   // console.log('I am checking if this: ' + game[i][j] + ' is ' + currentPlayer);
                    if (game[i][j] == currentPlayer) {
                        //console.log('I am checking move #' + movesCounter + ' of ' + moves[movesCounter] + ' for player #' + currentPlayer);

                        if (moves[movesCounter] == 'u' && i - 2 >= 0 && game[i - 1][j] == 'x' && game[i - 2][j] == 'x') {
                            game[i][j] = 'x';
                            game[i - 1][j] = '-';
                            game[i - 2][j] = currentPlayer.toString();
                            //console.log('Made move #' + movesCounter + ' of ' + moves[movesCounter] + ' for player #' + currentPlayer);
                            currentPlayer++;
                            movesCounter++;
                        } else if (moves[movesCounter] == 'd' && i + 2 <= game.length - 1 && game[i + 1][j] == 'x' && game[i + 2][j] == 'x') {
                            game[i][j] = 'x';
                            game[i + 1][j] = '-';
                            game[i + 2][j] = currentPlayer.toString();
                            //console.log('Made move #' + movesCounter + ' of ' + moves[movesCounter] + ' for player #' + currentPlayer);
                            currentPlayer++;
                            movesCounter++;
                        } else if (moves[movesCounter] == 'l' && j - 2 >= 0 && game[i][j - 1] == 'x' && game[i][j - 2] == 'x') {
                            game[i][j] = 'x';
                            game[i][j - 1] = '-';
                            game[i][j - 2] = currentPlayer.toString();
                           // console.log('Made move #' + movesCounter + ' of ' + moves[movesCounter] + ' for player #' + currentPlayer);
                            currentPlayer++;
                            movesCounter++;
                        } else if (moves[movesCounter] == 'r' && j + 2 <= game[0].length - 1 && game[i][j + 1] == 'x' && game[i][j + 2] == 'x') {
                            game[i][j] = 'x';
                            game[i][j + 1] = '-';
                            game[i][j + 2] = currentPlayer.toString();
                           // console.log('Made move #' + movesCounter + ' of ' + moves[movesCounter] + ' for player #' + currentPlayer);
                            currentPlayer++;
                            movesCounter++;
                        } else {
                            //console.log('Made move #' + movesCounter + ' of ' + moves[movesCounter] + ' for player #' + currentPlayer + " ERROR ");
                            currentPlayer++;
                            movesCounter++;
                        }
                    }
                }
            }
        }
        return game;
    }

    return whatever;
}
